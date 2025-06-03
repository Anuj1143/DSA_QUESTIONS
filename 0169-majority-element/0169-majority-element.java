class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int el=0;
        for(int i=0;i<nums.length; i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==el){
                count1++;
            }
         if(count1>(nums.length/2)){
            return el;
         }
        }
        return -1;
    }
}