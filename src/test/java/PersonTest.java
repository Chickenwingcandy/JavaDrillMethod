import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person();
    }

    @Test
    void printName() {
        String name = "Gertrude";

        String test = "Gertrude";
        String result = person.printName();


    }
}