class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, candidates, target, res, temp);
        return res;
        
    }
    public static void solve(int idx, int[] arr, int target, List<List<Integer>> res, List<Integer> temp){
       if((target == 0)){
        res.add(new ArrayList<>(temp));
        return;
       }
       if(idx == arr.length)
       return;
       if(arr[idx] > target)
       return;
       temp.add(arr[idx]);
       solve(idx+1, arr, target-arr[idx], res, temp);
       temp.remove(temp.size()-1);
       while((idx < arr.length-1) && (arr[idx] == arr[idx+1]))
       idx++;
       solve(idx+1, arr, target, res, temp);
       
    }
}