import java.io.PrintStream;

/**
 * Created by zzy on 2/7/15.
 */
public class GameProgress {
    private PrintStream out;

    public GameProgress(PrintStream out) {
        this.out = out;
    }

    public void start() {
        out.println("welcome!");
    }
}
