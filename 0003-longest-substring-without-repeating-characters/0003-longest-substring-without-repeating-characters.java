class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLen=Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}