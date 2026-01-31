class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, res, temp);
        return res;
        
    }
    public static void solve(int idx, int[] arr, List<List<Integer>> res, List<Integer> temp){
        if(idx == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[idx]);
        solve(idx+1, arr, res, temp);
        temp.remove(temp.size()-1);
        while((idx < arr.length -1) && arr[idx] == arr[idx+1] )
        idx = idx+1;
        solve(idx+1, arr, res, temp);
        
    }
}