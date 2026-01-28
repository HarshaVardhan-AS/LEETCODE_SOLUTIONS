class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        String s = "";
        solve(s,n,res);
        return res;
        
    }
    public void solve(String s, int n, List<String> res){
        if(s.length() == n){
            res.add(s);
            return;
        }
        solve(s + "1",n, res);
        if(s.length() == 0 || (s.charAt(s.length()-1))!='0')
        solve(s + "0", n, res);

    } 
}