public class MethodDrills {

    private int numberArray [] = {2,3,4};
    private int numberInput = 16;

    public String giveString(){
        String sentence = "Please don't give the answer.";
        return sentence;
    }

    private int giveNumber(){
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

    private char singleLetter(){
        char single = 'c';
        return single;
    }

    private String numberToSentence(int numberInput){
        return "" + numberInput;
    }

    private String tellMeAString(String firstSentence, String secondSentence){

        firstSentence = "This it the first string I'm returning.";
        secondSentence = "This string is going to be connected to the first string.";

        return firstSentence + " " + secondSentence;
    }

    private boolean checkForTruth(String firstSentence, int firstNumber, int secondNumber){

        firstSentence = "That's not right ";
        firstNumber = 5;
        secondNumber = 6;

        if (firstNumber != secondNumber){
            return true;
        }
        else{
            return false;
        }
    }


}
