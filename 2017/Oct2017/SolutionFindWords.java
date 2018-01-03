class SolutionFindWords {
    private boolean[][] used;
    private char[][] board;
    public List<String> findWords(char[][] board, String[] words){
        List<String> ans = new ArrayList<String>();
        this.board=board;
        this.used = new boolean[board.length][board[0].length];
        for(String str:words){
            if(containsIt(str) && !ans.contains(str)) ans.add(str);
        }
        return ans;
    }
    private boolean containsIt(String str){
        for(int i=0; i<board.length; i++){
            for(int j =0; j<board[0].length; j++){
                if(board[i][j]==str.charAt(0)){
                    if(expandHelper(i,j,str,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean expandHelper(int i, int j, String str, int idx){
        if(idx>=str.length()) return true;
        if(i<0 || i>=board.length|| j<0||j>=board[0].length) return false;
        if(used[i][j] || str.charAt(idx)!=board[i][j]) return false;
        used[i][j]=true;
        boolean tmp = expandHelper(i+1,j, str, idx+1)||expandHelper(i,j+1, str, idx+1)
                    ||expandHelper(i-1,j, str, idx+1)||expandHelper(i,j-1, str, idx+1);
        used[i][j]=false;
        return tmp;
    }
   
}