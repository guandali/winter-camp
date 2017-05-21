public class SolutionIsPalindrome2 {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        String str = Integer.toString(x);
        int i = 0;
        int j = str.length()-1;
        while(i<j){
           if(str.charAt(i) != str.charAt(j) ){
               ans = false;
               break;
           }
           i++;
           j--;
        }
        
        return ans;
        
    }
}
