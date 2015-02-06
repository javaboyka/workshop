import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by zzy on 2/6/15.
 */
public class PlayGames {

    public static void main(String[] args){
        print();
    }

    public static void print(){
        int guessCount = 6;
        GetRandomNumber randomNum = new GetRandomNumber();
        String randomStr = randomNum.getRandomNumber();
        System.out.print("Welcome!\n\n");

        System.out.print("random is "+randomStr+"\n");
        managerResult(guessCount, randomStr);
    }

    public static void managerResult(int guessCount, String randomStr){
        GuessNumber guessNumber = new GuessNumber();
        while (guessCount > 0){
            System.out.print("Please input your number("+guessCount+"): ");
            Scanner cin = new Scanner(new BufferedInputStream(System.in));
            String cinStr = cin.nextLine();
            guessCount--;
            if(!guessNumber.checkInput(cinStr)){
                if(0 == guessCount){
                    System.out.print("Game Over");
                    break;
                }
                continue;
            }

            String result = guessNumber.getTips(randomStr, cinStr);
            if("4A0B".equals(result)){
                System.out.print("Congratulations!\n");
                break;
            }

            if(0 == guessCount){
                System.out.print("Game Over");
                break;
            }

        }
    }
}
