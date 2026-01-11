class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(i = 0; i<n; i++){
            sum+= nums[i];
            
            int target = sum - k;
            if(map.containsKey(target))
            count+= map.get(target);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}