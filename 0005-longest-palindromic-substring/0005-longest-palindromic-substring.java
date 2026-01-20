class Solution {
    public String longestPalindrome(String s) {
        int leftb = 0;
        int n = s.length();
        int rightb = n-1;
        int left;
        int right;
        int i;
        int maxlen = 0;
        String res = s.substring(0,1);
        int len;
        
        for(i = 0; i<n; i++){
            len = 1;
            left = i-1;
            right = i+1;
            while(left >= leftb && right <= rightb ){
                if(s.charAt(left)!= s.charAt(right))
                break;
                if(s.charAt(left) == s.charAt(right) && (left >= leftb && right <= rightb)){
                    len+=2;
                    if(len> maxlen){
                        maxlen = len;
                        res = s.substring(left, right+1); 
                    }
                    
                }
                left--;
                right++;
            }
            len = 0;
            left = i;
            right = i+1;
            while(left >= leftb && right <= rightb ){
                if(s.charAt(left)!= s.charAt(right))
                break;
                if(s.charAt(left) == s.charAt(right) && (left >= leftb && right <= rightb)){
                    len+=2;
                    if(len> maxlen){
                        maxlen = len;
                        res = s.substring(left, right+1); 
                    }
                    
                }
                left--;
                right++;
            }
        }
        return res;

    }
}