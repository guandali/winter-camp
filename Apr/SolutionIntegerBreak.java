public class SolutionIntegerBreak {
    public int integerBreak(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp, 0);
        dp[2] = 1;
        for(int i = 3; i <= n; i++){
            for(int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i], Math.max(dp[j], j) * Math.max(dp[i - j], i - j ));
                
            }
        }
        return dp[n];
        
    }
}