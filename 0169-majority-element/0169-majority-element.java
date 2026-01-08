class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int i;
        int count = 1;
        int element = nums[0];
        for(i = 1; i<n; i++){
            if(count == 0){
                element = nums[i];
                count = 1;
            }
            else if (nums[i] != element){
                count--;
            }
            else if(nums[i] == element)
            count++;
            
        }
        return element;
        
    }
}