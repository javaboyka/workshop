/**
 * Created by raphael on 1/31/15.
 */
import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;
public class TestGuessNumber {

    @Test
    public void testFourAZeroB(){
        String input = "1234";
        String guess = "1234";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.getTips(input, guess)).isEqualTo("4A0B");
    }

    @Test
    public void testZeroAFourB() {
        String input = "1234";
        String guess = "4321";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.getTips(input, guess)).isEqualTo("0A4B");
    }

    @Test
    public void testZeroAZeroB(){
        String input = "1234";
        String guess = "5678";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.getTips(input, guess)).isEqualTo("0A0B");
    }

    @Test
    public void testOneAThreeB(){
        String input = "1234";
        String guess = "4213";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.getTips(input, guess)).isEqualTo("1A3B");
    }

    @Test
    public void testCheckInputMoreThanFour(){
        String input = "12345";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.checkInput(input)).isEqualTo(false);
    }

    @Test
    public void testCheckInputLessThanFour(){
        String input = "123";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.checkInput(input)).isEqualTo(false);
    }

    @Test
    public void testCheckInputEqualFour(){
        String input = "1234";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.checkInput(input)).isEqualTo(true);
    }

    @Test
    public void testCheckInputFourDuplicate(){
        String input = "1234";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.checkInput(input)).isEqualTo(true);
    }

    @Test
    public void testCheckInputZeroDuplicate(){
        String input = "1111";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.checkInput(input)).isEqualTo(false);
    }

    @Test
    public void testCheckInputHadSameNumber(){
        String input = "1214";
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.checkInput(input)).isEqualTo(false);
    }
}
