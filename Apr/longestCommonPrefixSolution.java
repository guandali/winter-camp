public class longestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int min_len =  Integer.MAX_VALUE;
        for (String s : strs){
            min_len = (min_len > s.length())?(s.length()):(min_len);
        }
        if(min_len < 1) return "";
        int idx = 0;
        while (idx < min_len){
            char cur_char = strs[0].charAt(idx);
            for(String s : strs){
                if(s.charAt(idx) != cur_char){
                    if (idx > 0){
                        return s.substring(0, idx );
                    }
                    else {
                        return "";
                    }
                    
                }
                
            }
            idx ++;
        }
        
        return strs[0].substring(0, min_len );
        
    }
}