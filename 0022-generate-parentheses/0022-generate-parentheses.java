class Solution {
    List<String>result=new ArrayList<>();
    
    void solve(StringBuilder curr, int n, int open, int close){
        if(curr.length()==2*n){
            
                result.add(curr.toString());
            
            return;
        }
        if(open<n){
             curr.append("(");
            solve(curr, n ,open +1, close);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(")");
        solve(curr,n, open, close+1);
        curr.deleteCharAt(curr.length()-1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder curr=new StringBuilder();
        int open=0;
        int close=0;

        solve(curr, n , open, close);
        return result;
    }
}