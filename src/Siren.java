public class Siren implements Device {
    private static boolean isOn;

    public Siren(){
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("The siren is making: LOUD NOISES!");
    }

    @Override
    public void turnOff() {
        if (!this.isOn) {
            System.out.println("------------------------------------------------------------------------------------------------------\nThe siren is already off");
        } else {
            this.isOn = false;
            System.out.println("------------------------------------------------------------------------------------------------------\nThe siren has been turned off");
        }
    }

    public static boolean getSirenStatus() {
        return isOn;
    }
}