class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        // if n is a power of two its binary rep has the first digit as 1 followed by zeroes, and n-1 has the first digit as 0 followed by ones, so performing bitwise AND will give us 0 if it is indeed a power of 2
        if((n & n-1) == 0)
        return true;
        else
        return false;
        
    }
}