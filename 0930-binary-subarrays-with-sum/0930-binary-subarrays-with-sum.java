class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       int currsum = 0;
       int res = 0;
       map.put(0,1);
       for(int i = 0; i <n; i++){
        currsum+= nums[i];
        int target = currsum - goal;
        if(map.containsKey(target))
        res+= map.get(target);
        map.put(currsum, map.getOrDefault(currsum, 0)+1);


       }
       return res;
    }
}