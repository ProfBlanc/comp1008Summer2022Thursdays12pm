package ca.georgiancollege.copr.comp1008.week9;

import java.util.Locale;
import java.util.regex.Pattern;

public class Animal {

    private String name;

//    public Animal(){}
    public Animal(String name) throws DoesNotContainVowel{
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws DoesNotContainVowel{

        if(!Pattern.matches(".*[aeiou]{1,}.*", name.toLowerCase()))
            throw new DoesNotContainVowel("Name " + name + " does not contain a vowel");

        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
