class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int i;
        int n = bloomDay.length;
        int high = bloomDay[0];
        int low = bloomDay[0];
        for(i = 1; i<n; i++){
            if(bloomDay[i] > high)
            high = bloomDay[i];
            else if(bloomDay[i] < low)
            low = bloomDay[i];
        }
        if((long)m * (long)k > n)
        return -1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int streak = 0;
            int boq = 0;
            for(i = 0; i<n; i++){
                if(bloomDay[i] <= mid )
                streak++;
                if(streak == k){
                    boq++;
                    streak = 0;
                }
                else if (bloomDay[i] > mid){
                    streak = 0;
                }
            }
            if(boq<m){
                low = mid+1;
            }
            else if(boq >=m){
                ans = mid;
                high = mid-1;
            }

        }
        return ans;
        
    }
}