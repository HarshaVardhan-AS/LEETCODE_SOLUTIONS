class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        int n2 = nums2.length;
        for(i = n2-1; i>=0; i--){
            while(!st.isEmpty() && nums2[i]>= st.peek())
            st.pop();
            if(st.isEmpty())
            map.put(nums2[i], -1);
            else
            map.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }
        int n1 = nums1.length;
        int[] ans = new int[n1];
        for(i = 0; i<n1; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}