class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
       int n = intervals.length;
       List<int[]> res = new ArrayList<>();
       int[] cur = intervals[0];
       for(int i = 0; i<n; i++){
        int[] next = intervals[i];
        if(cur[1] >= next[0]){
            cur[1] = Math.max(cur[1], next[1]);

        }
        else{
            res.add(cur);
            cur = next;
        }
       }
       res.add(cur);
       return res.toArray(new int[res.size()][]);
    }
}