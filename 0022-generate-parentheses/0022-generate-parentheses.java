class Solution {
    List<String>result=new ArrayList<>();
    void solve(StringBuilder str, int n, int open, int close){
        if(str.length()==2*n){
            result.add(str.toString());
        }
        if(open<n){
            str.append("(");
            solve(str, n, open+1, close);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open)
        {
            str.append(")");
            solve(str, n, open, close+1);
            str.deleteCharAt(str.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder str=new StringBuilder();
        int open=0;
        int close=0;
        solve(str, n, open, close);
        return result;
        
    }
}