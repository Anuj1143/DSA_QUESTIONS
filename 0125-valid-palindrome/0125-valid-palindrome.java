class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char curfirst=s.charAt(i);
            char curlast=s.charAt(j);
            if(!Character.isLetterOrDigit(curfirst)){
                i++;
            }
            else if(!Character.isLetterOrDigit(curlast)){
                j--;
            }
            else{
                if(Character.toLowerCase(curfirst)!=Character.toLowerCase(curlast)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}