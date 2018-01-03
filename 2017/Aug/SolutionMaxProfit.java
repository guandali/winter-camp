class SolutionMaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        buy[0] = 0 - prices[0];
        sell[0] = 0;
        for(int i = 1; i < prices.length; i++){
            buy[i] = Math.max((i-2 < 0 ?(buy[i-1]):(sell[i-2] - prices[i])), Math.max(buy[i-1], (i -2 < 0)?(0 - prices[i]):(sell[i-2] -                            prices[i])));
            sell[i] = Math.max(buy[i-1] + prices[i], sell[i-1]);
        }
        return Math.max(buy[prices.length -1],sell[prices.length -1]);
        
    }
}