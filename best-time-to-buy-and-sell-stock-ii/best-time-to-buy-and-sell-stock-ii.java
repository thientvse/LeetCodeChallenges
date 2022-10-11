class Solution {
    public int maxProfit(int[] prices) {
        var totalProfit = 0;
        
        for(var i = 1; i < prices.length; i++){
            if(prices[i]>prices[i-1]){
                totalProfit += prices[i] - prices[i-1];
            }
        }
        
        return totalProfit;
    }
}