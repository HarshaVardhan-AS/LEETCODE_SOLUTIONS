class Solution {
    public int searchInsert(int[] nums, int target) {
       int low = 0;
       int n = nums.length;
       int high = n-1;
       int idx = 0;
       while(low<=high){
        int mid = low+ (high-low)/2;
        if(nums[mid]< target){
            idx = mid+1;
            low = mid+1;
        }
        else if(nums[mid] > target)
        high = mid-1;
        else if(nums[mid] == target)
        {
            idx = mid;
            break;
        }
       }
       return idx;
        
    }
}