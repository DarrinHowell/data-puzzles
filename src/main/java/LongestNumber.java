import java.util.Arrays;
import java.util.Collections;

public class LongestNumber {

    public static String longestNumber (int[] nums) {

        String ans = "";
        StringBuilder builder = new StringBuilder();
        for (int num: nums) {
            builder.append(num);
        }

        String digits = builder.toString();
        Integer[] digitsToInts = new Integer[]{digits.length()};

        for (int i = 0; i < digits.length(); i++){
            digitsToInts[i] = Character.getNumericValue(digits.charAt(i));
        }

        Arrays.sort(digitsToInts, Collections.reverseOrder());

        StringBuilder buildAnswer = new StringBuilder();
        for (Integer digit: digitsToInts) {
            buildAnswer.append(digit);
        }

        return buildAnswer.toString();

    }
}
