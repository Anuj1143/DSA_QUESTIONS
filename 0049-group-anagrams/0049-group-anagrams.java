class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map=new HashMap<>();
        
        
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String b=new String(ch);
            if(!map.containsKey(b))
                map.put(b, new ArrayList<>());
            map.get(b).add(s);
        }
        List<List<String>>ll=new ArrayList<>(map.values());
        return ll;

    }
}