class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                // +1 if problem expects 1-based index, else just return i, j
                return new int[]{i+1, j+1}; 
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{}; // return empty array if no solution found
    }
}
