class SolutionflipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A.length; i++){
            int j = 0; 
            int k = A[0].length-1;
            while(j<=k){
                int tmp = A[i][j];
                if(A[i][k]==0) A[i][j] = 1;
                else A[i][j] = 0;
                if(tmp == 0) A[i][k] = 1;
                else A[i][k] = 0;
                j++;
                k--;
            }
        }
        return A;
    }
}