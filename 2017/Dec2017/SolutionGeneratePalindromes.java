class SolutionGeneratePalindromes {
    private int[] counts = new int[256];
    private char[] tmp = null;
    private List<String> permus = null;
    public List<String> generatePalindromes(String s) {
        this.permus = new ArrayList<String>();
        for(char c:s.toCharArray()) counts[c-'\0']++;
        int countOfSingle = 0;
        for(int num:counts){
            if(num%2!=0) countOfSingle++;
            if(countOfSingle>1) break;
        }
        if(countOfSingle>1) return permus;
        this.tmp = new char[s.length()];
        dfsHelper(0,s.length()-1);
        return permus;
    }
    
    private void dfsHelper(int i, int j){
        if(i>j) {
            this.permus.add(new String(tmp));
            return;
        }
        else if(i==j){
            for(int k=0;k<this.counts.length;k++){
                if(this.counts[k]!=0){
                    this.tmp[i] = (char)('\0'+k);
                    this.counts[k]--;
                    dfsHelper(i+1,j-1);
                    this.counts[k]++;
                    return;
                }
            }
        }
        else{
            for(int k=0;k<this.counts.length;k++){
                if(this.counts[k]>=2){
                    this.tmp[i] = (char)('\0'+k);
                    this.tmp[j] = (char)('\0'+k);
                    this.counts[k] -= 2;
                    dfsHelper(i+1, j-1);
                    this.counts[k] += 2;
                }
            }
        }
    }
}