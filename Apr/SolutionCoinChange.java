public class SolutionCoinChange {
    public int coinChange(int[] coins, int amount) {
    //     int len = coins.length;
    //     if(len <= 0) return -1;
    //     if (amount == 0) return 0;
    //     int [] dp = new int [amount + 1];
    //     dp[0] = 0;
    //     Arrays.fill(dp, Integer.MAX_VALUE);
    //     for(int i = 1; i <= amount; i++){
    //         for(int j = 0; j < len ; j++){
    //             if( coins[j] <= i && dp[i - coins[j]] != Integer.MAX_VALUE){
    //                 dp[i] = Math.min(dp[i], 1+dp[i - coins[j]]); 
    //             }
                
                
    //         }
    //     }
        
    //     return (dp[amount] == Integer.MAX_VALUE)?(-1):(dp[amount]);
    // }
       if (amount < 0|| coins == null) return 0;
       int [] dp = new int [amount +1];
       return helper(coins, amount, dp);
    }
    private int helper(int [] coins, int rem, int [] dp){
        if (rem < 0) return -1;
        else if (rem == 0) return 0;
        else {
            dp[rem] = Integer.MAX_VALUE;
            for (int coin : coins){
                int result = helper(coins, rem - coin, dp);
                if (result != -1) {
                dp[rem] = Math.min(dp[rem], result + 1);
                }
            }
        }
        return (dp[rem] == Integer.MAX_VALUE)? -1 : dp[rem];
    }
        
}