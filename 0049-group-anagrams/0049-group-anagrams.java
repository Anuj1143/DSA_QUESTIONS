class Solution {
    String generate(String s){
        int count[]=new int[26];
        for(char ch:s.toCharArray() ){
            count[ch-'a']++;

        }
        StringBuilder NewS=new StringBuilder();
        for(int i=0; i<26;i++){
            if(count[i]>0){
                NewS.append(String.valueOf((char)(i+'a')).repeat(count[i]));
            }

        }
        return NewS.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>mp=new HashMap<>();
       for(String s:strs){
        String NewS=generate(s);
        if(!mp.containsKey(NewS)){
            mp.put(NewS, new ArrayList<>());


        }
        mp.get(NewS).add(s);
       }
    return new ArrayList<>(mp.values());
    }
}