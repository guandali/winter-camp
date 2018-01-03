public class SolutionTitleToNumber {
    public int titleToNumber(String s) {
        int sum = 0;
        char start = 'A';
        for(int i = 0; i < s.length(); i++){
            sum *= 26;
            sum += s.charAt(i) - start + 1;
        }
        
        return sum;
        
        
    }
}