import java.time.LocalTime;

public class Ticket {
    private String id;
    private String concertHall;
    private int eventCode;
    private LocalTime time;
    private boolean isPromo;
    private char stadiumSector;
    private double maxBackpackWeight;
    private final LocalTime creationTime;
    private Double price;

    // Full constructor with all fields
    public Ticket(String id, String concertHall, int eventCode, LocalTime time, boolean isPromo, char stadiumSector, double maxBackpackWeight) {
        this.id = id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxBackpackWeight = maxBackpackWeight;
        this.creationTime = LocalTime.now();
    }

    // Limited constructor with only concertHall, eventCode, and time
    public Ticket(String concertHall, int eventCode, LocalTime time) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.creationTime = LocalTime.now();
    }

    // Empty constructor
    public Ticket() {
        this.creationTime = LocalTime.now();
    }

    // Getters and setters (Lombok could be used here if allowed)
    public String getId() {
        return id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public int getEventCode() {
        return eventCode;
    }

    public LocalTime getTime() {
        return time;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public double getMaxBackpackWeight() {
        return maxBackpackWeight;
    }

    public LocalTime getCreationTime() {
        return creationTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
