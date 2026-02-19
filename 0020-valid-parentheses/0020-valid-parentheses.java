class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '(' ||s.charAt(i) == '{' || s.charAt(i) == '[' )
            st.push(s.charAt(i));
            else if(s.charAt(i) == ')' ){
                if(st.isEmpty())
                return false;
                else if(st.peek()!= '(')
                return false;
                st.pop();
            }
             else if(s.charAt(i) == '}' ){
                if(st.isEmpty())
                return false;
                else if(st.peek()!= '{')
                return false;
                st.pop();
            }
             else if(s.charAt(i) == ']' ){
                if(st.isEmpty())
                return false;
                else if(st.peek()!= '[')
                return false;
                st.pop();     
            }
        }
        if(!st.isEmpty())
        return false;
        else
        return true;
        
    }
}