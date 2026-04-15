class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftmax = 0;
        int rightmax = 0;
        int left = 0;
        int right = n-1;
        int ans = 0;
        int i = 0;
        while((i< n) && (left<=right)){
           if(height[left]< height[right]){
               leftmax = Math.max(leftmax, height[left]);
               ans = ans+ leftmax - height[i];
               left++;
               i++;
           }
           else
           {
            rightmax = Math.max(rightmax, height[right]);
            ans = ans + rightmax - height[i];
            i++;
            right--;
           }
        }
        return ans;
    }
}