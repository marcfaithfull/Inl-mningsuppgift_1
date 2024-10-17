public class Sprinkler implements Device {
    private String name;
    private boolean isOn;

    public Sprinkler(String name) {
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.print("(((Sprinkler noises)))");
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}