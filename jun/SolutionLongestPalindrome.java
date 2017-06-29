public class SolutionLongestPalindrome {
    public int longestPalindrome(String s) {
        int [] store = new int[128];
        
        char start = 'A';
        for(int i = 0; i < s.length(); i++){
            ++store[s.charAt(i) - start];
        }
        int total = 0;
        boolean addedOdd = false;
        for(int val : store){
            if(val != 0 ){
              if (val % 2 == 0){
                   total += val;  
              }
              else {
                   if(!addedOdd) addedOdd = true;
                   total += (val - val % 2);
                }
            }
  
        }
        
        return (addedOdd)?(total + 1 ):(total);
    }
}