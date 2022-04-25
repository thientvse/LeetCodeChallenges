class Solution {
    public int maxProfit(int[] prices) {
         int valueBuy = prices[0];
            int valueSell = 0;

            for (int i = 0; i < prices.length; i++) {

                if (valueBuy >= prices[i]){
                    valueBuy = prices[i];
                } else {
                    if (valueSell <= ( prices[i] - valueBuy)){
                        valueSell = prices[i] - valueBuy;
                    }

                }


            }

            return  valueSell;
    }
}