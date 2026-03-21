class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] sol = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && temperatures[st.peek()]<= temperatures[i])
            st.pop();
            if(st.isEmpty())
            sol[i] = -1;
            else
            sol[i] = st.peek();
            st.push(i);
        }
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            int curr = i;
            int ans = sol[i];
            if(ans == -1)
            res[i] = 0;
            else
            res[i] = ans - curr;
        }
        return res;
        
    }
}