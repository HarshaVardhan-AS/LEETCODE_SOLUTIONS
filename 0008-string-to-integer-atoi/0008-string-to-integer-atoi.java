class Solution {
    public int myAtoi(String s) {
        long res = 0;
        int n = s.length();
        boolean neg = false;
        int i = 0;
        if(n == 0)
        return 0;
        while((i < n) && (s.charAt(i)== ' '))
        i++;
        if(i == n)
        return 0;
        if(s.charAt(i) == '-'){
        neg = true;
        i++;
        }
        else if(s.charAt(i) == '+')
        i++;
        while(i<n && (Character.isDigit(s.charAt(i))) ){
            int digit = s.charAt(i) - '0';
            if ((res * 10 + digit) > Integer.MAX_VALUE)
{
                if(neg)
                return Integer.MIN_VALUE;
                else
                return Integer.MAX_VALUE;
            }
       
        
            res = res*10 + digit;
            i++;
        }
        if(neg)
        res = res*(-1);
        
        
        
        return (int)res;
        
    }
}