class Solution {
    List<String>result=new ArrayList<>();
    boolean isValid(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='(')
                count++;
            else
                count--;
                if(count<0){
                    return false;
                }
            
        }
        return count==0;
    }
    void solve(StringBuilder curr, int n){
        if(curr.length()==2*n){
            if(isValid(curr.toString())){
                result.add(curr.toString());
            }
            return;
        }
        curr.append("(");
        solve(curr, n);
        curr.deleteCharAt(curr.length()-1);
        curr.append(")");
        solve(curr,n);
        curr.deleteCharAt(curr.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder curr=new StringBuilder();

        solve(curr, n);
        return result;
    }
}