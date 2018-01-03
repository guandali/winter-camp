ipublic class SolutioncanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] a = new int [26];
        int [] b = new int [26];
        Arrays.fill(a, 0);
        Arrays.fill(b, 0);
        checkString(magazine, a);
        checkString(ransomNote, b);
        for(int idx = 0; idx<26; idx ++){
            if(b[idx] > a[idx]){
                return false;
            }
        }
        
        return true;
        
        
    }
    public void checkString(String str, int [] arr){
        int len = str.length();
        for(int i = 0; i < len; i++){
            arr[str.charAt(i) - 'a']++;
        }
        
        
    }
}
