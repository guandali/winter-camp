class SolutionIsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        String tmp = Integer.toBinaryString(n);
        return tmp.lastIndexOf("1") == 0 && tmp.length() != 32;
        
    }
}