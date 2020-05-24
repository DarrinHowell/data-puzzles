import org.junit.Assert;
import org.junit.Test;

public class LongestSubStringTest {

    @Test
    public void longestSubStringTest(){


        int longestSub = LongestSubString.lengthOfLongestSubstring("abcabcbb");
        int expected = 3;

        Assert.assertEquals(expected,longestSub);
    }

    @Test
    public void longestSubStringTest_2(){


        int longestSub = LongestSubString.lengthOfLongestSubstring("bbbbb");
        int expected = 1;

        Assert.assertEquals(expected,longestSub);
    }

    @Test
    public void longestSubStringTest_3(){


        int longestSub = LongestSubString.lengthOfLongestSubstring("pwwkew");
        int expected = 3;

        Assert.assertEquals(expected,longestSub);
    }

    @Test
    public void longestSubStringTest_4(){


        int longestSub = LongestSubString.lengthOfLongestSubstring("Darrin");
        int expected = 3;

        Assert.assertEquals(expected,longestSub);
    }

    @Test
    public void longestSubStringTest_5(){


        int longestSub = LongestSubString.lengthOfLongestSubstring("Darin");
        int expected = 5;

        Assert.assertEquals(expected,longestSub);
    }
}
