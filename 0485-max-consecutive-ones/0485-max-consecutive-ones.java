class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int max_count = 0;
        int count = 0;
        int n = nums.length;
        for(i = 0; i<n; i++){
            
            if(nums[i] == 1){
                count++;
                if(count > max_count)
                max_count = count;
            }
            if(nums[i] == 0){
                if(count > max_count)
                max_count = count;
                count = 0;
            }
        }
        return max_count;
        
    }
}