class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int maxcount = 0;
      int count = 0;
      int n = nums.length;
      int i;

     for(i = 0; i<n; i++){
        if(nums[i] == 1)
        count++;
        else{
            maxcount = Math.max(maxcount, count);
            count = 0;


        }
     }
     maxcount = Math.max(maxcount, count);
      return maxcount;
}
}