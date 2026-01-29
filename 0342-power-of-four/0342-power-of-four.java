class Solution {
    public boolean isPowerOfFour(int n) {
        double res = Math.log10(n)/Math.log10(4);
        if(res%1 == 0)
        return true;
        else
        return false;
        
    }
}