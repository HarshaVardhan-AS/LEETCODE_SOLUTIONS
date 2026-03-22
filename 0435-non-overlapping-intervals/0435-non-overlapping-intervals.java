class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[1]-b[1]);
        int last = intervals[0][1];
        int n = intervals.length;
        int count = 1;
        for(int i= 1; i<n; i++){
            int start = intervals[i][0];
            if(start>=last){
                count++;
                last = intervals[i][1];
            }

        }
        return n - count;
        
    }
}