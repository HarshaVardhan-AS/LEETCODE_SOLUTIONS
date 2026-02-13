class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int res1 = 0;
        int res2 = 0;
        int left = 0;
        int sum = 0;
        for(int right = 0; right<n; right++){
            sum = sum + nums[right];
            while(sum > goal){
                sum-=nums[left];
                left++;
            }
            res1+= (right-left +1);

        }
        left = 0;
        sum = 0;
        if(goal == 0)
        res2 = 0;
        else{
        for(int right = 0; right<n; right++){
            sum = sum + nums[right];
            while((sum > goal-1)){
                sum-= nums[left];
                left++;
            }
            res2+= (right-left+1);
        }
        }
        return res1 - res2;
        
    }
}