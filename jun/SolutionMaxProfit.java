public class SolutionMaxProfit {
    public int maxProfit(int[] prices) {
        // Two options: buy,  sell
        // Need to buy first before sell it
        if(prices.length < 1 ) return 0;
       // int[] sell = new int[prices.length];
       // int[] buy = new int[prices.length];
        int prev_sell;;
        int prev_buy;
        int buy = -prices[0];;
        int sell = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < prices.length; i++){
            prev_buy = buy;
            prev_sell = sell;
            sell = Math.max(prev_sell, prev_buy +  prices[i]);
            buy = Math.max(prev_buy, prev_sell - prices[i]);
        }
        
        return sell;
        
    }
}