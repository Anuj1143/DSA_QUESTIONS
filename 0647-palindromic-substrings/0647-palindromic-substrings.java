class Solution {
    static Boolean dp[][];
    public boolean check(String s, int i, int j){
        if(i>j){
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=check(s, i+1, j-1);
        }
        return dp[i][j]=false;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        dp=new Boolean[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n; j++){
                if(check(s, i, j)){
                    count++;
                }
            }
        }
        return count;
        
    }
}