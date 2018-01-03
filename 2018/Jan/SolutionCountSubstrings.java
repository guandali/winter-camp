class SolutionCountSubstrings {
    private int count = 0;
    private String s = null;
    public int countSubstrings(String s) {
        if(s==null||s.length()<1) return this.count;
        this.s = s;
        for(int i=0; i<s.length();i++){
            countPalindromic(i, i);  
            if(i+1<s.length()) countPalindromic(i, i+1);
        }
        return this.count;
    }
    
    private void countPalindromic(int i, int j){
        while(i>=0&&j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                this.count++;
                i--;
                j++;
            }
            else break;
        }
        
    }
}