class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length()-1, false);
    }
    public boolean isPalindrome(String s, int left, int right, boolean deleted){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                if(deleted) return false;
                return isPalindrome(s, left+1, right, true)|| isPalindrome(s, left, right-1, true);
            }
            left++;
            right--;

        }
        return true;
    }
}