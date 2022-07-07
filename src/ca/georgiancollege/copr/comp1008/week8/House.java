package ca.georgiancollege.copr.comp1008.week8;

public class House extends Room implements Window{

    double windowHeight, windowWidth;

    @Override
    public String roomPurpose() {
        return "Relax";
    }

    @Override
    boolean doesRoomHaveGreatView(int floorNumber) {
        return floorNumber > 10;
    }

    public House(){}

    public House(String name, double roomWidth, double roomHeight, double roomLength, double windowHeight) {
        super(name, roomWidth, roomHeight, roomLength);
    }

    @Override
    public double getWindowHeight() {
        return windowHeight;
    }

    @Override
    public double getWindowWidth() {
        return windowWidth;
    }

    @Override
    public boolean isWindowBroken(float scratchSize) {
        return scratchSize > 5;
    }

    @Override
    public void isWindowSeepingAir(String season, double temperature) {
            //TODO: write something sensible here
    }
}
