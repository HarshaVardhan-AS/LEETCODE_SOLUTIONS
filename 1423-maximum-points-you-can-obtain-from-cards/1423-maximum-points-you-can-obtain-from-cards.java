class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int n = cardPoints.length;
        int left = 0;
        int score = 0;
        int right = 0;
        for( right = 0; right<k; right++){
            score+= cardPoints[right];
        }
        left = k-1;
        max = score;
        score = 0;
        int currsum = max;
        for(right = n-1; right> n-k-1; right--){
            currsum = currsum - cardPoints[left] + cardPoints[right];
            max = Math.max(currsum, max);
            left--;
        }
        return max;
            
    }
        
}
