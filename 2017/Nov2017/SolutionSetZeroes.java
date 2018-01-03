class class SolutionSetZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        if(m < 1) return;
        int n = matrix[0].length;
        boolean[] cols = new boolean[n];
        boolean[] rows = new boolean[m];
        Arrays.fill(cols, false);
        Arrays.fill(rows, false);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    cols[j] = true;
                    rows[i] = true;
                }
            }
        }
        for(int i = 0; i < m; i++){
            if(rows[i] == true){
                for(int j = 0; j < n; j++) matrix[i][j] = 0;
            }
        }
        
        for(int j = 0; j < n; j++){
            if(cols[j] == true){
                for(int i = 0; i < m; i++) matrix[i][j] = 0;
            }
        }
        return;
    }
} {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        if(m < 1) return;
        int n = matrix[0].length;
        boolean[] cols = new boolean[n];
        boolean[] rows = new boolean[m];
        Arrays.fill(cols, false);
        Arrays.fill(rows, false);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    cols[j] = true;
                    rows[i] = true;
                }
            }
        }
        for(int i = 0; i < m; i++){
            if(rows[i] == true){
                for(int j = 0; j < n; j++) matrix[i][j] = 0;
            }
        }
        
        for(int j = 0; j < n; j++){
            if(cols[j] == true){
                for(int i = 0; i < m; i++) matrix[i][j] = 0;
            }
        }
        return;
    }
}