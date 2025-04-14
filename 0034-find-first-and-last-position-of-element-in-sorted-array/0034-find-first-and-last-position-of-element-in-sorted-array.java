class Solution {
    int findLeftMost(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int left_most=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                left_most=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return left_most;

    }
    int findRightMost(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int right_most=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                right_most=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return right_most;
    }
    public int[] searchRange(int[] nums, int target) {
       int left_most=findLeftMost( nums, target);
       int right_most=findRightMost(nums,target);
       return new int[]{left_most, right_most};
        
    }
}