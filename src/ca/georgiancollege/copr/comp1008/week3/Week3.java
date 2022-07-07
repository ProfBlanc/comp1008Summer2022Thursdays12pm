package ca.georgiancollege.copr.comp1008.week3;

import java.util.Random;

public class Week3 {

    public static void main(String[] args) {
        //task3(22, 10, 4);
        //dataTypecasting();
        //workingWith1DArrays();
        //workingWith2DArrays();
        workingWithRandomObject();
    }
    static String task1(int age){

        String category = "";

        if(age > 18){
            category = "adult";
        }
        else if (age >=10 && age <=17)
            category = "teen";
        else
            category = "unknown";

        return category;
    }

    static String task2(int age){

        return switch (age){

            case 1, 2, 3, 4, 5:
                yield "child";
            case 100, 99, 98, 97, 96:
                yield "elder";
            default: yield "unknown";

        };
    }

    static void task3(int first, int second, int third){

        //always going to count up from the lowest number to the highest number

        //1     11      3
        //  1   4   7   10

        //  10      2       3

        //2     5       8

        int start = first < second ? first : second;
        int end = Math.max(first, second);

        for( ;  ; ){ //indeterminate loop.
            //write a statement that BREAKS out of the loop
            if(start > end)
                break;
            System.out.print(start + " ");

            //write a progress statement
            start+= Math.abs(third);
        }

    }

    static void dataTypecasting(){
        /*
            Def: changing from one data type to another
         */
        //any data type to a String
        String value = String.valueOf('A');

        //from a String to an integer
        int num1 = Integer.parseInt("123");

        //from a String to an Double
        double num2 = Double.parseDouble("123");

        //from a String to an Float
        float num3 = Float.parseFloat("123");

        /*
            numerical data types aka integral data types

            concept: literal
                create a value and do not associate it with a variable

         */
        System.out.println(123); //integer
        System.out.println(12.3); //double
        System.out.println(123f); //float literal
        System.out.println(1234F); //float literal
        System.out.println(123d); // double literal
        System.out.println(123D); // double literal

        //integral data types have a size associated with it
        //int: 32 bits, byte 8 bits, short 16 bits
        /*
            byte: 8 bits
                2 ^ 8
                    256
                        negative values.
                        non-negative values
                            128 negative values
                            128 non-negative value

                    upper range aka upper bound of
                        127
                            0-127 = 128 values

                    lower bound of -128
                        -1 to -128 - 128 values

            easily go from lower data type aka lower size to a higher data type
                promoting the value => promotion
                    implicitly typecasting the data


         */
        byte num4 = 100;
        short num5 = num4; //promoting value of num4 (byte) to short value
        //implicitly typecasting a byte to a short

        byte num6 = (byte)num5;
        //(targetDataType) value


        /*
            overflow

            130

            -128                            127


            short           byte

            127             127
            128             -128
            129             -127
            130             -126



            -130

            short           byte

            -128            -128
            -129            127
            -130            126
         */



        byte num7 = (byte)130;
        System.out.println(num7);

        task1(num7); //promotion aka implicitly typecasting

        long num8 = 100;
        task1( (int) num8); //passing a long data type iso int data type

        //orignal value = orignal data type             target value = target data type
        //best case scenario: orginal value is same as target value

        //Scenario: you explicitly typecast one value to another. BUT the
        //130 to byte

        //Object data type: data type that accepts all data type values

        Object anyValue = 1;
        anyValue = 1f;
        anyValue = 1d;
        //anyValue = true;

        boolean myBool = (boolean)anyValue;
        System.out.println(myBool);

    }
    /*
        overload: adds a variation to a method
            you overload a method
                1) Same method name
                    Varying/different
                        amount of method params
                        order of data types of method params

     */
    static void overloading(){

        double result1 = add(1, 2);
        double result2 = add((byte) 1, (byte)2);
        double result3 = add(1f, 2d, 3.0);
        double result4 = add((short)100, 123f, 345D);


    }

    static double add(byte num1, byte num2){
        return num1 + num2;
    }
    static double add(int num1, int num2){
        return num1 + num2;
    }
    static double add(byte num1, int num2){
        return num1 + num2;
    }
    static double add(int num1, byte num2){
        return num1 + num2;
    }
    static double add(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    //add 10 more variations of add(), totalling 11 overloads & 12 implementations
        //change order or data types
        //amount of data types


    static void workingWith1DArrays(){

        /*
            datatype[] nameOfArray = {values, separated, by, commas}

            datatype[] nameOfArray = new dataype[numberOfValues]

            fixed amount of values

            nameOfArray.length (property)

            index = position of a specified value

            0               lengthOfArray - 1

         */

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[5];

        /*
                arrays work similarly to Class instance variables
                    Reference data type: null
                    Primitive data type: zero, false
         */

        output1DArray(numbers2);

        //create an empty array of doubles with a 5 fixed values
        double[] numbers3 = new double[5];
        double[] numbers4 = {1, 2d, 3D, 4f, (byte)5.0, (short)6 };

        //overload output1DArray to output the double array using enhanced for loop
        output1DArray(numbers3);
        output1DArray(numbers4);

    }
    static void output1DArray(double[] array){
        for(double current : array){
            System.out.println(current);
        }
    }
    static void output1DArray(int[] array){

        //enhanced for loop: iterate through all values of array
        for(int currentValue : array){
            System.out.println(currentValue);
        }
        System.out.println("*".repeat(20));

        for(int i = 0; i < array.length; i++){

            String text = String.format("Index = %d, value = %d",
                    i, array[i]);

            System.out.println(text);
        }
    }

    static void workingWith2DArrays(){

        /*
            tabular data
                rows
                columns

            dataType[][] name = { {}, {}, {}  };
            dataType[][] name = new dataType[numRows][numColumns]
         */

        String[][] names = { {"Ben", "Jen"}, {"Mary", "Larry"} };
        String[][] empty = new String[2][2];

        System.out.println(names[1][0]);

        for(int rows = 0; rows < names.length; rows++){

            for(int columns = 0; columns < names[rows].length; columns++){
                System.out.println("Output something to get the column data!");
            }

        }

    }

    static void workingWithRandomObject(){

        Random random = new Random();
        int randomValueBetween0and10 = random.nextInt(11);
        int randomValueBetween100and200 = random.nextInt(100, 201);

        //how to get a random array value?
        int[] numbers = {
                random.nextInt(10),
                random.nextInt(11, 21),
                random.nextInt(30, 40)};

        System.out.println(  numbers[random.nextInt(numbers.length)]);

    }

}
