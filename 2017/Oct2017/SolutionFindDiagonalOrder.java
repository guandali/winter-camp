class SolutionFindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if(m < 1) return new int[0];
        int n = matrix[0].length;
        int [] ans = new int[n * m];
        int count = 0; 
        int i = 0; 
        int j = 0; 
        boolean isUP = true;
        while(count < m * n){
            if((i >= m || i < 0)||(j >= n || j < 0)) break;
            ans[count] = matrix[i][j];
            if(isUP){
                if(i - 1>= 0 && j + 1 < n){
                    i--;
                    j++;
                }
                else {
                    if(i - 1 < 0 && j + 1 >= n) i++;
                    else if(i -1 < 0) j++;
                    else i++;
                    isUP = false;
                }
            }
            else {
                if(i + 1 < m && j - 1 >= 0){
                    i++;
                    j--;
                }
                else{
                    if (j - 1 < 0 && i + 1 >= m)  j++;
                    else if(j - 1 < 0) i++;
                    else j++; 
                    isUP = true;
                }
            }
            count++;
        }
        return ans;
        
    }
}