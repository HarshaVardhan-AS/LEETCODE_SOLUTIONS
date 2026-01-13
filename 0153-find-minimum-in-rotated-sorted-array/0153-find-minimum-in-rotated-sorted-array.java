class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[low]<= nums[mid]){ // left half is sorted
                  res = Math.min(nums[low], res);
                  low = mid+1;
            }
            else{// right half is sorted
                res = Math.min(nums[mid], res);
                high = mid-1;
            }
        }
        return res;
    }
}