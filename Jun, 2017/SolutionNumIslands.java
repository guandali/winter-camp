public class SolutionNumIslands {
    // public int numIslands(char[][] grid) {
    //     int count = 0;
    //     boolean added = false;
    //     if(grid.length < 1){
    //         return count;
    //     }
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(grid[i][j] == '1' && (
    //                 (i == 0 && j == 0 )
    //                 || (i == 0 && j > 0 && grid[i][j-1] == '0')
    //                 || (j == 0 && i > 0 && grid[i-1][j] == '0')
    //                 || (j > 0 && i > 0 && grid[i-1][j] == '0' && grid[i][j-1] == '0')
    //                 ))
                    
    //                 {
    //                     int temp_i = i;
    //                     int temp_j = j;
    //                     added = false;
    //                     while(temp_j+1 < n && grid[temp_i][temp_j+1] == '1' && temp_i - 1 >=0 ){
    //                         if(grid[temp_i-1][temp_j+1] == '1'){
    //                             added = true;
    //                             break;
    //                         }
    //                         j++;
    //                     }
    //                     // temp_i = i;
    //                     // temp_j = j;
    //                     // while(!added && temp_i + 1 < m && grid[temp_i+1][temp_j] == '1'){
    //                     //     int left_temp_j = temp_j;
    //                     //     int right_temp_j = temp_j;
                            
    //                     //     while(!added && left_temp_j - 1 >= 0 && grid[temp_i+1][left_temp_j -1] == '1'){
    //                     //         while()
                                
    //                     //         left_temp_j--;
                                
    //                     //     }
    //                     // }
    //                     if(!added){
    //                         count++;
    //                     }
    //                 }
    //         }
    //     }
        
    //     return count;
        
    // }

        private char[][] tb; 
    private int m;
    private int n;
    public int numIslands(char[][] grid) {
        tb = grid.clone();
        m = tb.length;
        int count = 0;
        if(m < 1){
            return 0;
        }
        n = tb[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(tb[i][j] == '1'){
                    helper(i, j);
                    count++;
                }
            }
        }
        
        return count;
        
        
        
    }
    
    public void helper(int i, int j){
        // Terminate condition: out of bound for any of index or not island 
        if(i < 0 || j < 0 || i >= m || j >= n || tb[i][j] != '1'){
            return;
        }
        //Flip the bit 
        tb[i][j] = '0';
        //Expend four way
         helper( i + 1,  j);
         helper( i-1,  j);
         helper( i,  j - 1);
         helper(i, j + 1);
        return;
    }
}
