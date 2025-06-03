class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length-1;
        int low=0;
        int mid=0;
        int high=n;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums[low], nums[mid]);
                low++;
                mid++;


            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums[high], nums[mid]);
                high--;

            }
        }
    }
   public void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}