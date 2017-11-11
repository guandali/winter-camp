class SolutionIntegerReplacement {
    public int integerReplacement(int n) {
        if(n == 0) return 1;
        if(n == 1) return 0;
        //Even 
        if(n % 2 == 0){
            return integerReplacement(n/2) + 1;
        }
        else if(n == Integer.MAX_VALUE){
            return integerReplacement(n-1);
        }
        else return Math.min(integerReplacement(n + 1), integerReplacement(n - 1)) + 1;
        
    }
}