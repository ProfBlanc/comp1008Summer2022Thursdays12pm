package ca.georgiancollege.copr.comp1008.week6;

public class Cat extends Animal {

    int paws;
    double whiskers;


    public Cat(String name, int age, double weight,
               int paws, double whiskers) {
        super(name, age, weight);
        this.paws = paws;
        this.whiskers = whiskers;
    }

    public Cat(){}
    public Cat(String name, double weight, int age){
        //this(name, age, weight);
        super(name, weight, age);
        this.teeth = 100;
        //this.age = 100;
    }
    public Cat(String name, int age, double weight){
        /*
        setName(name);
        setAge(age);
        setWeight(weight);

         */
        super(name, age, weight);
    }

    //overriding
    //create a NEW implementation of something

    //annotation: compiler checks parent class to see if method exists
    @Override
    public boolean isScary(){
        return super.isScary() && paws > 8;
    }

    @Override
    public String toString(){

        /*
        return "Cat" + super.toString().substring(6,
                super.toString().length()-1)

                +
                ",whiskers=" + whiskers
                + ",paws=" + paws
                ;

         */
        return "Cat{" +
                "name=" + getName()
                +",age=" + getAge();
    }
}
