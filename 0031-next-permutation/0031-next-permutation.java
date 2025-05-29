class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot!=-1){
            //int swap_index=pivot;
            for(int j=n-1; j>pivot; j--){
                if(nums[j]>nums[pivot]){
                    //swap_index=j;
                     swap(nums, pivot, j);
                    break;
                }
            }
           
        }
        reverse(nums, pivot+1);
    }
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[]nums, int start){
        int left=start;
        int right=nums.length-1;
        while(left<right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}