class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int i;
        int n = s.length();
        int count = 0;
        for(i = 0; i<n; i++){
            if(s.charAt(i) == '('){
                count++;
                if(count == 1)
                continue;
                
                sb.append(s.charAt(i));
                
            }
            else
            {
                count--;
                if(count == 0)
                continue;
                else
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
    }
}