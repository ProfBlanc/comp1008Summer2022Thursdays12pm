package ca.georgiancollege.copr.comp1008.week6;

public class Animal {

    /*
        all private
            name: StringBuilder
            age:  int
            weight: double
        getters and setters for all instance variable

        3 constructors
            default
            2 other constructors
     */
    private StringBuilder name;
    private int age;
    private double weight;

    byte teeth;

    //alt+insert

    public boolean isScary(){

        //weight of animal greater 200lbs
        return weight > 200;
    }
    public Animal(){
        name = new StringBuilder();
    }

    public Animal(String name, int age, double weight) {
        this.name = new StringBuilder(name);
        this.age = age;
        this.weight = weight;
    }
    public Animal(String name, double weight,int age) {
        this.name = new StringBuilder(name);
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name.toString();
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }
    public void setName(String name) {
        //delete the contents of our SB
        this.name.delete(0, this.name.length());
        this.name.setLength(0);
        this.name.append(name);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                ", age=" + age +
                ", weight=" + weight +
                ", teeth=" + teeth +
                '}';
    }

    @Override
    public boolean equals(Object o){ //a1.equals(a2)
        /*
            attempt to convert the Object to Animal
            if cannot, not equal
            if can, evaluate every instance variable value
         */
        try{
            Animal compare = (Animal) o;
            return this.weight == compare.weight
                    &&
                    this.teeth == compare.teeth
                    &&
                    name.toString().equals(compare.name.toString())
                    &&
                    this.age == compare.age

                    ;
        }
        catch (Exception e){
            return false;
        }


    }
}
