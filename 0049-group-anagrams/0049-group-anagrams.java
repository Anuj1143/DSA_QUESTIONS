class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();

        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String Key=new String(c);
            if(!map.containsKey(Key)){
                map.put(Key, new ArrayList<>());
            }
            map.get(Key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}