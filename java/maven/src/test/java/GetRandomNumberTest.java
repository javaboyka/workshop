/**
 * Created by zzy on 2/3/15.
 */
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class GetRandomNumberTest {

    @Test
    public void testFourNumber(){
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        assertThat(getRandomNumber.getRandomNumber().length()).isEqualTo(4);
    }

    @Test
    public void testDiff1And2(){
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        String input = getRandomNumber.getRandomNumber();
        assertThat(input.charAt(0) != input.charAt(1)).isEqualTo(true);
    }

    @Test
    public void testDiff1And3(){
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        String input = getRandomNumber.getRandomNumber();
        assertThat(input.charAt(0) != input.charAt(2)).isEqualTo(true);
    }

    @Test
    public void testDiff1And4(){
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        String input = getRandomNumber.getRandomNumber();
        assertThat(input.charAt(0) != input.charAt(3)).isEqualTo(true);
    }

    @Test
    public void testDiff2And3(){
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        String input = getRandomNumber.getRandomNumber();
        assertThat(input.charAt(1) != input.charAt(2)).isEqualTo(true);
    }

    @Test
    public void testDiff2And4(){
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        String input = getRandomNumber.getRandomNumber();
        assertThat(input.charAt(1) != input.charAt(3)).isEqualTo(true);
    }

    @Test
    public void testDiff3And4(){
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        String input = getRandomNumber.getRandomNumber();
        assertThat(input.charAt(2) != input.charAt(3)).isEqualTo(true);
    }
}
