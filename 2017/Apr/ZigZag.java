public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if(len == 0) return "";
        if(len < numRows) return s;
        char [] arr = s.toCharArray();
        StringBuffer []buf = new StringBuffer[numRows];
        for(int i =0; i < numRows; i++) buf[i] = new StringBuffer();
        int idx = 0;
        while(idx < len){
            for(int j = 0; j < numRows && idx < len; j++){
                buf[j].append(arr[idx++]);
            }
            for(int k = numRows-2; k>=1 && idx<len;k--){
                buf[k].append(arr[idx++]);
            }
        }
        for(int i = 1; i<numRows;i++){
            buf[0].append(buf[i]);
        }
        return buf[0].toString();
        
        
        
        
        
    }
}