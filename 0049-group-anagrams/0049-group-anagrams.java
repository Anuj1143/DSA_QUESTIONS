class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String, List<String>>map=new HashMap<>();

        for(String  str:strs){
            String freqString=getFreqString(str);
            if(map.containsKey(freqString)){
                map.get(freqString).add(str);
            }
            else{
                List<String>strList=new ArrayList<>();
                strList.add(str);
                map.put(freqString, strList);
            }
        }
        return new ArrayList<>(map.values());
        
    }

    private String getFreqString(String strs){
        int freq[]=new int[26];

        for(char c:strs.toCharArray()){
            freq[c-'a']++;
        }


        StringBuilder freqString=new StringBuilder();
        char c = 'a';
        for(int i:freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }
        return freqString.toString();
    }
}