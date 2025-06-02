class Solution {
    public boolean isPalindrome(int n) {

        int rev=0;
        int curr=n;
        while(n>0){
            int temp=n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
        if(curr==rev){
            return true;
        }
        
        return false;
        
    }
}