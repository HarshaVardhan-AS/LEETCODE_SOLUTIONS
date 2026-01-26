class Solution {
    public double myPow(double x, int n) {
        long N = (long)n;
        if(N<0){
            x = 1/x;
            N = (-1)*N; 
        }
        return solve(x,N);

        
    }
    public double solve(double x, long n){
        if(n == 0)
        return 1;
        else if(n == 1)
        return x;
        if(n%2 == 0.0){
            return solve(x*x, n/2);
        }
        else
        return x * solve(x, n-1);
       
    }
}