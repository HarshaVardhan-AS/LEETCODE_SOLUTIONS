class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k%n;
       flip(nums, 0, n-1);
       flip(nums, 0, k-1);
       flip(nums, k, n-1);
       //for right rotate we first flip the entire array, then flip till k-1, then flip k to n-1
    }
    public void flip(int[] nums, int start, int end){
        int temp;
        while(start <end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}