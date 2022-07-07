package ca.georgiancollege.copr.comp1008.week2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {

        /*
        Person
            isAdult()
        Person.isAdult()
         */
        //ifStatements();
        //switchStatements();
        loops();
    }
    static void example1(){
        Cellphone c1 = new Cellphone();
        System.out.println(c1.getStorageSpace());
        c1.setStorageSpace(50);
        System.out.println(c1.getStorageSpace());
        c1.setStorageSpace(5000);
        System.out.println(c1.getStorageSpace());

        Cellphone c2 = new Cellphone("LG", "blue");
        Cellphone c3 = new Cellphone("HTC", "red",
                5000, 2000);
        //promotion: lower data type as a value for a higher data type

    }
    static void ifStatements(){

        /*
            Ask user for an age
                determine which school they are attending based on age
                0-4
                    no school
                5-11: primary school
                12-13: middle school
                14-18: high school
                18+ post-secondary school
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        String school = "";
        if(age >= 0 && age <=4)
            school = "no school";
        else if ( age >= 5 && age <= 11)
            school = "primary school";
        else if ( age >= 12 && age <= 13)
            school = "middle school";
        else if ( age >= 14 && age <= 18)
            school = "high school";
        else if ( age >= 18)
            school = "post-secondary school";

        System.out.printf("You, a person of %d years old are attending %s%n", age, school);
        System.out.println("You, a person of "+age+" years old are attending "+school);
        //print formatting
        /*
            create a script. have placeholders
                %
                    d
                        digit
                    f
                        float
                    s
                        string

                    n
                        new line character
         */

    }
    static void switchStatements(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the level of schooling");
        String school = input.nextLine();
        switch (school.toLowerCase()){

            case "primary school":
            case "grade school":
                System.out.println("You are between 5-11");
                break;
            case "no school":
                System.out.println("You are between 0-4");
                break;
            case "middle school":
                System.out.println("You are between 12-13");
                break;
            case "high school":
                System.out.println("You are between 14-18");
                break;
            case "post-secondary school":
                System.out.println("You are 18+");
                break;
            default:
                System.out.println("We do not know!");
        }

    }
    static void enhancedSwitchStatements(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the level of schooling");
        String school = input.nextLine();

        Object output = switch (school.toLowerCase()){

            case "primary school", "grade school":
               yield "You are between 5-11";
            case "no school":
                yield 0;
            case "middle school":
                yield 12.5;
            case "high school":
                yield "You are between 14-18";
            case "post-secondary school":
                yield "You are 18+";
            default:
                yield "We do not know!";
        };
        System.out.printf("Result = %s%n", output);

    }
    static void loops(){
        /*
            3 components
                start
                finish
                progress from start to finish

            for
            while
            do-while
            enhanced for loop aka foreach loop
         */

        for(int i = 0; i <=100; i++){
            System.out.println(i);
        }
        System.out.println();
        int i = 100;

        while(i >= 0){
            System.out.println(i);
            i -= 25;
        }
        System.out.println();

        do{
            System.out.println(i);
            i += 5;
        }while(i > 0);

        while(i > 0){
            System.out.println(i);
            i += 5;
        }
    }

}

/*
Task 1
Create a class named Box
It has 3 instance variables that have unique data types and accessibility levels
Create a method in Box class that
takes one integral argument
Returns a boolean value
Create the getters and setters for the private instance variable

Task 2
Create a class named BoxRunner
It has a main method
It instantiates a Box object using the default constructor
It updates the value of the public instance variable
It outputs the value of the public instance variable
Updates value of private instance variable via the setters
Outputs value of private instance variable via getter

Task 3
Create 3 constructors in Box

Task 4
Use the 3 constructors to create 3 Box objects
Be back at 13:25 to continue
 */
