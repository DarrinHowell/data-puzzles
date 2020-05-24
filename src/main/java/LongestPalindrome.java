public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        if (s.length() == 0){
            return "";

        } else if (s.length() == 1) {
            return s;

        } else {
            String longestPalindrome = "";
            long palindromeSize = 0;

            for (int i = 0; i < s.length(); i++) {

                for (int j = s.length(); j > i; j--) {

                    if (j - i > palindromeSize) {

                        String currentSub = s.substring(i, j);

                        if (isPalindrome(currentSub)) {
                            longestPalindrome = currentSub;
                            palindromeSize = currentSub.length();
                            break;
                        }

                    } else {
                        break;
                    }
                }
            }

            return longestPalindrome;
        }
    }

    private static boolean isPalindrome(String subString) {

        StringBuilder builder = new StringBuilder();
        builder.append(subString);

        String reverse = builder.reverse().toString();

        return subString.equals(reverse);
    }
}