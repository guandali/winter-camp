class SolutionCheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.contains(s1)) return true;
        int[] counts = new int[26];
        int[] current = new int[26];
        int len = s1.length();
        for(char c:s1.toCharArray()) counts[c - 'a']++;
        int start = 0;
        int end = 0;
        while(end < s2.length()){
            if(end - start + 1 == len){
                current[s2.charAt(end++)-'a']++;
                if(isContains(counts, current)) return true;
                current[s2.charAt(start++)-'a']--;
            }
            else {
                current[s2.charAt(end++)-'a']++;
            }
        }
        return false;
    }
    
    private boolean isContains(int[] counts, int[] current){
        for(int i = 0; i< counts.length;i++) if(counts[i] != current[i]) return false;
        return true;
    }
}s