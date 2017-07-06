public class SolutionisPowerOfFour {
   int big4 =  4194304;
    public boolean isPowerOfFour(int num) {
        String str = Integer.toBinaryString(num);
        System.out.println(str);
        return (str.charAt(0) == '1' && str.lastIndexOf('1') == 0 && (str.length() % 2 != 0));
        
    }
}