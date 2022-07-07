package ca.georgiancollege.copr.comp1008.week2;

public class BoxRunner {

    public static void main(String[] args) {
        boxExample();
        BoxRunner.boxExample();

        BoxRunner boxRunner = new BoxRunner();
        boxRunner.normalMethod();
         }
    void normalMethod(){}

    static void boxExample(){
             Box b1 = new Box();
             b1.color = "Green";
             System.out.println(b1.color);

             b1.setDimension(987);
             System.out.println(b1.getDimension());

             Box b2 = new Box("color", true, false);

         }

}
