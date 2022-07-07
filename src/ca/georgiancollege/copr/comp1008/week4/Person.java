package ca.georgiancollege.copr.comp1008.week4;

/**
 * Working with various components of a class
 * @author Ben Blanc
 * @author Best Friend
 * @since 2022-06-02
 * @version 1.0
 */

public class Person {//alt+insert
    /*
        4 private instance variables
            firstName
            lastName
            age: byte
            height: float

        Code the getters and setters for ALL the instance variables

        Code 5 constructors for Person

     */
    /**
     * Name should have at least 3 characters
     */
     private String firstName = "Ben", lastName = "Blanc";
    /**
     * Age of person is byte because maximum age of people is about 120 years old
     * And byte upperbound limit is 127 therefore the byte data type seems fitting
     */
    private byte age;
    /**
     * Height is measured in centimetres.
     */
    static final float MIN_HEIGHT = 30;
    private float height = MIN_HEIGHT;

    /**
     * Getter for the Person's firstname
     * @return String value representing the firstname of Person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for the Person's first name
     * @param firstName String representing Person's firstname that is at least 3 characters long
     * @throws IllegalArgumentException describe why here
     * @exception ArrayIndexOutOfBoundsException describe why again
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName.length() >= 3 ? firstName : this.firstName;
    }

    /**
     * Getter for the Person's lastname
     * @return String value representing the lastname of Person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for the Person's last name
     * @param lastName String representing Person's lastname that is at least 3 characters long
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for the Person's age
     * @return byte value representing the age of Person
     */
    public byte getAge() {
        return age;
    }

    /**
     * Setter for the Person's age
     * @param age byte value representing Person's age. Minimum value of 0
     */
    public void setAge(byte age) {
        //this.age = age >= 0 ? age : this.age;

        if(age >= 0){
            this.age = age;
            setPersonAgeCategory(age);
        }

        //ternary operator aka condensed if statement
        /*
            if(age >0) this.age = age
            else:
                this.age = this.age

        booleanExpression ? statementIfTrue : statementIfFalse
         */

    }

    /**
     * Getter for the Person's height
     * @return float value representing the height of Person
     */
    public float getHeight() {
        return height;
    }

    /**
     * Setter for the Person's height
     * @param height float value representing Person's height in centimetres. Minimum value 30
     */
    public void setHeight(float height) {
        if(height >= MIN_HEIGHT)
            this.height = height;
    }

    /**
     * Default, no-argument constructor
     */
    public Person(){}


    /**
     * Four argument constructor that sets all instance variables of Person
     * @param firstName String of Person's first name
     * @param lastName String of Person's last name
     * @param age byte of Person's age
     * @param height float of Person's height in centimetres
     */
    public Person(String firstName, String lastName, byte age, float height) {
        this(firstName, lastName, age);
        //this.height = height;
        setHeight(height);
    }

    public Person(String firstName, String lastName, byte age) {
        this(firstName, lastName);
        //his.age = age;
        setAge(age);
    }

    public Person(String firstName, String lastName) {
        //this.firstName = firstName;
        //this.lastName = lastName;
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person(String lastName, byte age) {
        this("", lastName, age);
    }

    /*
            restrict values based similar to dropdown menu
            based on age
                age category
                    baby
                    child
                    teen
                    adult
                    elder
            to create a list of values
                enum
                    enumerable
                        an array of constant values
                            similar to drop-down menu
                            <select >
                                <option>Text</option>
                                <option>Text</option>
                                <option>Text</option>
                            <select>
                    listing of options
                    container that selects 1 of these options
     */
    enum AgeCategory {BABY, CHILD, TEEN, ADULT, ELDER}
    private AgeCategory personAgeCategory = AgeCategory.BABY;

    public String getPersonAgeCategory() {
        return personAgeCategory.toString();
    }

    private void setPersonAgeCategory(byte age) {

        //this.personAgeCategory = personAgeCategory;
        if(age < 5)
            personAgeCategory = AgeCategory.BABY;
        else if(age < 13)
            personAgeCategory = AgeCategory.CHILD;
        else if(age < 18)
            personAgeCategory = AgeCategory.TEEN;
        else if(age < 65)
            personAgeCategory = AgeCategory.ADULT;
        else
            personAgeCategory = AgeCategory.ELDER;
    }

    //template for an object
    //factory method
    //do you want to create a person that's a teen?
    public static Person createTeen(){
        return new Person("Angry", "Teen", (byte)13);
    }
    public static Person createTeen(String firstName,
                                    String lastName,
                                    byte age){

        age = doesAgeMatchAgeCategory(AgeCategory.TEEN, age) ? age : 15;

        return new Person(firstName, lastName, age);
    }
    //method to check if the age & age category match
    private static boolean doesAgeMatchAgeCategory(AgeCategory ageCategory, byte age ){
        return doesAgeMatchAgeCategory(age, ageCategory);
    }
    private static boolean doesAgeMatchAgeCategory(byte age, AgeCategory ageCategory){

        return switch (ageCategory){
            case BABY -> age >= 0 && age < 5;
            case CHILD -> age > 4 && age < 13;
            case TEEN -> age > 12 && age < 18;
            case ADULT -> age >= 18 && age < 65;
            case ELDER -> age >= 65;
        };
    }
}
