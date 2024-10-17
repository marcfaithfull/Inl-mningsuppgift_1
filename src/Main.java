import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CentralControlSystem centralControlSystem = new CentralControlSystem();

        //HouseInfo
        {
            Room bedroomOne = new Room("bedroom 1");
            centralControlSystem.getRooms().add(bedroomOne);

            Detector bedroomOneDoor = new Detector("The door detector in ");
            bedroomOne.getDoorDetectors().add(bedroomOneDoor);

            Detector bedroomOneWindowOne = new Detector("Window detector 1 in ");
            bedroomOne.getWindowDetectors().add(bedroomOneWindowOne);

            Detector bedroomOneWindowTwo = new Detector("Window detector 2 in ");
            bedroomOne.getWindowDetectors().add(bedroomOneWindowTwo);

            SmokeDetector bedroomOneSmoke = new SmokeDetector("The smoke detector in bedroom 1");
            bedroomOne.setSmokeDetector(bedroomOneSmoke);

            Sprinkler bedroomOneSprinkler = new Sprinkler("The sprinkler in bedroom 1");
            bedroomOne.setSprinkler(bedroomOneSprinkler);

            //

            Room bedroomTwo = new Room("bedroom 2");
            centralControlSystem.getRooms().add(bedroomTwo);

            Detector bedroomTwoDoor = new Detector("The door detector in ");
            bedroomTwo.getDoorDetectors().add(bedroomTwoDoor);

            Detector bedroomTwoWindow = new Detector("The window detector in ");
            bedroomTwo.getWindowDetectors().add(bedroomTwoWindow);

            SmokeDetector bedroomTwoSmoke = new SmokeDetector("The smoke detector in bedroom 2");
            bedroomTwo.setSmokeDetector(bedroomTwoSmoke);

            Sprinkler bedroomTwoSprinkler = new Sprinkler("The sprinkler in bedroom 2");
            bedroomTwo.setSprinkler(bedroomTwoSprinkler);

            //

            Room bedroomThree = new Room("bedroom 3");
            centralControlSystem.getRooms().add(bedroomThree);

            Detector bedroomThreeDoor = new Detector("The door detector in ");
            bedroomThree.getDoorDetectors().add(bedroomThreeDoor);

            Detector bedroomThreeWindow = new Detector("The window detector in ");
            bedroomThree.getWindowDetectors().add(bedroomThreeWindow);

            SmokeDetector bedroomThreeSmoke = new SmokeDetector("The smoke detector in bedroom 3");
            bedroomThree.setSmokeDetector(bedroomThreeSmoke);

            Sprinkler bedroomThreeSprinkler = new Sprinkler("The sprinkler in bedroom 3");
            bedroomThree.setSprinkler(bedroomThreeSprinkler);

            //

            Room bedroomFour = new Room("bedroom 4");
            centralControlSystem.getRooms().add(bedroomFour);

            Detector bedroomFourDoor = new Detector("The door detector in ");
            bedroomFour.getDoorDetectors().add(bedroomFourDoor);

            Detector bedroomFourWindowOne = new Detector("Window detector 1 in ");
            bedroomFour.getWindowDetectors().add(bedroomFourWindowOne);

            Detector bedroomFourWindowTwo = new Detector("Window detector 2 in ");
            bedroomFour.getWindowDetectors().add(bedroomFourWindowTwo);

            SmokeDetector bedroomFourSmoke = new SmokeDetector("The smoke detector in bedroom 4");
            bedroomFour.setSmokeDetector(bedroomFourSmoke);

            Sprinkler bedroomFourSprinkler = new Sprinkler("The sprinkler in bedroom 4");
            bedroomFour.setSprinkler(bedroomFourSprinkler);

            //

            Room bedroomFive = new Room("bedroom 5");
            centralControlSystem.getRooms().add(bedroomFive);

            Detector bedroomFiveDoor = new Detector("The door detector in ");
            bedroomFive.getDoorDetectors().add(bedroomFiveDoor);

            Detector bedroomFiveWindow = new Detector("Window detector 1 in ");
            bedroomFive.getWindowDetectors().add(bedroomFiveWindow);

            SmokeDetector bedroomFiveSmoke = new SmokeDetector("The smoke detector in bedroom 5");
            bedroomFive.setSmokeDetector(bedroomFiveSmoke);

            Sprinkler bedroomFiveSprinkler = new Sprinkler("The sprinkler in bedroom 5");
            bedroomFive.setSprinkler(bedroomFiveSprinkler);

            //

            Room kitchen = new Room("the Kitchen");
            centralControlSystem.getRooms().add(kitchen);

            Detector kitchenWindow = new Detector("the window detector in ");
            kitchen.getWindowDetectors().add(kitchenWindow);

            SmokeDetector kitchenSmoke = new SmokeDetector("the smoke detector in the kitchen");
            kitchen.setSmokeDetector(kitchenSmoke);

            Sprinkler kitchenSprinkler = new Sprinkler("The sprinkler in bedroom 5");
            kitchen.setSprinkler(kitchenSprinkler);

            //

            Room livingRoom = new Room("the living room");
            centralControlSystem.getRooms().add(livingRoom);

            Detector livingRoomDoor = new Detector("The door detector in the ");
            livingRoom.getDoorDetectors().add(livingRoomDoor);

            Detector livingRoomWindowOne = new Detector("Window detector 1 in ");
            livingRoom.getWindowDetectors().add(livingRoomWindowOne);

            Detector lvingRoomWindowTwo = new Detector("Window detector 2 in ");
            livingRoom.getWindowDetectors().add(lvingRoomWindowTwo);

            MotionDetector livingRoomMotion = new MotionDetector("The motion detector in ");
            livingRoom.setMotionDetector(livingRoomMotion);

            SmokeDetector livingRoomSmoke = new SmokeDetector("The smoke detector in the living room");
            livingRoom.setSmokeDetector(livingRoomSmoke);

            Sprinkler livingRoomSprinkler = new Sprinkler("The sprinkler in bedroom 5");
            livingRoom.setSprinkler(livingRoomSprinkler);

            //

            Room hall = new Room("the hall");
            centralControlSystem.getRooms().add(hall);

            Detector hallDoor = new Detector("The door detector in ");
            hall.getDoorDetectors().add(hallDoor);

            Detector hallWindow = new Detector("The window detector in ");
            hall.getWindowDetectors().add(hallWindow);

            MotionDetector hallMotion = new MotionDetector("The motion detector in ");
            hall.setMotionDetector(hallMotion);

            SmokeDetector hallSmoke = new SmokeDetector("The smoke detector in the hall");
            hall.setSmokeDetector(hallSmoke);

            Sprinkler hallSprinkler = new Sprinkler("The sprinkler in hall");
            hall.setSprinkler(hallSprinkler);

            //

            Room garage = new Room("the garage");
            centralControlSystem.getRooms().add(garage);

            Detector garageDoorOne = new Detector("Door detector 1 in ");
            garage.getDoorDetectors().add(garageDoorOne);

            Detector garageDoorTwo = new Detector("Door detector 2 in ");
            garage.getDoorDetectors().add(garageDoorTwo);

            Detector garageWindow = new Detector("The window detector in ");
            garage.getWindowDetectors().add(garageWindow);

            SmokeDetector garageSmoke = new SmokeDetector("The smoke detector in the garage");
            garage.setSmokeDetector(garageSmoke);

            Sprinkler garageSprinkler = new Sprinkler("The sprinkler in the garage");
            garage.setSprinkler(garageSprinkler);

            //

            Room poolArea = new Room("the pool area");
            centralControlSystem.getRooms().add(poolArea);

            MotionDetector poolAreaMotion = new MotionDetector("The motion detector in ");
            poolArea.setMotionDetector(poolAreaMotion);
        }

        Scanner scanner = new Scanner(System.in);

        boolean programActive = true;
        while (programActive) {

            centralControlSystem.loadMenu();

            int userInput = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------");
            switch (userInput) {
                case 1:
                    centralControlSystem.activateDetectors();
                    break;
                case 2:
                    centralControlSystem.deactivateDetectors();
                    break;
                case 3:
                    centralControlSystem.simulateDetection();
                    break;
                case 4:
                    centralControlSystem.simulateFire();
                    break;
                case 5:
                    centralControlSystem.turnOffSprinkler();
                    break;
                case 6:
                    centralControlSystem.turnOffSiren();
                    break;
                case 7:
                    programActive = false;
                    break;
            }
        }
    }
}