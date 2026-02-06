class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, candidates, target, res, temp);
        return res;
       
        
    }
    public static void solve(int idx, int[] arr, int target, List<List<Integer>> res, List<Integer> temp){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(idx == arr.length)
        return;
        if(arr[idx]<=target){
            temp.add(arr[idx]);
            solve(idx, arr, target-arr[idx], res, temp);
            temp.remove(temp.size()-1);
        }
        solve(idx+1, arr, target, res, temp);
    }
       
}