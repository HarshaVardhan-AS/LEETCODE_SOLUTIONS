class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int i;
        int n = s.length();
        int count = 0;
        for(i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == '('){
                if(count > 0){
                sb.append(s.charAt(i));
                count++;
                }
                else
                count++;
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