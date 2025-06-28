class Solution {
    public int trap(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1; i<n; i++){
            prefix[i]=Math.max(nums[i], prefix[i-1]);
        }

        suffix[n-1]=nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i]=Math.max(nums[i], suffix[i+1]);
        }
        int total=0;
        for(int i=0;i<n; i++){
        int left=prefix[i];
        int  right=suffix[i];
        if(nums[i]<left && nums[i]<right){
            total+=Math.min(left, right )-nums[i];
        }
        }
        return total;
    }

}