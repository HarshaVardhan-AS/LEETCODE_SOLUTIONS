class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxcount = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
            count++;
            
            }
            else if(ch == ')')
            count--;
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
        
    }
}