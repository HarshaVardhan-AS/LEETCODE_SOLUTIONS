class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int maxlength = 0;
        int i;
        for(i= 0 ; i<n; i++)
        set.add(nums[i]);
        for(int num : set){
            int current = 1;
            if(set.contains(num-1))
            continue;
            else{
                while(set.contains(num+1)){
                current++;
                num = num +1;
                }
                maxlength = Math.max(current, maxlength);
            }
        }
        return maxlength;
        
    }
}