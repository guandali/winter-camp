public class SolutionMaxProfit {
    public int maxProfit(int[] prices) {
        // Two options: buy,  sell
        // Need to buy first before sell it
        if(prices.length < 1 ) return 0;
        int[] sell = new int[prices.length];
        int[] buy = new int[prices.length];
        sell[0] = 0;
        buy[0] = -prices[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < prices.length; i++){
            sell[i] = Math.max(sell[i-1], buy[i-1] +  prices[i]);
            buy[i] = Math.max(buy[i-1], sell[i-1] - prices[i]);
        }
        
        return sell[prices.length -1];
        
        
    }
}