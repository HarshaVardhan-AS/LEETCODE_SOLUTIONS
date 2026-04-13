class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[1]-b[1]);
        int n = intervals.length;
        int lastend = intervals[0][1];
        int i;
        int count = 1;
        for(i = 1; i<n; i++){
            int newstart = intervals[i][0];
            if(newstart >= lastend){
                count++;
                lastend = intervals[i][1];
            }
        }
        return n - count;
        
    }
}