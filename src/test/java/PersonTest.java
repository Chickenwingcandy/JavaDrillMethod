import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PersonTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person();
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

        String nameTest = "Someone didn’t care enough about you to type your name correctly. Sorry.";
        String result = person.validateCapitalization("adam");

        assertEquals(nameTest,result, "This should return the cap sentence.");
    }

    @Test
    void validateCapitalizationCapTest(){

        String nameTest = "Stanley";
        String result = person.validateCapitalization("Stanley");

        assertEquals(nameTest, result, "This should return the name.");
    }
}