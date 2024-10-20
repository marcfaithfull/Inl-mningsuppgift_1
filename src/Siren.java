public class Siren implements Device {
    private boolean isOn;

    public Siren(){
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("The siren is going: BEEP! BEEP! BEEP! BEEP! BEEP! BEEP! BEEP! BEEP!");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    public boolean getSirenStatus() {
        return isOn;
    }
}