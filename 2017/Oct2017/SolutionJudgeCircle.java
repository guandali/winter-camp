class SolutionJudgeCircle {
    public boolean judgeCircle(String moves) {
        int u_count = 0;
        int d_count = 0;
        int l_count = 0;
        int r_count = 0;
        for(char tmp : moves.toCharArray()){
            if( tmp == 'U' ) u_count++;
            else if( tmp == 'L' ) l_count++;
            else if( tmp == 'D' ) d_count++;
            else if( tmp == 'R' ) r_count++;
        }
        
        return d_count == u_count && r_count == l_count;
    }
}