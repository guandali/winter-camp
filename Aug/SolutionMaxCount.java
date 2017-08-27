class SolutionMaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops ==null || ops.length < 1) return m * n;
        int min_i = ops[0][0];
        int min_j = ops[0][1];
        for(int i = 1; i < ops.length; i++){
            min_i = Math.min(min_i, ops[i][0]);
            min_j = Math.min(min_j, ops[i][1]);
        }
        return min_i * min_j;
    }
}