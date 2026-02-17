class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int left = 0;
        int c1 = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right<n; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0) + 1);
            while(map.size() > k){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0)
                map.remove(nums[left]);
                left++;
            }
            c1+= right-left+1;
        }
        left = 0;
        int c2 = 0;
        map.clear();
        for(int right = 0; right<n; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0) + 1);
            while(map.size() > k-1){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0)
                map.remove(nums[left]);
                left++;
            }
            c2+= right-left+1;
        }
        return c1 - c2;

    }
}