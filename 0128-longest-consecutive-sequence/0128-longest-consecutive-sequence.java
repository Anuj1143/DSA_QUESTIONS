class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int largest=1;
        int count=0;
        int lastSmaller=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]-1==lastSmaller){
                count=count+1;
                lastSmaller=nums[i];
            }
            else if(nums[i]!=lastSmaller){
                count=1;
                lastSmaller=nums[i];
            } 
            largest=Math.max(largest, count);       
        }
        return largest;
    }
}