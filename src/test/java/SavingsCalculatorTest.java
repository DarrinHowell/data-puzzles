import org.junit.Assert;
import org.junit.Test;

public class SavingsCalculatorTest {

    @Test
    public void testFirstScenario() {

        int[] actual = SavingsCalculator.nbMonths(2000, 8000,
                1000, 1.5);

        int[] expected = new int[]{6, 766};

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSecondScenario() {

        int[] actual = SavingsCalculator.nbMonths(12000, 8000,
                1000, 1.5);
        int[] expected = new int[]{0, 4000};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testThirdScenario() {

        int[] actual = SavingsCalculator.nbMonths(8000, 8000, 1000,
                1.5);
        int[] expected = new int[2];

        Assert.assertArrayEquals(expected, actual);
    }
}
