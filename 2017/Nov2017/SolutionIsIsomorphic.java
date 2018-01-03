class SolutionIsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        boolean ans = true;
        Map<Character, Character> chars0 = new HashMap<>();
        Map<Character, Character> chars1 = new HashMap<>();
        for(int i = 0;i < s.length(); i++){
            char c0 = s.charAt(i);
            char c1 = t.charAt(i);
            if((chars0.containsKey(c0) && chars0.get(c0) !=  c1) ||(chars1.containsKey(c1) && chars1.get(c1) !=  c0)){
                ans = false;
                break;
            }
            else {
                chars0.put(c0, c1);
                chars1.put(c1, c0);
            }
        }
        return ans;
        
    }
}