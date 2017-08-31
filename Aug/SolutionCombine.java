class SolutionCombine {
    boolean[] list;
    public List<List<Integer>> combine(int n, int k) {
        this.list = new boolean[n+1];
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        dfs(1, n, k, ans, tmp);
        return ans;
    }
    private void dfs(int idx, int n, int remain, List<List<Integer>> ans, List<Integer> tmp){
        if(remain == 0) {
            ans.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i = idx; i <= n; i++){
            if(!list[i]){
                list[i] = true;
                tmp.add(i);
                dfs(i, n, remain - 1, ans, tmp);
                list[i] = false;
                tmp.remove(tmp.size() -1);
            }
            
        }
        
    }
}