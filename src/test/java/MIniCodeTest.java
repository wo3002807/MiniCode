import org.junit.Assert;
import org.junit.Test;

/**
 * Created by michael on 2019/4/22.
 */
public class MIniCodeTest {
    @Test
    public void callTest() {
        MiniCode miniCode = new MiniCode();
        Assert.assertEquals("FizzBuzz", miniCode.call(15));
        Assert.assertEquals("Buzz", miniCode.call(5));
        Assert.assertEquals("Fizz", miniCode.call(3));
        Assert.assertEquals("8", miniCode.call(8));
    }

    @Test
    public void computeTest() {
        MiniCode miniCode = new MiniCode();
        for (int i = 1; i <= 100; i++) {
            miniCode.compute(i);
        }
        Assert.assertEquals(33, miniCode.getNumberBy3());
        Assert.assertEquals(20, miniCode.getNumberBy5());
        Assert.assertEquals(6, miniCode.getNumberBy3And5());
    }
}
