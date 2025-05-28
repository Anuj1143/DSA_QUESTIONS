class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int mapping[]=new int[26];
        int seq=0;
        for(char ch:order.toCharArray()){
            mapping[ch-'a']=seq++;
        }
        for(int i=0; i<words.length-1;i++){
            String curr=words[i];
            String next=words[i+1];
            int len=Math.min(curr.length(), next.length());
            if(curr.startsWith(next)&& curr.length()>next.length()){
                return false;
            }
            for(int j=0; j<len; j++){
                if(mapping[curr.charAt(j)-'a']>mapping[next.charAt(j)-'a']){
                    return false;
                }
                if(mapping[curr.charAt(j)-'a']<mapping[next.charAt(j)-'a']){
                    break;
                }
            }
        }
        return true;
    }
}