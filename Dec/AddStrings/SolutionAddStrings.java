import java.math.BigInteger;
//Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.
public class SolutionAddStrings {
    public String addStrings(String num1, String num2) {
        BigInteger n1 =  new BigInteger(num1);
        BigInteger n2 =  new BigInteger(num2);
        return (n1.add(n2)).toString();
        
    }
}