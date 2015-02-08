import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by zzy on 2/7/15.
 */
public class GameProgress {
    private PrintStream out;
    private final BufferedReader reader;
    private final GuessNumber guessNumber;
    private final GetRandomNumber getRandomNumber;

    public GameProgress(PrintStream out, BufferedReader reader, GuessNumber guessNumber, GetRandomNumber getRandomNumber) {
        this.out = out;
        this.reader = reader;
        this.guessNumber = guessNumber;
        this.getRandomNumber = getRandomNumber;
    }

    public void start() throws IOException {
        out.println("welcome!");
        String answer = getRandomNumber.getRandomNumber();
        String tips = "";
        int roundCount = 6;

        while (roundCount > 0){
            out.println("please input your number("+roundCount+"):");
            String input = reader.readLine();
            tips = guessNumber.getTips(input, answer);

            if("4A0B".equals(tips)){
                break;
            }
            out.println(tips);
            roundCount--;
        }
        if("4A0B".equals(tips)){
            out.println("Congratulation!!");
            return;
        }
        out.println("Game Over");

    }
}
