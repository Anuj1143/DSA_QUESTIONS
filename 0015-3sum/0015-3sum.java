class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        if(nums==null || n<3 ) return new ArrayList<>();

        Set<List<Integer>>result=new HashSet<>();

        for(int i=0; i<n-2; i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else
                    right--;
            }
        }

        return new ArrayList<>(result);
    }
}