package ca.georgiancollege.copr.comp1008.week9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Week9 {


    static Scanner input = new Scanner(System.in);

    static void example1(){

        /*
        What is an exception
            an error
                the program does not run from a-z. Does not complete execution
        errors happen. there's nothing to be ashamed of.
            when an error happens: the program quits.
                not good behaviour
        when error occurs, there should be a recovery

            try-catch blocks
                {}  => block

                try:
                    to execute code

                        using methods that may result in an error

                            getting user input
                            retrieving files/folders
                            retrieving resources such as databases, etc


                catch
                    recover from
                        an error

         */


        /*

            stack
                listing of all the methods called and executed

         */

    }
    static void example2(){
        System.out.print("Enter number: ");
        input.nextInt();
    }
    static void example3(){

        System.out.print("Enter number: ");

        try{
            int number = input.nextInt();
            System.out.println("You entered the number: " + number);

        }
        catch (InputMismatchException e){
            //serr+tab
            System.err.println("Error!");
        }
/*

        try{
            int number = input.nextInt();
            System.out.println("You entered the number: " + number);

        }
        catch (InputMismatchException e){
            //serr+tab
            System.err.println("Error!");
        }

        try{
            int number = input.nextInt();
            System.out.println("You entered the number: " + number);

        }
        catch (InputMismatchException e){
            //serr+tab
            System.err.println("Error!");
        }
        */




    }
    static void example4(){

        System.out.print("Enter number: ");

        try{
            int number = input.nextInt();
            System.out.println("You entered the number: " + number);
            int secondNumber = Integer.parseInt("abc");
            System.out.println("Second number = " + secondNumber);

        }
//        catch(Exception e){}
        catch (InputMismatchException e){
            //serr+tab
            System.err.println("Error!");
        }
        catch (NumberFormatException e){
            System.err.println("Invalid number is parseInt statement");
        }


    }
    static void example5(){

        System.out.print("Enter number: ");

        try{
            int number = input.nextInt();
            System.out.println("You entered the number: " + number);
            int secondNumber = Integer.parseInt("abc");
            System.out.println("Second number = " + secondNumber);

        }
        /*
        catch (InputMismatchException | NumberFormatException e){
            //serr+tab
            System.err.println("Error!");
        }
        */
        catch (Exception e){

            System.err.println("All errors are caught");
        }



    }
    static void example6(){

        /*
        ask the user for a number
        attempt to convert this number to an integer
            if impossble,
                give answer of "Sorry but the value of {what user inputted} could not be converted to a number
            if possible
                "you entered number {converted number}"
         */

        System.out.print("Enter an integer number: ");
        String userText = "";
        int convertedNumber = 0;

        try{
            userText = input.nextLine();
            convertedNumber = Integer.parseInt(userText);
            System.out.println("You entered number " + convertedNumber);
        }
        catch (NumberFormatException e){
            System.err.printf("Sorry but the value of '%s' could not be converted to a number%n", userText);

            String exceptionName = e.getClass().getSimpleName(); // NumberFormatException
            String message = e.getMessage();
            System.err.println(exceptionName + ":" + message);
        }

    }
    static void example7(){
        //evoke your own exception
        //ask user for an even number
            //if not a number of number is odd

        System.out.print("Enter a number: ");
        try{
            //open connection
            int number = input.nextInt();
            //thr+tab
            if(number % 2 == 1)
                throw new IllegalArgumentException(number + " is not even!!!");

            System.out.printf("The number %d is even! Thank you. %n", number);
        }
        catch (InputMismatchException e){
            System.err.println("Number not valid");
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("Run every single time. Used to release resources");
            //closing arguments
        }


    }
    static void example8(){
        System.out.print("Enter a number: ");
        try{
            //open connection
            int number = input.nextInt();
            //thr+tab
            if(number % 2 == 1)
                throw new NumberIsNotEvenException(number + " is not even!!!");

            System.out.printf("The number %d is even! Thank you. %n", number);
        }
        catch (InputMismatchException e){
            System.err.println("Number not valid");
        }
        catch (NumberIsNotEvenException e){
            System.err.println(e.getMessage());
        }

    }
    static void example9() throws NumberIsNotEvenException
    {
        throw new NumberIsNotEvenException("Hold on!");
    }
    static void example12() throws InputMismatchException
    {
        throw new InputMismatchException("Hold on!");
    }

    static void example11(){
        example12();
    }
    static void example10(){

        //throwing exception of Java.lang or java.util
        try {
            example9();
        }
        catch (NumberIsNotEvenException e){
            System.err.println(e);
        }
    }
    static void example13(){
        try{
            throw new Exception("No good!");
        }
        catch (Exception e){
            e.printStackTrace();

            System.out.println();
           StackTraceElement[] elements =  e.getStackTrace();
           for(StackTraceElement current : elements){

               String fileName = current.getFileName();
               int line = current.getLineNumber();
               String method = current.getMethodName();

               System.err.printf("Error on line %d of file %s using method %s%n", line, fileName, method);
           }
        }
    }
    static void example14(){
        //chain an exception

        try{

            try{
                throw new Exception("My product has a defect");
            }
            catch (Exception e){
                throw new Exception("You handle this", e);
            }


        }
        catch (Exception e){
            //System.err.println(e);
            e.printStackTrace();
        }
    }
    static void example15(){
        try {
            Animal a1 = new Animal("Lion");
            System.out.println(a1);
            Animal a2 = new Animal("bcd");
            System.out.println(a2);
        }
        catch (DoesNotContainVowel e){
            System.err.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        example15();
    }

    /*
            hard-code an array or arrayList of 3 double values
            ask user for an index number
            attempt to get the value located at the specified index
                if possible, output the value
                if not, output a message stating:
                    the name of the exception
                    the index that user inputted
                    a sorry message
     */


    /*
    Create a class named Animal
        1 String instance variable: name
        2 constructors
            default
            1 arg

        getter
        setter
            if the name does not contain a vowel
                throw an exception
                    custom exception
                unhandled inside of method
                but handled by the caller

     */

}
