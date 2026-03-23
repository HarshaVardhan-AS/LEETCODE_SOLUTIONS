class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        if(n == 1)
        return true;
        while(n!=1){
            int ognum = n;
            int ans = 0;
            while(ognum > 0){
                int rem = ognum%10;
                ans = ans + (rem*rem);
                ognum/=10;
                
            }
            if(set.contains(ans))
            return false;
            set.add(ans);
            n = ans;
        }
        return true;
        
    }
}