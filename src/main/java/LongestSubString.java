import java.util.HashSet;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;

        } else if (s.length() == 1) {
            return 1;

        } else {

            int longestSub = 0;

            for (int i = 0; i < s.length() - 1; i++) {

                HashSet<Character> charsSoFar = new HashSet<>();
                char firstChar = s.charAt(i);
                charsSoFar.add(firstChar);
                int longestSubSoFar = 1;
                int subEnd = 0;

                for (int j = i + 1; j < s.length(); j++) {

                    char currentChar = s.charAt(j);

                    if (!charsSoFar.contains(currentChar) && j == s.length() - 1) {
                        longestSubSoFar++;

                        if (longestSubSoFar > longestSub) {
                            longestSub = longestSubSoFar;
                            subEnd = j;
                        }

                    } else if (!charsSoFar.contains(currentChar)) {
                        longestSubSoFar++;
                        charsSoFar.add(currentChar);

                    } else if (charsSoFar.contains(currentChar)){

                        if (longestSubSoFar > longestSub) {
                            longestSub = longestSubSoFar;
                        }

                        subEnd = j;

                        break;
                    }
                }

                if (subEnd == s.length() - 1) {
                    break;
                }
            }

            return longestSub;
        }
    }
}
