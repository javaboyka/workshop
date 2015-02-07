/**
 * Created by zzy on 2/7/15.
 */
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameProgressTest {

    private PrintStream out;
    private GameProgress game;

    @Before
    public void setUp(){
        out = mock(PrintStream.class);

        game = new GameProgress(out);
    }
    @Test
    public void should_print_welcome_when_game_start(){

        verify(out, never()).println("welcome!");
        game.start();
        verify(out).println("welcome!");
    }

    @Test
    public void should_print_input_after_game_start(){

        game.start();
        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome!");
        inOrder.verify(out).println("please input your number(6):");

    }
}
