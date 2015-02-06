/**
 * Created by raphael on 1/31/15.
 */
public class GuessNumber {
    public String getTips(String input, String guess) {
        if (input.equals(guess)) {
            return "4A0B";
        }
        int numCount = 0;
        for(int i=0; i < input.length(); i++){
            if(input.contains(String.valueOf(guess.charAt(i)))){
                numCount++;
            }
        }
        int countA = 0;
        for(int i = 0;i<numCount;i++){
            if(input.charAt(i) == guess.charAt(i)){
                countA++;
            }
        }
        return countA + "A" + (numCount - countA) + "B";
    }

    public boolean isDuplicateNumber(String inStr){
     for (int i = 0; i < inStr.length(); i++){
         if(inStr.indexOf(inStr.charAt(i)) != inStr.lastIndexOf(inStr.charAt(i))){
             return true;
         }
     }
        return false;
    }

    public boolean checkInput(String inputStr){
        if(4 != inputStr.length()){
            System.out.print("Please input 4 numbers!\n");
            return false;
        }
        if(isDuplicateNumber(inputStr)){
            System.out.print("Cannot input duplicate numbers!\n");
            return false;
        }
        return true;
    }
}