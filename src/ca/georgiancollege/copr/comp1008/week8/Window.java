package ca.georgiancollege.copr.comp1008.week8;

public interface Window {

    public int WINDOW_MAX_WIDTH = 100;
    int WINDOW_MAX_HEIGHT = 100;

    double getWindowHeight();
    double getWindowWidth();
    boolean isWindowBroken(float scratchSize);
    void isWindowSeepingAir(String season, double temperature);

}
