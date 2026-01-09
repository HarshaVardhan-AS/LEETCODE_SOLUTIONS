class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind1 = -1;
        int ind2 = 0;
        int i;
        for(i = n-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                ind1 = i-1;
                break;
            }
        }
        if(ind1 == -1){
            reverse(nums, 0, n-1);
            return;
        }
        for(i= n-1; i>=ind1; i--){
            if(nums[i] > nums[ind1] ){
                ind2 = i;
                break;
            }
        }
        int temp = nums[ind1];
        nums[ind1]= nums[ind2];
        nums[ind2]= temp;
        reverse(nums, ind1+ 1, n-1);

        
    }
    public static void reverse(int[] nums, int start, int end){
        int temp;
        while(start < end ){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}