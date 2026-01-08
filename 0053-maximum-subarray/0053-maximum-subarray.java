class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int i;
        int max_sum = nums[0];
        int sum = 0;
        for(i = 0; i<n; i++){
            sum+= nums[i];
            max_sum = Math.max(max_sum, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max_sum;
    }
}