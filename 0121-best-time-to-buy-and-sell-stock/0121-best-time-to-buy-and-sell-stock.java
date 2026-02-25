class Solution {
    public int maxProfit(int[] prices) {
       int minprice = prices[0];
       int maxprofit = 0;
       int n = prices.length;
       for(int i = 1; i<n; i++){
        if(prices[i] < minprice){
            minprice = prices[i];
        }
        else{
            maxprofit = Math.max(maxprofit, prices[i] - minprice);
        }
       }
       return maxprofit;
    }
}