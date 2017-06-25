public class SolutionSearchMatrix {
     /* b search. 
      *
      */

    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        int i = 0;
        int len = matrix.length - 1;
        while(i <= len){
            if(matrix[i].length >= 1 &&(matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target)){
                int l1 =0;
                int h1 = matrix[i].length - 1;
                while(l1 <= h1){
                    int m1 = (h1 - l1)/2 + l1;
                    System.out.println(matrix[i][m1] );
                    if(matrix[i][m1] == target){
                        found = true;
                        return found;
                    }
                    else if (target < matrix[i][m1] ) h1 = m1 -1;
                    else l1 = m1 + 1;
                }
                
                
            }
            i++;
            
        }
        
        return found;
    }
}