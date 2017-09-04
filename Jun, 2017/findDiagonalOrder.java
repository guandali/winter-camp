public class SolutionFindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length < 1) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length; 
        int [] ans = new int[n*m];
        boolean up = true;
        int i = 0;
        int j = 0;
        int count = 0;
        while(count < n * m){
            System.out.println("count" + count);
            System.out.println("i" + i);
            System.out.println("j" + j);
            ans[count] = matrix[i][j];
            if(up){
                if(i - 1 < 0 || j + 1 > n -1){
                      if(i - 1 < 0 && j + 1 > n -1){
                          i += 1;
                      }
                      else if (j + 1> n -1){
                          i += 1;
                      }
                      else {
                          j += 1;
                      }
                      up = false;
                }
                else {
                    i -= 1;
                    j += 1;
                }
            }
            else{
                if(i + 1> m -1 || j - 1 < 0 ){
                    if(i + 1> m -1 && j - 1 < 0 ){
                        j += 1;
                    }
                    else if(i + 1> m -1){
                        j += 1;
                    }
                    else {
                        i += 1;
                    }
                    up = true;
                    
                }
                else{
                    i += 1;
                    j -= 1;
                }
                
            }
            count++;
            
        }
        return ans;
        
    }
    
}