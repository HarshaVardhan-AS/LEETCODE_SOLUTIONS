class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int i;
        int high = 0;
        int low = weights[0];
        for(i = 0; i<n; i++){
            high+= weights[i];
            if(weights[i] > low)
            low = weights[i];
        }
        int ans = 0;
        while(low<= high){
            int mid = low + (high-low)/2;
            int daycount = 0;
            int currweight = 0;
            for(i = 0; i<n; i++){
               if(currweight+ weights[i] <= mid){
                currweight+= weights[i];
               }
               else{
                daycount++;
                currweight = weights[i];
               }
            }
            daycount++;
            if(daycount<= days){
                ans = mid;
            high = mid-1;
            }
            else
            low = mid+1;

        }
        return ans;
        
    }
}