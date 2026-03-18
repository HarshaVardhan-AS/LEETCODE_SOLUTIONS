class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ind = new HashMap<>();
        int n = nums.length;
        int[] res = new int[2];
        for(int i = 0; i<n; i++){
            int needed = target - nums[i];
            if(ind.containsKey(needed)){
                res[0] = i;
                res[1] = ind.get(needed);
                break;
            }
            else
            ind.put(nums[i], i);
        }
        return res;
        
    }
}