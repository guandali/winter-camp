import java.math.BigInteger;
public class SolutionAddStrings {
    public String addStrings(String num1, String num2) {
        BigInteger n1 =  new BigInteger(num1);
        BigInteger n2 =  new BigInteger(num2);
        return (n1.add(n2)).toString();
        
    }
}