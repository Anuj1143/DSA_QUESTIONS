class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closetSum=nums[0]+nums[1]+nums[2];
        for(int i=0; i<n-2; i++){
            int j=i+1;
            int r=n-1;
            while(j<r){
                int sum=nums[i]+nums[j]+nums[r];
                if(Math.abs(sum-target)<Math.abs(closetSum-target)){
                    closetSum=sum;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    r--;
                }
                else{
                    return sum;
                }
            }
        }
        return closetSum;
    }
}