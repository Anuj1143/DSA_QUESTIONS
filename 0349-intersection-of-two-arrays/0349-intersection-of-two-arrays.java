

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        // Step 1: Convert nums1 to a HashSet
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Step 2: Create a HashSet to store the intersection
        Set<Integer> set2 = new HashSet<>();
        
        // Step 3: Loop through nums2 and add common elements to set2
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        // Step 4: Convert set2 to an array
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }
        
        return result;
    }
}
