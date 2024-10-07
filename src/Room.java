import java.util.ArrayList;
import java.util.Random;

public class Room {
    private Random random = new Random();
    private String roomName;
    private ArrayList<Detector> detectors;

    public Room(String name) {
        this.roomName = name;
        this.detectors = new ArrayList<>();
    }

    public void addDetectors(String name) {
        Detector detector = new Detector(name);
        detectors.add(detector);
    }

    public String getRoomName() {
        return roomName;
    }

    public String getDetectorName() {
        int detection = random.nextInt(detectors.size());
        Detector detected = detectors.get(detection);
        return detected.getName();
    }
}