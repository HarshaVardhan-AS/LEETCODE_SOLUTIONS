class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        int idx = 0;
        List<Integer> temp = new ArrayList<>();
        solve(res, 0, n, nums, temp);
        return res;
        
    }
    public void solve(List<List<Integer>> res, int idx, int n, int[] nums, List<Integer> temp){
        if(idx == n){
            res.add(new ArrayList<>(temp));
            return;
        }
        solve(res, idx+1, n, nums, temp);
        temp.add(nums[idx]);
        solve(res, idx+1, n,nums,temp);
        temp.remove(temp.size()-1);

    
    }
}