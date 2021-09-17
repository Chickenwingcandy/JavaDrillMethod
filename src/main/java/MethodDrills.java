public class MethodDrills {

    private int numberArray [] = {2,3,4};
    private int numberInput = 16;

    public String giveString(){
        String sentence = "Please don't give the answer.";
        return sentence;
    }

    public int giveNumber(){
        return 5;
    }

    public int[] getNumberArray(){
        return numberArray;
    }

    public void nothing (){

    }

    public String sentence(){
        return "This is just to write a public method";
    }

    private String followSentence(){
        return "This is just to write a private method";
    }

    public boolean trueOrFalse(){
        return true;
    }

    public char singleLetter(){
        char single = 'c';
        return single;
    }

    public String numberToSentence(int numberInput){
        return "" + numberInput;
    }

    public String tellMeAString(String firstSentence, String secondSentence){

        firstSentence = "This it the first string I'm returning.";
        secondSentence = "This string is going to be connected to the first string.";

        return firstSentence + " " + secondSentence;
    }

    public boolean checkForTruth(String firstSentence, int firstNumber, int secondNumber){

        firstSentence = "That's not right ";
        firstNumber = 5;
        secondNumber = 6;

        return firstNumber != secondNumber;
//        if (firstNumber != secondNumber){
//            return true;
//        }
//        else{
//            return false;
//        }
    }

    public int returnANumber(int numberInput){
        return numberInput;
    }

    public int returnNumberProvidedByParameter(int numberInput){
        return numberInput;
    }

    public String oneInputOneOutput(String sentence){
        return sentence;
    }

    public int addTwoNumbers(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public void useADiffMethod(){
        oneInputOneOutput("Hello");
    }

}
