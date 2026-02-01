class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(1, n, k, temp, res);
        return res;
        
    }
    public static void solve(int num, int n, int k, List<Integer> temp, List<List<Integer>> res){
        if((temp.size() == k) && (n == 0)){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(temp.size() == k)
        return;
        if(num<=9){
            
            temp.add(num);
            solve(num+1,n - num, k, temp, res );
            temp.remove(temp.size()-1);
            solve(num+1, n,k, temp, res);

        }
        
    }
}