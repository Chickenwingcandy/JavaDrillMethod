import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
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

    @Test
    @DisplayName("Will return a number")
    void giveNumberTest(){
        int testNumber = 5;
        assertEquals(testNumber, methodDrills.giveNumber(),"These should match");
    }

    @Test
    @DisplayName("This will return an int array")
    void getNumberArrayTest(){
        int numberArrayTest[] = {2,3,4};
        int result[]=  methodDrills.getNumberArray();
        Assert.assertArrayEquals(numberArrayTest,result);
    }

    @Test
    void sentence() {
        String test = "This is just to write a public method";
        String result = methodDrills.sentence();

        assertEquals((Object) test,result, "Should equal each other");
    }

    @Test
    void trueOrFalse() {
        boolean test = true;
        boolean result = methodDrills.trueOrFalse();

        assertEquals(test, result, "These should both be true.");
    }


    @Test
    void singleLetter() {
        char test ='c';
        char result = methodDrills.singleLetter();

        assertEquals(test, result, "Should both be c");
    }

    @Test
    void numberToSentence() {
        String test = "" + 5;
        String results = methodDrills.numberToSentence(5);

        assertEquals((Object)test, results, "Should be the same");
    }

    @Test
    void tellMeAString() {
        String firstSentenceTest = "This it the first string I'm returning.";
        String secondSentenceTest = "This string is going to be connected to the first string.";

        String test = firstSentenceTest + " " + secondSentenceTest;
        String result = methodDrills.tellMeAString(firstSentenceTest,secondSentenceTest);

        assertEquals((Object) test,result,"They should match.");

    }

    @Test
    void checkForTruth() {
        String testfirstSentence = "That's not right ";
        int firstNumbertest = 5;
        int secondNumbertest = 6;

        boolean test = true;
        boolean results = methodDrills.checkForTruth("That's not right ",5,6);

        assertEquals(test,results,"This should be true.");
    }

    @Test
    void returnAnumber() {
        int numberInputTest = 5;

        int test = numberInputTest;
        int result = methodDrills.returnAnumber(numberInputTest);

        assertEquals(test,result, "These should return a number.");
    }


    @Test
    void returnNumberProvidedByParameter() {
        int numberInputTest = 5;

        int test = numberInputTest;
        int result = methodDrills.returnNumberProvidedByParameter(numberInputTest);

        assertEquals(test,result, "These should both equal five.");
    }
}