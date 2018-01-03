class SolutionAddDigits {
    public int addDigits(int num) {
        int ans = num;
        while(ans >= 10){
            int tmp = 0;
            while(ans != 0){
                tmp += ans % 10;
                ans = ans/10;
            }
            ans = tmp;
            
        }
        return ans;
        
    }
}