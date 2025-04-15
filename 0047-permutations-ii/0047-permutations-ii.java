class Solution {


    public void backtrack(List<List<Integer>>result, ArrayList<Integer> temp, int[]nums, boolean[]used){
        if(temp.size()==nums.length  && !result.contains(temp)){


            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;

            used[i] =true;
            temp.add(nums[i]);

            backtrack(result, temp, nums,used );

            used[i]=false;

            temp.remove(temp.size()-1);


        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }
}