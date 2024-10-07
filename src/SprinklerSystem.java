public class SprinklerSystem implements Device {
    private boolean isOn = false;

    public SprinklerSystem() {
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff(){
        isOn = false;
    }
}