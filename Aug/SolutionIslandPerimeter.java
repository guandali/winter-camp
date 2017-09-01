public class SolutionIslandPerimeter {
    private int ans = 0;
    private int m = 0;
    private int n = 0;
    private int [][] grid;
    public int islandPerimeter(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        if(m < 1) return ans;
        n = grid[0].length; 
        if(n < 1 ) return ans;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    helper(i, j);
                    return ans;
                }
            }
            
        }
        return ans;
    }
    
    private void helper(int i, int j){
        if((i >= m || i < 0 || j >= n || j < 0) || grid[i][j] == 0) {
            ans++;
            return;
        }
        else if(grid[i][j] == 1){
            grid[i][j] = 3;
            helper(i, j-1);
            helper(i, j+1);
            helper(i-1, j);
            helper(i+1, j);
            return;
        }
        else if(grid[i][j] == 3) return;
        
    }
}