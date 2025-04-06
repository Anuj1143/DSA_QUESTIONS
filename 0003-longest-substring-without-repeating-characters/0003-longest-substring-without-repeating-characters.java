class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet=new HashSet<>();
        int maxLen=0;
        int left=0;
        for(int right=0; right<s.length(); right++){

            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLen=Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}