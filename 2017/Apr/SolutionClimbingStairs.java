public class SolutionClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 0) return 0;
        if (n ==1 ) return 1;
        if (n ==2 ) return 2;
        int [] list = new int [n +1];
        list[0] = 0;
        list[1] = 1;
        list[2] = 2;
        for(int i = 3; i <= n; i ++){
            list[i] = list[i -1 ] + list[i -2];
        }
        return list[n];
    }
}