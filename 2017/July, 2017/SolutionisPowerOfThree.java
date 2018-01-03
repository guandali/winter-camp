public class SolutionisPowerOfThree {
    public boolean isPowerOfThree(int n) {
        return Integer.toString(n, 3).matches("10*");
        
    }
}