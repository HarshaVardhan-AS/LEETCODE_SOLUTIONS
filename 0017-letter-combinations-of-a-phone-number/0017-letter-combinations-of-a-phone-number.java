class Solution {
     String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",
        };
    public List<String> letterCombinations(String digits) {
       
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        solve(0, digits, res, temp);
        return res;
        
    }
    public void solve(int idx, String digits, List<String> res, StringBuilder temp){
        if(temp.length() == digits.length()){
            
            res.add(temp.toString());
            return;
        }
        
        String val = (map[digits.charAt(idx) - '0']);
        for(int i = 0; i< val.length(); i++){
        solve(idx+1, digits, res, temp.append(val.charAt(i)));
        temp.deleteCharAt(idx);
        }
        
    }
}