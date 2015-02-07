/**
 * Created by zzy on 2/7/15.
 */
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameProgressTest {

    @Test
    public void should_print_welcome_when_game_start(){
        PrintStream out = mock(PrintStream.class);
        GameProgress game = new GameProgress(out);

        verify(out, never()).println("welcome!");
        game.start();
        verify(out).println("welcome!");
    }

    @Test
    public void should_print_input_after_game_start(){
        PrintStream out = mock(PrintStream.class);
        GameProgress game = new GameProgress(out);

        game.start();
        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome!");
        inOrder.verify(out).println("please input your number(6):");

    }
}
