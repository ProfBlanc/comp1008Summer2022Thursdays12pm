package ca.georgiancollege.copr.comp1008.week6;

import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {
        //stringBuilder2();
        //task1();
        inheritance4();
    }
    static void stringBuilder1(){

        /*
            StringBuilder
                a true object to contain strings

            String
                technical an object reference data type
                used practical as a primitive data type
         */
        int num = 100;
        String name = "Ben";
        Week6 wk6 = new Week6();
        name += " Blanc";

    }
    static void stringBuilder2(){

        String s1 = new String();
        String ss1 = "";
        String s2 = new String("hello");
        String ss2 = "hello";

        //if String is a plastic cup
        //then StringBuilder is a water bottle
        //capacity(): soft limit of max characters
        //limit does expand if surpassed
        /*
            length(): # of chars
            capacity(): expandable max limit
         */
        StringBuilder sb1 = new StringBuilder();//length: 0, capacity: 16
        StringBuilder sb2 = new StringBuilder(20); //length: 0, capacity: 20
        StringBuilder sb3 = new StringBuilder("Hello World"); //length: 11, capacity: 27

        outputStringBuilder(sb3);

        sb3.append(12345);
        sb3.append('A');
        sb3.append(true);
        sb3.append("hi there"); //surpassed our capacity
        /*
            error: NOT expandable limit
            expand: YES
                formula: add 1 to current, then double
                27  + 1     x 2     56


         */


        sb3.insert(1, "1");
        sb3.replace(3, 6, "hey");
        sb3.deleteCharAt(10);

        String finalText = sb3.toString();

        outputStringBuilder(sb3);

    }
    static void outputStringBuilder(StringBuilder sb){

        System.out.printf("Content = '%s', length = %d, capacity = %d%n",
                sb.toString(), sb.length(), sb.capacity()
                );
    }

    static void task1(){

        Scanner input = new Scanner(System.in);
        StringBuilder data = new StringBuilder();
        System.out.println("Enter first name");
        data.append(input.nextLine()); //Ben
        System.out.println("Enter number");
        int number = input.nextInt(); //10 + enter key
                                      //10\n

        data.deleteCharAt(number);

        input.nextLine(); //consume nl character
        System.out.println("Enter last name");
        data.insert(0, input.nextLine() + ", ");  //Blanc, Ben

        System.out.println(data.toString());


    }

    static void inheritance1(){
        /*
            create a class by using another class as the starting point
                do it explictly using keyword extends

            Object class
                base class for every class
                    toString()
                    equals()

            Why use other class?
                Use the methods and instance variables in the older class
                    expand upon it
                    extend it

                What can be use
                    all non-private
                        instance variables
                        instance methods
                        default constructor

            When do we use inheritance

            upgrade to a class
            a more specific implementation of a class

            Windows 10          Windows 11

            Animal          Cat         Lion

            Terms

            Old                         New

            base                        derived
            super                       sub
            parent                      child


            extends
            super

         */

    }
    static void inheritance2(){

        Animal a1 = new Animal();
        Animal a2 = new Animal("Animal", 20, 150d);

        Cat c1 = new Cat();
        c1.teeth = 10;
        Cat c2 = new Cat("Cat", 10, 30d);

        a1.isScary(); // check if weight is > 200
        c1.isScary(); // check if weight is > 200 AND paws > 8

        Animal a3 = new Cat();
        //Cat       extends     Animal
        //Cat is an Animal....but with more features

        //Cat c3 = new Animal();
        //a3.paws//not avaialbe

        Animal[] animals = {
                new Cat(),
                new Animal(),
                a3,
                c1,
                c2
        };

        boolean result1 = animals[0] instanceof Cat;


        boolean result2 = animals[1] instanceof Cat;

        /*
                    object      instanceof      Class


         */


    }
    static void inheritance3(){

        Animal a1 = new Animal("Animal", 10, 150d);
        Cat c1 = new Cat("Cat", 15, 200d);

        System.out.println(a1);
        System.out.println(c1);

        String summary = a1.toString();

        //get a summary the contents of object
        //override the toString method


    }
    static void inheritance4(){

        Animal a1 = new Animal("A", 1, 2d);
        Animal a2 = new Animal("A", 1, 2d);
        Animal a3 = a1;

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
    }
    static void inheritance5(){}

}
