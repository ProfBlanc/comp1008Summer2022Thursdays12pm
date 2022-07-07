package ca.georgiancollege.copr.comp1008.week8;

import java.util.ArrayList;

public class Container {

    ArrayList<Test> items = new ArrayList<>();

    public static void main(String[] args) {
        Container c = new Container();
        c.items.add(new Test());
        c.items.add(new Test());
        Test t = new Test();
        t.name = "Ben";
        c.items.add(t);
        int size = c.items.size();

        /*
        iterate through all items of instance of Collection (c)
        determine if name matches a specified value
         */
    }
}
