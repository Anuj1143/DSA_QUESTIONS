class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        for(Map.Entry<Integer, Integer>entry:mp.entrySet()){
            pq.offer(new int[]{entry.getValue(), entry.getKey()});

            if(pq.size()>k){
                pq.poll();
            }
        }
        int result[]=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            result[i++]=pq.poll()[1];
        }
        return result;
    }
}