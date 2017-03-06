public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        char [] arr = str.toCharArray();
        int result = 0;
        int len = arr.length;
        if (len ==0){
            return result;
        }
        int signDigit = 1;
        int start = 0;
        char zeroInChar = '0';
        if (arr[0] == '-'){
            signDigit = -1;
            start = 1;
        }
        else if (arr[0] == '+'){
            start = 1;
        }
       
        
        for (int i = start; i<len; i++){
            int val = arr[i] - zeroInChar;
            if(val >= 0 && val <=9){
                result = result * 10 + val;
               if (signDigit == 1 && result > Integer.MAX_VALUE)
    			return Integer.MAX_VALUE;
    		   if (signDigit  == -1 && (-1) * result < Integer.MIN_VALUE)
    			return Integer.MIN_VALUE;
            }else {
                break;
                
            }
            
        }

        return result * signDigit;
        
        
        
    }
}
