class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int i=0;
     int r=numbers.length-1;
     while(i<r){
        int sum=numbers[i]+numbers[r];
        if(sum==target){
            return new int[]{i+1, r+1};
        }
        else if(sum<target){
            i++;
        }
        else{
            r--;
        }

     }   
     return new int[] {};
    }
}