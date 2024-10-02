public class SprinklerSystem implements Device {
    private boolean isOn = false;

    public SprinklerSystem() {
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("The sprinklerSystem has been activated!");
    }

    @Override
    public void turnOff(){
        isOn = false;
        System.out.print("------------------------------------------------------------------------------------------------------\nThe sprinklerSystem has been turned off ");
    }
}