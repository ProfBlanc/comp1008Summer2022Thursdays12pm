package ca.georgiancollege.copr.comp1008.week4;

public class PersonRunner {

    public static void main(String[] args) {
        example3();
    }
    static void example3(){

        Person p = new Person();
        Person teen = Person.createTeen(); //calling Factory Method: declare
        //a preset configuration of an object of the class
        outputPerson(teen);

        Person teenager = Person.createTeen("Cool", "Teen", (byte)45);
        outputPerson(teenager);

        Person teenager1 = Person.createTeen("Cool1", "Teen1", (byte)17);
        outputPerson(teenager1);

    }
    static void example2(){


        System.out.println(Person.AgeCategory.ADULT);


        String ageCategory = Person.AgeCategory.ELDER.toString();

        Person p1 = new Person();
        outputPerson(p1);
        p1.setAge((byte) 50);
        outputPerson(p1);

        Person p2 = new Person("Joe", "Smith", (byte) 15, 160f);
        outputPerson(p2);

    }
    static void example1(){
        Person p1 = new Person();
        outputPerson(p1);

        Person p2 = new Person("A", "B", (byte) -20, -125);
        outputPerson(p2);

        Person p3 = new Person("Murphy", (byte) 40);
        outputPerson(p3);
    }
    static void outputPerson(Person person){
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getHeight());
        System.out.println(person.getAge());
        System.out.println(person.getPersonAgeCategory());
        System.out.println("*".repeat(20));
    }
}
