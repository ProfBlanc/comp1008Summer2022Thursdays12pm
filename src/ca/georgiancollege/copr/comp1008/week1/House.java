package ca.georgiancollege.copr.comp1008.week1;

public class House {

    /*
      Task: attempt to code the attributes and actions of House
            attributes
                # of rooms
                sqft
                style: townhome, detached
                price
                height
                # of floors
                storeys
                location
            actions
                add floor: change # floors, change height
                buy: evaluate the price
                renovation: change home style
                add rooms: increase number of rooms
                sell: evaluate/change price

        I'll be back at 14:15 to take it up
     */

    public String colour, style, location;
    public float squareFoot, price;
    public int size, height, floors, storeys;

    public float buy()
    {
        return price=+100000;
    }
    public void addFloors()
    {
        if(floors < 5)
            floors += 1;
        if(floors > 5)
            floors -= 1;
    }


}
