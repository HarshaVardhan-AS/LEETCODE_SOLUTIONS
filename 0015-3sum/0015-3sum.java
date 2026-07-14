class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int i;
        
        Arrays.sort(nums);
        for(i =0; i<n; i++){
            int j = i+1;
            int k = n-1;
            int target = -nums[i];
            if(i > 0 && (nums[i] == nums[i-1]))
            continue;
            while(j<k){
                int sum = nums[j] + nums[k];
                if(sum < target){
                    j++;
                }
                else if(sum > target){
                    k--;
                }
                else if(sum == target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    while(j<k && nums[j] == nums[j+1])
                j++;
                while(j < k && nums[k] == nums[k-1])
                k--;
                j++;
                k--;
                }
                
            }
        }
        return res;
        
    }
}