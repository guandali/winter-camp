class SolutionValidPalindrome {
    private String str;
    public boolean validPalindrome(String s) {
        this.str = s;
        int i = 0;
        int j = str.length() -1;
        while(i < j ){
            if(str.charAt(i) != str.charAt(j) ){
                return isValid(i+1, j) || isValid(i, j-1);
            }
            i++;
            j--;
        }
        return true;
        
    }
    
    private boolean isValid(int i, int j){
        boolean ans = true;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--) ){
                ans = false;
                break;
            }
        }
        return ans;

    }
}