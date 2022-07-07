package ca.georgiancollege.copr.comp1008.week1;

public class Car {
    /*
            Car
            attributes
                make
                model
                color
                speed
                ignition: boolean
                headlight status: boolean
            actions
                movement: evaluate speed
                turn on: evaluate ignition status
                break: lower SPEED
                turn on lights: evaluate headlight status
     */
        //attributes
        //instance variable: a characteristic or attribute that can be modified from one object to another
        //accessibility level   data type   name    [ = value]
    public String make, model, color;
    public float speed;
    public boolean ignition, healightStatus;
        //actions
        //methods
        //accessibility level   return data type    name of method ([arguments])
    public void movement(){
        speed += 15;
    }

    /**
     * Turn on the car and return a value if the car was successfully turned on.
     * If car already on, return false, else return true
     * Ensure that ignition is set to true
     * @return whether or not the car went from being off to being on
     */
    public boolean turnOn(){
        if(ignition){
            return false;
        }
        else{
            ignition = true;
            return true;
        }

    }
    //public void slowDown(){}
    //public boolean turnOnLights(){}
}
