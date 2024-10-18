public class Sprinkler implements Device {
    private final String name;
    private boolean isOn;

    public Sprinkler(String name) {
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.print("(((Sprinkler sounds)))");
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

}