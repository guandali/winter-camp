class SolutionFindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] list = new int[26];
        for(int i = 0; i < s.length(); i++ ){
            list[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++ ){
            list[t.charAt(i) - 'a']--;
        }
        int num = 0;
        for(int i = 0; i <= 25; i++){
            if(list[i] != 0){
                num = i;
                break;
            }
        }
        return (char)('a' + num);
        
    }
}