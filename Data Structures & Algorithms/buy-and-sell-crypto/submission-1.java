class Solution {
    public int maxProfit(int[] prices) { // Brute force
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) { // Buy day
            for(int j = i + 1; j < prices.length; j++) { // Sell day
                int profit = prices[j] - prices[i];
                if(profit > maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
