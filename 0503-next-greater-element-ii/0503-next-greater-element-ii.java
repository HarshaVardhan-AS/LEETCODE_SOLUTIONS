class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n - 1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i%n])
            st.pop();
            if(st.isEmpty()){
                if(i<n)
                res[i] =-1;
            }

            else{
                if(i<n){
                    res[i] = st.peek();
                }
            }
            
            st.push(nums[i%n]);

            
            
            
        }
        return res;
        
    }
}