import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, Integer> maxMap = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int maxDigit = getMaxDigit(num);

            if (maxMap.containsKey(maxDigit)) {
                // Update max sum
                maxSum = Math.max(maxSum, maxMap.get(maxDigit) + num);
                // Update the larger value for this digit group
                maxMap.put(maxDigit, Math.max(maxMap.get(maxDigit), num));
            } else {
                maxMap.put(maxDigit, num);
            }
        }

        return maxSum;
    }

    private int getMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10);
            num /= 10;
        }
        return maxDigit;
    }
}
