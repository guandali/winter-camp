public class SolutionExist {
    private int m = 0;
    private int n = 0;
    char[][] board; 
    public boolean exist(char[][] board, String word) {
        m = board.length;
        if(m < 1) return false;
        n = board[0].length;
        this.board = board;
        List<Character> list = new ArrayList<Character>();
        int i = 0;
        while(i <= word.length() -1){
            list.add(word.charAt(i));
            i++;
        }
        for(i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(list.get(0) == board[i][j]){
                    if(backTrack(list, i, j)){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean backTrack( List<Character> list, int i, int j){
        if(list.size() == 0) return true;
        if(i < 0 || i >= m || j < 0 || j >= n) return false;
        char temp = board[i][j];
        if( list.get(0) == temp){
            list.remove(0);
            board[i][j] = '\0';
            boolean ans = ( backTrack(list, i+1, j)
                ||backTrack(list, i-1, j)
                ||backTrack(list, i, j+1)
                ||backTrack(list, i, j-1));
            board[i][j] = temp;
            list.add(0, board[i][j]);
            return ans;
            
        }
        else {
            return false;
        }
        
        
    }
}