import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CentralControlSystem centralControlSystem = new CentralControlSystem();
        centralControlSystem.loadHouseInformation();

        boolean programActive = true;
        while (programActive) {

            centralControlSystem.loadMenu();

            int userInput = scanner.nextInt();
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