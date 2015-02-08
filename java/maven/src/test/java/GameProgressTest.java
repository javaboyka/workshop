/**
 * Created by zzy on 2/7/15.
 */
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class GameProgressTest {

    private PrintStream out;
    private GameProgress game;
    private BufferedReader reader;
    private GetRandomNumber getRandomNumber;

    @Before
    public void setUp() throws IOException {
        out = mock(PrintStream.class);

        reader = mock(BufferedReader.class);
        GuessNumber guessNumber = new GuessNumber();
        getRandomNumber = mock(GetRandomNumber.class);
        given(reader.readLine()).willReturn("1234");
        given(getRandomNumber.getRandomNumber()).willReturn("4321");

        game = new GameProgress(out, reader, guessNumber, getRandomNumber);
    }
    @Test
    public void should_print_welcome_when_game_start() throws IOException {

        verify(out, never()).println("welcome!");
        game.start();
        verify(out).println("welcome!");
    }

    @Test
    public void should_print_input_after_game_start() throws IOException {

        game.start();
        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome!");
        inOrder.verify(out).println("please input your number(6):");

    }

    @Test
    public void should_reduce_one_chance_when_guess_wrong() throws IOException {

        game.start();

        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome!");
        inOrder.verify(out).println("please input your number(6):");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("please input your number(5):");
    }
}
