class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 0;
        int n = nums.length;
        //i is pointer that moves
        // j is the pointer behind i
        //if unique is found since its sorted we place it at j and increment it
        //j always points to the next position where the next unique element should be written
        for(i = 1; i<n; i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];
               
            }
        }
        return j+1;
        
        
    }
}