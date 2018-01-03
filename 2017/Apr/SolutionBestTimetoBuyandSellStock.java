public class SolutionBestTimetoBuyandSellStock {
    // public int maxProfit(int[] prices) {
    //     if(prices == null) return 0;
    //     int len = prices.length;
    //     int max = 0;
    //     for(int i = 0; i < len; i++ ){
    //         for(int j = 0; j < i; j ++){
    //             if (prices[i] - prices[j] > max){
    //                 max = prices[i] - prices[j];
    //             }
    //         }
    //     }
        
    //     return max;
            
    //     }
        public int maxProfit(int[] prices) {
        //one-pass solution 
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int len = prices.length;
        for(int i = 0; i < len; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                if(prices[i] - minPrice > maxProfit){
                   maxProfit =  prices[i] - minPrice;
                }
            }
        }
        return maxProfit;
        
            
        }
        
        
 
}