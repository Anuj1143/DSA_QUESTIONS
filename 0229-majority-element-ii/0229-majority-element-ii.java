class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer>map=new HashMap<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}