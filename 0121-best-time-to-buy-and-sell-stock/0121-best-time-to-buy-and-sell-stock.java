class Solution {
    public int maxProfit(int[] prices) {
        
        var maxProfit = 0;
        
        var left = 0;
        var right = 1;
        
        while (right < prices.length){
            var profit = prices[right] - prices[left];
            
            if(prices[left] < prices[right]){
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }
            
            right += 1;
            
        }
        
        return maxProfit;
    }
}