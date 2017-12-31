class SolutionRearrangeString {
    private int[] lastSeen = new int[26];
    private int[] count = new int[26];
    private int k = -1;
    public String rearrangeString(String s, int k) {
        Arrays.fill(lastSeen, -k-1);
        this.k = k;
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()) count[c-'a']++;
        for(int i=0; i<s.length(); i++){
            int idx = findHelper(i);
            if(idx==-1){
                sb = new StringBuilder();
                break;
            }
            else {
                this.count[idx]--;
                sb.append((char)(idx+'a'));
                this.lastSeen[idx] = i;
            }
            
        }
        return sb.toString();
    }
    
    private int findHelper(int idx){
        int max = Integer.MIN_VALUE;
        int res = -1;
        for(int i=0; i<26;i++){
            if(this.lastSeen[i]+k>idx) continue;
            if(count[i]>max&&count[i]>0){
                max = count[i];
                res = i;
            }
        }
        return res;
    }
}