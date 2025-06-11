class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer>map=new HashMap<>();
        int majorityElem=nums.length/2;
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>majorityElem){
                return num;
            }
        }
        return -1;
        
    }
}