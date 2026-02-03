class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> t1 = new ArrayList<>();
        solve(0,s, res, t1);
        return res;
        
    }
    public void solve( int idx, String s, List<List<String>> res, List<String> temp){
        if(idx == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
    
        for(int i = idx; i<s.length(); i++){
            if(isPali(s, idx, i)){
                temp.add(s.substring(idx, i+1));
                solve(i+1, s, res, temp);
                temp.remove(temp.size()-1);
                


                
            }
            else
            continue;

        }
 
    }
    public boolean isPali(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!= s.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;
    }
}