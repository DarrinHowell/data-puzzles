public class UserSolution {

    public static long[] oddRow(int n) {

        long intToLong = (long) n;

        if (intToLong <= 0) {
            return new long[]{};

        } else {

            long[] results = new long[n];

            results[0] = intToLong * (intToLong - 1) + 1;

            for (int i = 1; i < n; i++) {
                results[i] = results[i - 1] + 2;
            }

            return results;
        }
    }
}
