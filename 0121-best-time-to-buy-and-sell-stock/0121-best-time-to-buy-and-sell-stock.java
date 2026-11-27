class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i;
        int mincost = prices[0];
        int max = 0;
        for(i = 1; i<n; i++){
            if(prices[i] < mincost)
            mincost = prices[i];
            else
            max = Math.max(max, prices[i] - mincost);
        }
        return max;
    }
}