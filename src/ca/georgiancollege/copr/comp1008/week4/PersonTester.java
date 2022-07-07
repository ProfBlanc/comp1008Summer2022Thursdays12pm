package ca.georgiancollege.copr.comp1008.week4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTester {

    Person p;
    @BeforeAll
    static void first(){
        System.out.println("Starting...");
    }
    @AfterAll
    static void last(){
        System.out.println("...Ended");
    }
    static int COUNTER = 0;
    @BeforeEach
    void beforeTest(){
        COUNTER++;
        System.out.println("Starting Test #" + COUNTER);
    }
    @AfterEach
    void afterTest(){
        System.out.println("Ending Test #" + COUNTER);
    }

    @Test
    void testingDefaultConstructorFirstnameIsAtLeast3Characters(){

        p = new Person();
        assertTrue(p.getFirstName().length() >= 3);
    }
    @Test
    void testingDefaultConstructorFirstNameNotLessThan3Characters(){

        p = new Person();
        assertFalse(p.getFirstName().length() < 3);
    }
    @Test
    void testFirstNameDefaultValueIsAccurateWithDefaultConstructor(){
        p = new Person();
        assertEquals("Ben", p.getFirstName());
    }

    @ParameterizedTest
    @ValueSource(bytes = {1, 10, 100, 30, 40, -5})
    void testSetAgeWorksCorrectly(byte age){
        /*
            only accepts numerical values + String
            single values
         */
        p = new Person();
        p.setAge(age);

        assertEquals(age >= 0 ? age : 0, p.getAge());
    }

    @ParameterizedTest
    @CsvSource({"Ben,Blanc,50", "Rebecca,Dennis, 40", "Sarah,Connor,40"})
    void testFirstNameLastNameAndAgeConstructorUsingParameters(
            String firstName, String lastName, byte age){

        p = new Person(firstName, lastName, age);
        assertTrue(p.getFirstName().equals(firstName)
                &&
                p.getLastName().equals(lastName)
                &&
                p.getAge() == age
        );
    }



}