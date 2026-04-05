class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int ans = 0;
        int i;
        int low = 1;
        int max = position[0];
        for(i = 0; i<n; i++){
            if(position[i] > max)
            max = position[i];
        }
        int high = max - position[0];
        while(low<= high){
            int mid = low + (high-low)/2;
            int ballcount =1;
            int lastplaced = position[0];
            for(i = 1; i<n; i++){
                if(position[i]>= lastplaced + mid){
                    ballcount++;
                    lastplaced = position[i];
                }
            }
            if(ballcount >= m){
                ans = mid;
                low = mid+1;
            }
            else
            high= mid-1;
        }
        return ans;
        
    }
}