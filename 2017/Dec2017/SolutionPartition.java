class SolutionPartition {
    List<List<String>> answer = new ArrayList<List<String>>();
    private String s = null;
    public List<List<String>> partition(String s) {
        this.s = s;
        List<String> tmp = new ArrayList<>();
        dfs(tmp, 0);
        return answer;
    }
    
    private void dfs(List<String> tmp, int index){
        if(index == this.s.length()){
            this.answer.add(new ArrayList<>(tmp));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isP(index, i)){
                tmp.add(s.substring(index, i+1));
                dfs(tmp, i+1);
                tmp.remove(tmp.size()-1);
            }
        }
        
    }
    private boolean isP(int i, int j){
        while(i < j) if(!(s.charAt(i++) == s.charAt(j--))) return false;
        return true;
    }
}