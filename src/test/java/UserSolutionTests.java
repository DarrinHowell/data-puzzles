import org.junit.Assert;
import org.junit.Test;

public class UserSolutionTests {

    @Test
    public void testOdd1() {

        long[] actual = UserSolution.oddRow(3);
        long[] expected = new long[]{7, 9, 11};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOdd2() {

        long[] actual = UserSolution.oddRow(4);
        long[] expected = new long[]{13, 15, 17, 19};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOdd3() {

        long[] actual = UserSolution.oddRow(1);
        long[] expected = new long[]{1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOdd4() {

        long[] actual = UserSolution.oddRow(0);
        long[] expected = new long[]{};
        Assert.assertArrayEquals(expected, actual);
    }
}
