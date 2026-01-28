class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String s = "";
        solve(s, n, res, 0, 0);
        return res;
        
    }
    public void solve(String s, int n, List<String> res, int open, int close){
        if(s.length() == 2*n){
            res.add(s);
            return;

        }
        if(open<n){
            solve(s + "(", n , res, open+1, close);
        }
        if(close< open){
            solve(s + ")", n, res, open, close+1);
        }
    }
}