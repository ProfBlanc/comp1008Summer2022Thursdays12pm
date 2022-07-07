package ca.georgiancollege.copr.comp1008.week2;

public class Cellphone {

    /*
        accessibility
            hide or limit value
                default/package-private
                protected
                public
                private: only accessible in class

        attributes/characters
            screenSize
            ram
            color
            make
            storage space
            # speakers
            speaker in use
            microphone in use
            keyboard is on screen
            cellelar network is active

        actions
            calling: either micro or speaker in used & cell network active
            messaging: keyboard is on screen & cell network active

            playing music
            playing games



     */

    private float screenSize;
    private double ram;

    public String color;
    public String make;
    protected int something;
    double other;
    private byte speakers;
    private double storageSpace = 1024;

    private boolean speakerInUse;
    private boolean microphoneInUse;
    private boolean keyboardIsOnScreen;
    private boolean cellelarNetworkIsActive;

    //alt+insert


    public double getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(double storageSpace) {
        if(storageSpace >= 1024)
            this.storageSpace = storageSpace;
    }

    /*
                    calling: either micro or speaker in used & cell network active
                messaging: keyboard is on screen & cell network active

         */
    public void calling(){
        microphoneInUse = true;
        speakerInUse = true;
        cellelarNetworkIsActive = true;
    }
    private boolean isOnCall(){
        return microphoneInUse && speakerInUse && cellelarNetworkIsActive;
    }
    public void playMusic(){
        //!true         boolean value == false
        if(!isOnCall()){
            //change the attributes needed to play music
            speakerInUse = true;
        }
    }
    public void endCall(){
        microphoneInUse = false;
        speakerInUse = false;
        cellelarNetworkIsActive = false;
    }
    public void messaging(){
        keyboardIsOnScreen = true;
        cellelarNetworkIsActive = true;
    }

    public Cellphone(){} //default || no-arg constructor

    public Cellphone(String make, String color){
        this.make = make;
        this.color = color;
    }
    //alt+insert

    public Cellphone(String color, String make, double storageSpace, double ram) {
        this.ram = ram;
        this.color = color;
        this.make = make;
        this.storageSpace = storageSpace;
    }
    public Cellphone(double ram, String color, String make, double storageSpace) {
        this(color, make, storageSpace, ram);
    }
}
