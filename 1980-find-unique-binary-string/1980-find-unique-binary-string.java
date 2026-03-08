class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder result=new StringBuilder();

        for(int i=0; i<nums.length; i++){
            char c=nums[i].charAt(i);
             if(c=='0'){
            result.append('1');
        }else if(c=='1'){
            result.append('0');
        }
        }
       return result.toString();
    }
}