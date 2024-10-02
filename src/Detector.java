public class Detector implements Device {
    private String name;
    private boolean isOn = false;

    public Detector(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            System.out.println("------------------------------------------------------------------------------------------------------\nDetectors: ACTIVATED");
            isOn = true;
        } else {
            System.out.println("------------------------------------------------------------------------------------------------------\nThe detectors are already activated");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            System.out.println("------------------------------------------------------------------------------------------------------\nDetectors: DEACTIVATED");
            isOn = false;
        } else {
            System.out.println("------------------------------------------------------------------------------------------------------\nThe detectors are already deactivated");
        }
    }

    public boolean isOn() {
        return isOn;
    }
}