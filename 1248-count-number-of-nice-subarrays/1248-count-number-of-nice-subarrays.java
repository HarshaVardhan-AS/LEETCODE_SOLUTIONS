class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int r1 = 0;
        int r2 = 0;
        int count = 0;
        for(int right = 0; right<n; right++){
            if(nums[right]%2 == 1)
            count++;
            while(count> k){
                if(nums[left]%2 == 1)
                count--;
                left++;
            }
            r1 = r1+ (right-left+1);
        }
        left = 0;
        count = 0;
        if(k == 0)
        r2 = 0;
        else{
            for(int right = 0; right<n; right++){
            if(nums[right]%2 == 1)
            count++;
            while(count> k-1){
                if(nums[left]%2 == 1)
                count--;
                left++;
            }
            r2 = r2+ (right-left+1);
        }
        }
        return r1 - r2;
    }
}