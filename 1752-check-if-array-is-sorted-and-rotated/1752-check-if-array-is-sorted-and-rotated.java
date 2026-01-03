class Solution {
    public boolean check(int[] nums) {
        boolean sorted = false;
        int i;
        int n = nums.length;
        int count = 0;
        for(i = 0; i<n; i++){
            if(nums[i] > nums[(i+1)%n])
            count++;
        }
        if(count<=1)
        return true;
        else
        return false;
        
    }
}