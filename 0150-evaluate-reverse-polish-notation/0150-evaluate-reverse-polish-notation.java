class Solution {
    int Operate(int a, int b, String token){
        if(token.equals("+")){
            return a+b;
        }
        if(token.equals("-")){
            return a-b;
        }
        if(token.equals("*")){
            return a*b;
        }
        if(token.equals("/")){
            return a/b;
        }
    return -1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")|| token.equals("-")|| token.equals("*")||token.equals("/")){
                
                int a=st.pop();

                int b=st.pop();
             
                int result=Operate(b, a, token);
                st.push(result);

            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}