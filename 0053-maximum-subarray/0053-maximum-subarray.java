class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int i;
        int max = nums[0];
        int sum = 0;
        for(i = 0; i<n; i++){
            sum = sum+nums[i];
            max = Math.max(max, sum);
            if(sum < 0)
            sum = 0;
        }
        return max;
    }
}