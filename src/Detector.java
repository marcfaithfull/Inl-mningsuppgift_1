public class Detector implements Device {
    private String name;
    private boolean isOn = false;

    public Detector(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}