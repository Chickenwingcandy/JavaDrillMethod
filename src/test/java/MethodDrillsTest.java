import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MethodDrillsTest {

    MethodDrills methodDrills;

    @BeforeEach
    void setUp(){
        methodDrills = new MethodDrills();
    }

    @Test
    @DisplayName("Should return String")
    void giveStringTest(){
        String testAnswer = "Please don't give the answer.";
        assertEquals((Object) testAnswer,methodDrills.giveString(), "They should be the same.");
    }



}