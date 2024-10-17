import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Detector> doorDetectors;
    private ArrayList<Detector> windowDetectors;
    private SmokeDetector smokeDetector;
    private MotionDetector motionDetector;
    private Sprinkler sprinkler;

    public Room(String name) {
        this.name = name;
        this.doorDetectors = new ArrayList<>();
        this.windowDetectors = new ArrayList<>();
    }

    public void turnOnAllDetectors() {
        for (Detector doorDetector : doorDetectors) {
            doorDetector.turnOn();
        }
        for (Detector windowDetector : windowDetectors) {
            windowDetector.turnOn();
        }
        if (motionDetector != null) {
            motionDetector.turnOn();
        }
    }

    public void turnOffDetectors() {
        for (Detector doorDetector : doorDetectors) {
            doorDetector.turnOff();
        }
        for (Detector windowDetector : windowDetectors) {
            windowDetector.turnOff();
        }
        if (motionDetector != null) {
            motionDetector.turnOff();
        }
    }

    public String getName() {
        return name;
    }

    public SmokeDetector getSmokeDetector() {
        return smokeDetector;
    }

    public void setSmokeDetector(SmokeDetector smokeDetector) {
        this.smokeDetector = smokeDetector;
    }

    public ArrayList<Detector> getDoorDetectors() {
        return doorDetectors;
    }

    public ArrayList<Detector> getWindowDetectors() {
        return windowDetectors;
    }

    public MotionDetector getMotionDetector() {
        return motionDetector;
    }

    public void setMotionDetector(MotionDetector motionDetector) {
        this.motionDetector = motionDetector;
    }

    public Sprinkler getSprinkler() {
        return sprinkler;
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }
}