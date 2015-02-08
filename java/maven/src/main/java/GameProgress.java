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
        out.println("please input your number(6):");

        String answer = getRandomNumber.getRandomNumber();
        String input = reader.readLine();
        String tips = guessNumber.getTips(input, answer);

        out.println(tips);
        if(!"4A0B".equals(tips)){
            out.println("please input your number(5):");
        }

    }
}
