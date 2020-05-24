import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void longestPalindromeTest_Ex1(){

        String longestPalindrome = LongestPalindrome.longestPalindrome("babad");
        String expected = "bab";
        Assert.assertEquals(expected, longestPalindrome);
    }

    @Test
    public void longestPalindromeTest_Ex2(){

        String longestPalindrome = LongestPalindrome.longestPalindrome("cbbd");
        String expected = "bb";
        Assert.assertEquals(expected, longestPalindrome);
    }

    @Test
    public void longestPalindromeTest_DEx1(){

        String longestPalindrome = LongestPalindrome.longestPalindrome("hannah");
        String expected = "hannah";
        Assert.assertEquals(expected, longestPalindrome);
    }

    @Test
    public void longestPalindromeTest_DEx2(){

        String longestPalindrome = LongestPalindrome.longestPalindrome("hhnnad");
        String expected = "hh";
        Assert.assertEquals(expected, longestPalindrome);
    }

    @Test
    public void longestPalindromeTest_D3(){

        String longestPalindrome = LongestPalindrome.longestPalindrome("hbnnabb");
        String expected = "nn";
        Assert.assertEquals(expected, longestPalindrome);
    }


    @Test
    public void longestPalindromeTest_D4(){

        String longestPalindrome = LongestPalindrome.longestPalindrome("lphbehiapswjudnbcossedgioawodnwdruaaxhbkwrxyzaxygmnjgwysafuqbmtzwdkihbwkrjefrsgjbrycembzzlwhxneiijgzidhngbmxwkhphoctpilgooitqbpjxhwrekiqupmlcvawaiposqttsdgzcsjqrmlgyvkkipfigttahljdhtksrozehkzgshekeaxezrswvtinyouomqybqsrtegwwqhqivgnyehpzrhgzckpnnpvajqevbzeksvbezoqygjtdouecnhpjibmsgmcqcgxwzlzztdneahixxhwwuehfsiqghgeunpxgvavqbqrelnvhnnyqnjqfysfltclzeoaletjfzskzvcdwhlbmwbdkxnyqappjzwlowslwcbbmcxoiqkjaqqwvkybimebapkorhfdzntodhpbhgmsspgkbetmgkqlolsltpulgsmyapgjeswazvhxedqsypejwuzlvegtusjcsoenrcmypexkjxyduohlvkhwbrtzjnarusbouwamazzejhnetfqbidalfomecehfmzqkhndpkxinzkpxvhwargbwvaeqbzdhxzmmeeozxxtzpylohvdwoqocvutcelgdsnmubyeeeufdaoznxpvdiwnkjliqtgcmvhilndcdelpnilszzerdcuokyhcxjuedjielvngarsgxkemvhlzuprywlypxeezaxoqfges");
        String expected = "pnnp";
        Assert.assertEquals(expected, longestPalindrome);
    }
}
