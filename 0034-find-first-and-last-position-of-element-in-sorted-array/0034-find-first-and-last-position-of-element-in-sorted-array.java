class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = n;
        int ub = n;
        int low = 0;
        int high = n-1;
        int[] res = new int[2];
        while(low<= high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                lb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(lb == n || nums[lb]!= target){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        else{
            low = 0;
            high = n-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] > target){
                    ub = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            res[0] = lb;
            res[1] = ub-1;
            return res;
        }
        
    }
}