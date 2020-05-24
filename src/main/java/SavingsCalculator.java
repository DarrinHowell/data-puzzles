public class SavingsCalculator {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth,
                          double percentLossByMonth) {

        int[] results = new int[2];

        float priceDelta = startPriceOld - startPriceNew;

        if (priceDelta >= 0) {
            results[1] = Math.round(priceDelta);
            return results;

        } else {

            int numMonths = 0;
            int savingsSoFar = savingperMonth;

            while(priceDelta < 0) {

                numMonths++;
                if (numMonths % 2 == 0) {
                    percentLossByMonth += 0.5;
                }

                startPriceOld -= (startPriceOld * (percentLossByMonth / 100));
                startPriceNew -= (startPriceNew * (percentLossByMonth / 100));
                priceDelta = startPriceOld + savingsSoFar - startPriceNew;

                savingsSoFar += savingperMonth;

            }

            results[0] = numMonths;
            results[1] = Math.round(priceDelta);

            return results;
        }
    }
}
