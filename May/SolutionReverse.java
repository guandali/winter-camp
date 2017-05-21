import java.math.BigInteger;
public class SolutionReverse {
    public int reverse(int x) {
        int ans;
        boolean posSign = (x >= 0)?(true):(false);
        BigInteger upperLimit = new BigInteger("2147483647");
        BigInteger lowerLimit = new BigInteger("2147483648");
        String num = Integer.toString(x);
        int len = num.length() - 1;
        String str = "";
        for(int i = 0; i < num.length(); i++){
            if(i == len  && num.charAt(0) == '-' ) {
                continue;
            }
            str = str + num.charAt(len - i);
        }
        BigInteger val = new BigInteger(str);
        if(posSign){
           ans =  (val.compareTo(upperLimit) == 1)?(0):(val.intValue());
        }
        else {
           ans =  (val.compareTo(lowerLimit) == 1)?(0):(val.negate().intValue());        }
        
        return ans;
        
        
        
        
    }
}
