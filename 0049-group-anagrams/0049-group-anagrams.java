class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>ana=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String b=new String(ch);
            if(!ana.containsKey(b))
                ana.put(b, new ArrayList<>());
                ana.get(b).add(s);
        }

        List<List<String>>ll=new ArrayList<>(ana.values());
        return ll;

        
    }
}