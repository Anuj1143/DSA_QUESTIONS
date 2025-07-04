class Solution {
    boolean allZero(int []count){
        for(int i:count){
            if(i!=0){
                return false;
            }
            
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int count[]=new int[26];
        for(char ch:p.toCharArray()){
            count[ch-'a']++;
        }
        int i=0;
        int j=0;
        List<Integer>ans=new ArrayList<>();
        int k=p.length();
        while(j<n){
            count[s.charAt(j)-'a']--;
            if((j-i+1)==k){
                if(allZero(count)){
                    ans.add(i);
                }
                count[s.charAt(i)-'a']++;
                i++;
            }
            j++;

        }
        return ans;
    }
}