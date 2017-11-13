class SolutionLongestPalindromeSubseq {
    int maxLen = 1;
    String s = null;
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        this.s = s; 
        this.dp = new int[s.length()][s.length()];
        for (int[] row : dp) Arrays.fill(row, -1);
        for(int i = 0; i < s.length(); i++){
            maxLen = Math.max(helper(i,i+1), maxLen);
            maxLen = Math.max(helper(i,i+2) + 1, maxLen);
        }
        return this.maxLen;
    }
    private int helper(int i, int j){
        int saved_i = i;
        int saved_j = j;
        if(j >= this.s.length() || i < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int sum = 0;
        while(i >= 0 && j < this.s.length()){
            if(this.s.charAt(j) == this.s.charAt(i)) {
                j++;
                i--;
                sum +=2;
            }
            else {
                sum += Math.max(helper(i, j+1), helper(i-1, j));
                dp[saved_i][saved_j] = sum;
                break;
            }
        }
        return sum;
    }
}