public class SolutionUniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][]nums = obstacleGrid;
        int m = obstacleGrid.length;
        if(m < 1) {
            return 0;
        }
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        boolean flag = true;
        int i = 0;
        for(i=0; i < n; i++){
            if(flag && nums[0][i] != 1){
                dp[0][i] = 1;
            }
            else {
               flag = false;
               dp[0][i] = 0;
            }
        }
        for(i=0, flag = true; i < m; i++){
            if(flag && nums[i][0] != 1){
                dp[i][0] = 1;
            }
            else {
               flag = false;
               dp[i][0] = 0;
            }
        }
        
        for(i=1; i < n; i++ ){
            for(int j=1; j < m; j++ ){
                if(nums[j][i] == 1){
                    dp[j][i] = 0;
                }
                else {
                  dp[j][i] = dp[j-1][i] +dp[j][i-1];
                }
            }
            
        }
        
        return dp[m-1][n-1];
        
        
    }
}
