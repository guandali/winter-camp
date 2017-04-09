public class SolutionBestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null) return 0;
        int len = prices.length;
        int max = 0;
        for(int i = 0; i < len; i++ ){
            for(int j = 0; j < i; j ++){
                if (prices[i] - prices[j] > max){
                    max = prices[i] - prices[j];
                }
            }
        }
        
        return max;
            
        }
        
 
}