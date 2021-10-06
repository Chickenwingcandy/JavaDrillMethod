import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class PersonTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person ();
    }


    @Test
    void personName() {

        person.setName("Gabriel");

        String nameTest = "Gabriel";
        String result = person.getName();

        assertEquals(nameTest, result, "this is gonna match.");

    }

    @Test
    void manageNameTest(){

        String nameTest = "Joni";
        String result = person.manageName("Joni");

        assertEquals(nameTest, result, "This should fail.");
    }


    @Test
    void validateNameLength() {

        String nameTest = "Jhon";
        String result = person.validateNameLength("Jhon");

        assertEquals(nameTest, result, "This should return persons name");
    }

    @Test
    void validateNameOverFive(){

        String nametest = "Your name is too long, I will call you Jeff.";
        String result = person.validateNameLength("Garrett");

        assertEquals(nametest, result, "This should return Jeff sentence.");
    }

    @Test
    void validateCapitalizationTest() {

        String nameTest = "Someone didn't care enough about you to type your name correctly. Sorry." + "Adam";
        String result = person.validateCapitalization("adam");

        assertEquals(nameTest,result, "This should return the cap sentence.");
    }


    @Test
    void validateCapitalizationCapTest(){

        String nameTest = "Stanley";
        String result = person.validateCapitalization("Stanley");

        assertEquals(nameTest, result, "This should return the name.");
    }

    @Test
    void createAPersonTest() {

        String personInfo = "Tim" + 36;

        String results = person.createAPerson("Tim", 36);

        assertEquals(personInfo, results, "This should make a person.");

    }


    @Test
    void showAgeTest() {

        ArrayList<Person> souls = new ArrayList<Person>(4);


        Person tim = new Person("Tim", 42);
        Person mike = new Person ("Mike", 63);
        Person jan = new Person ("Jan", 52);
        Person susan = new Person ("Susan", 25);

        souls.add(tim);
        souls.add(mike);
        souls.add(jan);
        souls.add(susan);

        int [] expected = {42,63,52,25};

        int [] results = person.showAge(souls);

        assertArrayEquals(expected , results, "Shit should work");
    }

    @Test
    void hasANameFalseTest() {
       Person forSale18 = new Person("ForSale18", 30);

       boolean expected = false;

       boolean results = person.hasAName(forSale18);

       assertEquals(expected,results,"This should return false");
    }

    @Test
    void isNamedTest(){
        Person bob = new Person("Bob", 652);

        boolean expected = true;

        boolean results = person.isNamed(bob);
    }

    @Test
    void namedWhatFalseTest() {
        Person forSale18 = new Person("ForSale18", 30);

        boolean expected = false;

        boolean result = person.namedWhat(forSale18);

        assertEquals(expected,result);
    }

    @Test
    void namedWhatTrueTest() {
        Person forSale18 = new Person("null", 30);

        boolean expected = true;

        boolean result = person.namedWhat(forSale18);

        assertEquals(expected,result);

    }

}