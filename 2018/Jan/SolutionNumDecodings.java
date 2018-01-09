class SolutionNumDecodings {
    public int numDecodings(String s) {
        if(s.length() == 0) return 0;
        int[] counts = new int[s.length()];
        Arrays.fill(counts, 0);
        int i = s.length() - 1;
        while(i>=0){
            int num0 = Integer.parseInt(s.substring(i, i+1));
            if(num0>0){
                if(i==s.length()-1) counts[i] = 1;
                else counts[i] = counts[i+1];
            }
            if(i<s.length()-1){
                int num1 = Integer.parseInt(s.substring(i, i+2));
                if(num1>9&&num1<=26){
                    if(i<s.length()-2) counts[i] = counts[i+1] + counts[i+2];
                    else counts[i] = counts[i+1] + 1; 
                }
            }
            i--;
        }
        return counts[0];
    }
}