import java.math.BigInteger;
public class SolutionMyAtoi {
    // 100000, 12, 10
    public int myAtoi(String str) {
        int res = 0;
        BigInteger smallestInt = new BigInteger("-2147483648");
        BigInteger biggestInt = new BigInteger("2147483647");
        BigInteger TEN_VAL = new BigInteger("10");
        if(str == null ){
            return -1;
        }
        str = str.trim();
        char[] list = str.toCharArray();
        BigInteger ans = new BigInteger("0");
        boolean  posSign = true;
        for(int i = 0; i < list.length; i++){
            // Sign part
            if(i == 0 && list[i] == '+'){
                i++;
            }
            else if(i == 0 && list[i] =='-'){
                posSign = false;
                i++;
            }
            if(i < list.length){
                int val = Character.getNumericValue(list[i]);
                if(val != -1  && val >=0 && val <= 9){
                    ans = ans.multiply(TEN_VAL).add(new BigInteger(val+""));
                }
                else if (val == -1 && list[i] != ' ') {
                    ans = new BigInteger("0");
                    break;
                }
                
                else{
                    break;
                }
            }
        }
        if(!posSign){
            ans = ans.negate();
            int result = ans.compareTo(smallestInt);
            res = (result == -1)?(Integer.MIN_VALUE):(ans.intValue());
        }
        else {
            int result = ans.compareTo(biggestInt);
            res = (result == 1)?(Integer.MAX_VALUE):(ans.intValue());
        }
        
        return res;
        
        
    }
}