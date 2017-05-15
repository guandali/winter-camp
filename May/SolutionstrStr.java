public class SolutionstrStr {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(needle.length()< 1){
            return 0;
        }
        
        for(int i = 0; i < haystack.length(); i++){
               for( int j = 0; ; j++ ){
                  if(i+j == haystack.length()){
                       return -1;
                   }
                   if(haystack.charAt(j+i) != needle.charAt(j)){
                       break;
                   }
                   if(j == n_len -1){
                       return i;
                   }
                   
               }
        }
        
        return -1;
        
    }
}