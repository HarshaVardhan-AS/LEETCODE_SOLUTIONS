class MinStack {
    long minval;
    Stack<Long> st = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
         if (st.isEmpty()) {
        st.push((long)val);
        minval = (long)val;
    }
        else if(val < minval){
            long x = 2L*val - minval;
            st.push(x);
            minval = val;

        }
        else
        st.push((long)val);
        
    }
    
    public void pop() {
        if(st.peek() < minval){
            long prevmin = 2L*minval - st.peek();
            st.pop();
            minval = prevmin;
        }
        else
        st.pop();
        
    }
    
    public int top() {
        long top = st.peek();
        if(st.peek() >= minval)
        {
            
            return (int)top;
        }
        else
        return (int)minval;
        
    }
    
    public int getMin() {
        return (int)minval;
        
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