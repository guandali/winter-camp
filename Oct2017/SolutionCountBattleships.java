class SolutionCountBattleships {
    char [][] board;
    public int countBattleships(char[][] board) {
        this.board = board;
        int ans = 0;
        if(board.length < 1) return ans;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                  if(this.board[i][j] == 'X' && !isConnected(i, j)) {
                      ans++;
                      
                  }
            }
            
        }
        return ans;
    }
    private boolean isConnected(int i, int j){
        if(i - 1 >= 0 && board[i-1][j] == 'X') return true;
        if(j - 1 >= 0 && board[i][j-1] == 'X') return true;
        return false;
        
    }
}