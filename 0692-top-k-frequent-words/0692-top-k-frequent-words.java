class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer>mp=new HashMap<>();
        for(String word:words){
            mp.put(word, mp.getOrDefault(word, 0)+1);
        }

        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            if(!mp.get(a).equals(mp.get(b))){
                return mp.get(a)-mp.get(b);
            }
            else{
                return b.compareTo(a);
            }
        });

        for(Map.Entry<String, Integer>entry:mp.entrySet()){
            pq.add(entry.getKey());
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String>result=new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}