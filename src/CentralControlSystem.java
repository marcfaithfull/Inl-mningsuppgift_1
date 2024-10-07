import java.util.ArrayList;
import java.util.Random;

public class CentralControlSystem {

    private ArrayList<Room> rooms;
    private SprinklerSystem sprinklerSystem;
    private Room sprinkledRoom;
    private Siren siren;
    private Room newRoom;
    private Detector detector;

    public CentralControlSystem() {
        this.rooms = new ArrayList<>();
        this.sprinklerSystem = new SprinklerSystem();
        this.siren = new Siren();
        this.newRoom = new Room("newRoom");
        this.detector = new Detector("newDetector");
    }

    public void loadMenu() {
        System.out.print("------------------------------------------------------------------------------------------------------\nCENTRAL CONTROL SYSTEM   |   ");

        showDetectorStatus();
        showSirenStatus();
        showSprinklerStatus();

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("1] Activate the detectors");
        System.out.println("2] Deactivate the detectors");
        System.out.println("3] Simulate a new random detection");
        System.out.println("4] Simulate a new random fire");
        System.out.println("5] Turn off the sprinkler system");
        System.out.println("6] Turn off the siren");
        System.out.println("7] Exit");
        System.out.print("Option: ");
    }

    public void simulateDetection() {
        if (!detector.isOn()) {
            System.out.println("------------------------------------------------------------------------------------------------------\nYou must activate the detectors before you can start this simulation");
        } else {
            String detectorName = newRoom.getDetectorName();
            System.out.println("------------------------------------------------------------------------------------------------------\n" + detectorName + " has been triggered");
            turnOnSiren();
        }
    }

    public void simulateFire() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(rooms.size());
        Room pickedRoom = rooms.get(randomIndex);
        System.out.println("------------------------------------------------------------------------------------------------------\nA fire has been detected in " + pickedRoom.getRoomName());
        this.sprinkledRoom = pickedRoom;
        System.out.println("The sprinklerSystem has been activated!");
        sprinklerSystem.turnOn();
        siren.turnOn();
    }

    public void showSprinklerStatus() {
        if (sprinkledRoom == null) {
            System.out.println("   |   Sprinklers: OFF");
        } else {
            System.out.println("   |   Sprinklers: ON (in " + sprinkledRoom.getRoomName() + ")");
        }
    }

    public void showSirenStatus() {
        if (!siren.getSirenStatus()) {
            System.out.print("   |   Siren: OFF");
        } else {
            System.out.print("   |   Siren: ON");
        }
    }

    public void showDetectorStatus() {
        if (!detector.isOn()) {
            System.out.print("Detectors: OFF");
        } else {
            System.out.print("Detectors: ON");
        }
    }

    public void turnOffSprinkler() {
        if (sprinkledRoom == null) {
            System.out.println("------------------------------------------------------------------------------------------------------\nThe sprinkler is already off");
        } else {
            sprinklerSystem.turnOff();
            System.out.println("------------------------------------------------------------------------------------------------------\nThe sprinklerSystem has been turned off in " + sprinkledRoom.getRoomName());
            sprinkledRoom = null;
        }
    }

    public void activateDetectors(){
        if (!detector.isOn()) {
            System.out.println("------------------------------------------------------------------------------------------------------\nDetectors: ACTIVATED");
            detector.turnOn();
        } else {
            System.out.println("------------------------------------------------------------------------------------------------------\nThe detectors are already activated");
        }
    }

    public void deactivateDetectors() {
        if (detector.isOn()) {
            System.out.println("------------------------------------------------------------------------------------------------------\nDetectors: DEACTIVATED");
            detector.turnOff();
        } else {
            System.out.println("------------------------------------------------------------------------------------------------------\nThe detectors are already deactivated");
        }
    }

    public void turnOnSiren() {
        siren.turnOn();
    }

    public void turnOffSiren() {
        if (!this.siren.getSirenStatus()) {
            System.out.println("------------------------------------------------------------------------------------------------------\nThe siren is already off");
        } else {
            siren.turnOff();
            System.out.println("------------------------------------------------------------------------------------------------------\nThe siren has been turned off");
        }
    }

    public void addDetectors(String name) {
        newRoom.addDetectors(name);
    }

    public void loadHouseInformation() {

        Room bedroom1 = new Room("bedroom 1");
        rooms.add(bedroom1);

        Room bedroom2 = new Room("bedroom 2");
        rooms.add(bedroom2);

        Room bedroom3 = new Room("bedroom 3");
        rooms.add(bedroom3);

        Room bedroom4 = new Room("bedroom 4");
        rooms.add(bedroom4);

        Room bedroom5 = new Room("bedroom 5");
        rooms.add(bedroom5);

        Room kitchen = new Room("the Kitchen");
        rooms.add(kitchen);

        Room livingRoom = new Room("the living room");
        rooms.add(livingRoom);

        Room hall = new Room("the hall");
        rooms.add(hall);

        Room garage = new Room("the garage");
        rooms.add(garage);

        addDetectors("Window detector 1 in bedroom 1");
        addDetectors("Window detector 2 in bedroom 1");
        addDetectors("The door detector in bedroom 1");

        addDetectors("The window detector in bedroom 2");
        addDetectors("The door detector in bedroom 2");

        addDetectors("The window detector in bedroom 3");
        addDetectors("The door detector in bedroom 3");

        addDetectors("Window detector 1 in bedroom 4");
        addDetectors("Window detector 2 in bedroom 4");
        addDetectors("The door detector in bedroom 4");

        addDetectors("The window detector in bedroom 5");
        addDetectors("The door detector in bedroom 5");

        addDetectors("The window detector in the kitchen");

        addDetectors("The window detector in the living room");
        addDetectors("The door detector in the living room");
        addDetectors("The motion detector in the living room");

        addDetectors("The window detector in the hall");
        addDetectors("The door detector in the hall");
        addDetectors("The motion detector in the hall");

        addDetectors("The window detector in the garage");
        addDetectors("Door detector 1 in the garage");
        addDetectors("Door detector 2 in the garage");

        addDetectors("The motion detector in the pool area");
    }
}