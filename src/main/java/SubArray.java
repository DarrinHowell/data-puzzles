import java.util.ArrayList;
import java.util.Arrays;

public class SubArray {

    public static boolean checkSubarraySum(int [] nums, int k) {

        if (nums.length < 2) {
            return false;
        }

        if (k < 0) {
            k *= -1;
        }

        if (zeroesCheck(nums)) {
            return true;
        }

        int totalSum = Arrays.stream(nums).sum();

        if (totalSum < k && totalSum != 0) {
            return false;

        } else {

            for (int i = 0; i < nums.length; i++) {

                for (int j = i + 1; j <= nums.length - 1; j++) {

                    ArrayList<Integer> subArr = new ArrayList<>();

                    for (int z = i; z <= j; z++) {

                        subArr.add(nums[z]);
                    }

                    Integer[] modArr = subArr.toArray(new Integer[subArr.size()]);
                    int sum = Arrays.stream(modArr).mapToInt(Integer::intValue).sum();

                    if (k != 0 && sum % k == 0) {
                        return true;
                    } else if (sum == 0) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static boolean zeroesCheck(int[] nums){

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }

        return false;
    }
}
