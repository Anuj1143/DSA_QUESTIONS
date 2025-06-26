class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        List<Integer>[]bucket=new List[nums.length+1];
        for(int i=0; i<=nums.length; i++){
            bucket[i]=new  ArrayList<>();
        }

        for(Map.Entry<Integer, Integer>entry:mp.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        List<Integer>result=new ArrayList<>();
        for(int i=bucket.length-1; i>=0 && result.size()<k; i--){
            if(!bucket[i].isEmpty()){
                result.addAll(bucket[i]);
            }
        }
        int [] topK=new int[k];
        for(int i=0; i<k; i++){
            topK[i]=result.get(i);
        }
        return  topK;
    }
}