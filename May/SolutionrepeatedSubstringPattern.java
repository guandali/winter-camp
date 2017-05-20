public class SolutionrepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        boolean ans = false;
        if(s == null || s.length() <2){
            return ans;
        }
        int len = 1;
        while(s.length()/2 >= len){
            int idx = 0;
            while (idx + len <= s.length()){
                if(!s.substring(0, len).equals(s.substring(idx, idx+len))){
                    break;
                }
                if(idx + len == s.length()){
                    return true;
                }
                
                idx = idx + len;
            }
            len++;
        }
        
        return false;
        
    }
}