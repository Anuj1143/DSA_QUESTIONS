class MinStack {
        Stack<Long>st=new Stack<Long>();
        Long min;
    public MinStack() {
        min=Long.MAX_VALUE;
    }
    
    public void push(int value) {
        Long val= Long.valueOf(value);
        if(st.isEmpty()){
            min=val;
            st.push(val);
        }
        else{
            if(val<min){
                st.push(2*val-min);
                min=val;
            }
            else{
                st.push(val);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        Long val=st.pop();
        if(val<min){
            min=2*min-val;

        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        Long val=st.peek();
        if(val<min){
            return  min.intValue();
        }
        else{
            return val.intValue();
        }
        
    }
    
    public int getMin() {

        return min.intValue();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */