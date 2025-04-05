class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int mid=0;
        int j=nums.length-1;
        while(mid<=j){
            switch(nums[mid]){
                case 0:
                     swap(nums, i, mid);
                     mid++;
                     i++;
                     break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, j);
                    j--;
                    
                    break;    

            }
        }
        
    }
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}