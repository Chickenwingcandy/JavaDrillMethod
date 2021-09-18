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


}