public class SolutionDetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        boolean ans = true;
        boolean startWithC = false;
        if( word.length() > 0){
                int val = word.charAt(0) - 'A';
                if(val >= 0 && val <= 25) startWithC = true;
        }
        char[] list = word.toCharArray();
        boolean seq0 = true;
        boolean seq1 = true;
        boolean seq2 = true;
        
        for(int i = 0; i < list.length;i++){
            char c = list[i];
            if(startWithC ){
                if(i == 0) continue;
                int val0 = c - 'A';
                int val1 = c - 'a';
                if(val0 < 0 ||val0 > 25) {
                    seq0 = false;
                }
                if(val1 < 0 || val1 > 25) {
                    seq1 = false;
                }
            }
            else {
                int val3 = c - 'a'; 
                if(val3 < 0 || val3 > 25) {
                    seq2 = false;
                }
            }
        }
        return (startWithC )?(seq0 || seq1):(seq2) ;
        
    }
}