/**
 * Created by zzy on 2/7/15.
 */
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class GameProgressTest {

    @Test
    public void should_print_welcome_when_game_start(){
        PrintStream out = mock(PrintStream.class);
        GameProgress game = new GameProgress(out);

        verify(out, never()).println("welcome!");
        game.start();
        verify(out).println("welcome!");
    }
}
