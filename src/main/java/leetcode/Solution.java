package leetcode;

public class Solution {
    public static int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            max_profit = Math.max(max_profit, prices[i] - min_price);
            min_price = Math.min(prices[i], min_price);
        }

        return max_profit;
    }
}