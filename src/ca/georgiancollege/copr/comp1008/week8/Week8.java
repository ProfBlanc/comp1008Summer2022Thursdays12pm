package ca.georgiancollege.copr.comp1008.week8;

public class Week8 {

    public static void main(String[] args) {

        /*
            brand new computer

            components for my computer
                new ssd
                new battery
                new ac adpater


            computer - component
                external
                    usb
                        camera
                        memory stick
                        hd
                internal
                    motherboard
                    hd
                    ram

            components: they don't work/exist/function WITHOUT being integrated

            parent/super class: it exists/functions/works as standalone

            Java

            internal components
                abstract class
                    an incomplete class
                    dedicated superclass
                        it cannot be instantiated by itself
                    uses
                        category
                        rule/regulation

                        Shape
                            a category => rules and regulations

                            Circle, Square, Rectangle

                    can have abstract methods
                        a method that has no default implementation

                        Shape:
                            area
                            perimeter

                    features
                        have the exact same capabilities of concrete class + create abstract methods

            external components
                interface
                    list of requirements
                        "You need to do this...and that...and this again"
                        a list of method declarations
                            have no default implementation
                        constant values



         */

        /*
            Me: Type out an object
            You: Tell me if object should to
                an abstract class
                an interface
                a concrete class

                1) Does this object exist/function by itself?
                2) Is this object an internal component or external component of a bigger object?

        Objects

        1) Leaf
        2) Hair
        3) Tree
        4) Blood
        5) Room
        6) Window
        7) Wheel
        8) House



        Game #2:
        Me: Type out a feature
        You: is this feature possible in
            an abstract class
            an interface
            a concrete class

            * multiple options possible *


         1) instance variable
         2) constant values
         3) methods with default implementation (with method bodies)
         4) Constructors
         5) method with no default implementation (no method body) aka (only method declaration) aka (only method signature)

         */



        /*

        Window: interface
        Room: abstract class
        House: concrete

        Implementation: no behaviour (body), you are to write/implement a method body

        Overload: adding a variation to the behaviour
        Override: changing the behaviour

        Polymorphism: poly = many, morphism: forms/bodies

         */

        System.out.println("hello"  == "hello");
        System.out.println("hello".equals("hello"));
        int num = 1;
        //System.out.println(num.equals(1));

    }

}
