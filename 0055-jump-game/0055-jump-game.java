class Solution {
    public boolean canJump(int[] nums) {
        int maxindex = 0;
        int currindex = 0;
        int n = nums.length;
        int i;
        if(n == 1)
        return true;
        for(i = 0; i<n; i++){
            currindex = i;
            if(maxindex >= currindex){
            maxindex = Math.max(maxindex, currindex + nums[i]);  
            }
        }
        if(maxindex>=n-1)
        return true;
        else
        return false;
        
    }
}