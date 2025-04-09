class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            // If mid element is greater than the next element, peak must be on the left or at mid
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                // Otherwise, peak must be on the right side
                start = mid + 1;
            }
        }
        
        // At the end of the loop, start == end, and it's the index of the peak element
        return start;
    }
}
