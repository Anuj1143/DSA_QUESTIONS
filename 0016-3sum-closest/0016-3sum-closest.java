class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n= nums.length;
        Arrays.sort(nums);
        int closeSum=Integer.MAX_VALUE;
        for(int k=0; k<n-2; k++){

            int i=k+1;
            int j=n-1;
            while(i<j){
                int sum=nums[k]+nums[i]+nums[j];
                if(sum==target){

                    return sum;
                }

                if(Math.abs(target-sum)<Math.abs(target-closeSum))
                    closeSum=sum;
                if(sum<target){
                    i++;
                }
                else
                    j--;
            }
        }
        return closeSum;
    }
}