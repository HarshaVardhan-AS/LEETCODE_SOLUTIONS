class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        int currentend =0 ;
        int i;
        int jumps = 0;
        for(i = 0; i<n-1; i++){
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currentend){
                jumps++;
                currentend = farthest;
            }
        }
        return jumps;
    }
}