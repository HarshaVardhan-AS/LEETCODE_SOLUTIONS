class Solution {
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long mod = (long)(1e9 + 7);
        long res = ((pow(5, even)%mod) * (pow(4, odd)%mod))%mod;
        return (int)res;
        
    }
    long pow(long x, long n){
        long mod = (long)(1e9 + 7);
        if(n == 0)
        return 1;
        else if (n== 1)
        return x;
        else{
            if(n%2 == 0){
                return pow((x*x)%mod, n/2);
            }
            else
            return (x * pow(x, n-1))%mod;
        }

    }
}