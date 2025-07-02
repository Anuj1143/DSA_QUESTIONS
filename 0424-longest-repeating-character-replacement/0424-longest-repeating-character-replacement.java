class Solution {
    public int characterReplacement(String s, int k) {
        int count[]=new int[26];
        int left=0;
        int maxLen=0;
        int maxFreq=0;
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'A']++;
            maxFreq=Math.max(maxFreq, count[s.charAt(i)-'A']);
            while((i-left+1)-maxFreq>k){
                count[s.charAt(left)-'A']--;
                    left++;

            }
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}