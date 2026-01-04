class Solution {
    public int missingNumber(int[] nums) {
        int i;
        int n = nums.length;
        int sum = 0;
        int actual = (n*(n+1))/2;
        for(i = 0; i<n;i++){
            sum+=nums[i];
        }
        return actual-sum;
        
    }
}