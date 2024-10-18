import java.util.ArrayList;
import java.util.Random;

public class CentralControlSystem {
    private final ArrayList<Room> rooms;
    private final Siren siren;
    private final Random random = new Random();
    private boolean detectorsAreOn = false;
    private boolean sprinklersAreOn = false;

    public CentralControlSystem() {
        this.rooms = new ArrayList<>();
        this.siren = new Siren();
    }

    public void loadMenu() {
        System.out.print("----------------------------------------------------------------------------\nCENTRAL CONTROL SYSTEM  |  ");

        showDetectorStatus();
        showSirenStatus();
        showSprinklerStatus();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1] Activate the detectors");
        System.out.println("2] Deactivate the detectors");
        System.out.println("3] Simulate a new random detection");
        System.out.println("4] Simulate a new random fire");
        System.out.println("5] Turn off the sprinkler system");
        System.out.println("6] Turn off the siren");
        System.out.println("7] Exit");
        System.out.print("Option: ");
    }

    public void showSprinklerStatus(){
        if (sprinklersAreOn) {
            System.out.println("Sprinklers: ON");
        } else {
            System.out.println("Sprinklers: OFF");
        }
    }

    public void showSirenStatus() {
        if (siren.getSirenStatus()) {
            System.out.print("  |  Siren: ON  |  ");
        } else {
            System.out.print("  |  Siren: OFF  |  ");
        }
    }

    public void showDetectorStatus() {
        if (detectorsAreOn) {
            System.out.print("Detectors: ON");
        } else {
            System.out.print("Detectors: OFF");
        }
    }

    public void activateDetectors() {
        if (detectorsAreOn) {
            System.out.println("The detectors are already on");
        } else {
            for (Room room : rooms) {
                room.turnOnAllDetectors();
            }
            System.out.println("The detectors have been: ACTIVATED");
            detectorsAreOn = true;
        }
    }

    public void deactivateDetectors() {
        if (!detectorsAreOn) {
            System.out.println("The detectors are already off");
        } else {
            for (Room room : rooms) {
                room.turnOffDetectors();
            }
            System.out.println("The detectors have been: DEACTIVATED");
            detectorsAreOn = false;
        }
    }

    public void simulateDetection() {
        boolean chooseDetector = true;
        if (detectorsAreOn) {
            switch (random.nextInt(3)) {

                case 0:
                    while (chooseDetector) {
                        ArrayList<Room> rooms = this.rooms;
                        int chosenRoom = random.nextInt(rooms.size());
                        Room oneRoomToRuleThemAll = rooms.get(chosenRoom);
                        ArrayList<Detector> doorDetectors = oneRoomToRuleThemAll.getDoorDetectors();
                        if (!doorDetectors.isEmpty()) {
                            int chosenDetector = random.nextInt(doorDetectors.size());
                            Detector doorDetector = doorDetectors.get(chosenDetector);
                            doorDetector.setOn(true);
                            System.out.println(doorDetector.getName() + oneRoomToRuleThemAll.getName() + " has been triggered");
                            siren.turnOn();
                            chooseDetector = false;
                        }
                    }
                    break;

                case 1:
                    while (chooseDetector) {
                        ArrayList<Room> rooms = this.rooms;
                        int chosenRoom = random.nextInt(rooms.size());
                        Room oneRoomToRuleThemAll = rooms.get(chosenRoom);
                        ArrayList<Detector> windowDetectors = oneRoomToRuleThemAll.getWindowDetectors();
                        if (!windowDetectors.isEmpty()) {
                            int chosenDetector = random.nextInt(windowDetectors.size());
                            Detector windowDetector = windowDetectors.get(chosenDetector);
                            windowDetector.setOn(true);
                            System.out.println(windowDetector.getName() + oneRoomToRuleThemAll.getName() + " has been triggered");
                            chooseDetector = false;
                            siren.turnOn();
                        }
                    }
                    break;

                case 2:
                    while (chooseDetector) {
                        ArrayList<Room> rooms = this.rooms;
                        int chosenRoom = random.nextInt(rooms.size());
                        Room oneRoomToRuleThemAll = rooms.get(chosenRoom);
                        MotionDetector motionDetector = oneRoomToRuleThemAll.getMotionDetector();
                        if (motionDetector != null) {
                            motionDetector.setOn(true);
                            System.out.println(motionDetector.getName() + oneRoomToRuleThemAll.getName() + " has been triggered");
                            chooseDetector = false;
                            siren.turnOn();
                        }
                    }
                    break;
            }
        } else {
            System.out.println("You need to activate the detectors before you can start this simulation");
        }
    }

    public void simulateFire() {
        boolean chooseRoom = true;
        while (chooseRoom) {
            int roomInt = random.nextInt(rooms.size());
            Room roomOnFire = rooms.get(roomInt);
            if (roomOnFire.getSmokeDetector() != null) {
                roomOnFire.getSmokeDetector().setOn(true);
                if (roomOnFire.getSmokeDetector().isOn()) {
                    System.out.println("There is a fire in " + roomOnFire.getName() + "!");
                    roomOnFire.getSprinkler().turnOn();
                    System.out.println(" are coming from " + roomOnFire.getName());
                    siren.turnOn();
                    sprinklersAreOn = true;
                    chooseRoom = false;
                }
            }
        }
    }

    public void turnOffSprinkler() {
        if (!sprinklersAreOn) {
            System.out.println("There are no sprinklers to turn off!");
        } else {
            for (Room room : rooms) {
                if (room.getSprinkler() != null && room.getSprinkler().isOn()) {
                    System.out.println("The sprinkler in " + room.getName() + " has been turned off");
                    room.getSprinkler().turnOff();
                    sprinklersAreOn = false;
                }
            }
        }
    }

    public void turnOffSiren() {
        if (siren.getSirenStatus()) {
            System.out.println("The siren has been turned off");
            siren.turnOff();
        } else {
            System.out.println("The siren is already off");
        }
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}