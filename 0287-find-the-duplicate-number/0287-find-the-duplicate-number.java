class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>result=new HashSet<>();
        for(int num:nums){
           if(result.contains(num)){
                 return num;
           } 
           result.add(num);
        }
return -1;
        
    }
}