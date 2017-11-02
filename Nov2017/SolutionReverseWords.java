class SolutionReverseWords {
    
    public void reverseWords(char[] str) {
           reverseArray(str);
           reverseWord(str);
           return;
    }
    
    private void reverseArray(char[] str){
        int i = 0; 
        int j = str.length;
        while(i < j){
            char tmp = str[i];
            str[i] = str[j-1];
            str[j-1] = tmp;
            i++;
            j--;
        }
        
    }
    
    private void reverseWord(char[] str){
        int i = 0;
        int j = i+1;
        while(i < str.length){
            while(j < str.length  && str[j] != ' ' ) j++;
            int saved = j;
            while(i < j ){
                char tmp = str[i];
                str[i] = str[j-1];
                str[j-1] = tmp;
                i++;
                j--;
            }
            i = saved + 1;
            j = i + 1;
        }
        
    }
    
}