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
           if(haystack.charAt(i) == needle.charAt(0)){
               for( int j = 0; j < needle.length() && i+j <haystack.length(); j++ ){
                   if(haystack.charAt(j+i) != needle.charAt(j)){
                       break;
                   }
                   else if(j == needle.length()-1){
                       return i;
                   }
                   
               }
               
           }
        }
        
        return -1;
        
    }
}