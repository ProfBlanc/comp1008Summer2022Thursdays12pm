package ca.georgiancollege.copr.comp1008.week8;

public abstract class Room {

    private String name;
    private double roomWidth, roomHeight, roomLength;

    //abstract methods
    public abstract String roomPurpose();

    abstract boolean doesRoomHaveGreatView(int floorNumber);

    public Room(){}

    public Room(String name, double roomWidth, double roomHeight, double roomLength) {
        this.name = name;
        this.roomWidth = roomWidth;
        this.roomHeight = roomHeight;
        this.roomLength = roomLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public double getRoomHeight() {
        return roomHeight;
    }

    public void setRoomHeight(double roomHeight) {
        this.roomHeight = roomHeight;
    }

    public double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(double roomLength) {
        this.roomLength = roomLength;
    }
}
