class SolutionIsHappy {
    Set<Integer> set = new HashSet();
    public boolean isHappy(int n) {
        if(n == 1) return true;
        if(set.contains(n)) return false;
        set.add(n);
        String str = n + "";
        int sum = 0;
        for(char c : str.toCharArray()){
            sum += Math.pow((c - '0'), 2);
        }
        System.out.println(sum);
        return isHappy(sum);
    }
}