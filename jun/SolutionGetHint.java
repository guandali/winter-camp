public class SolutionGetHint {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] countS = new int[10];
        int[] countG  = new int[10];
        for(int i = 0; i <secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i) ){
                bulls++;
            }
            countS[secret.charAt(i) - '0']++;
            countG[guess.charAt(i) - '0']++;
        }
        for(int i = 0; i < countS.length; i++){
            if(countG[i] <= countS[i]){
                cows += countG[i];
            }
            else {
                cows += countS[i];
            }
        }
        
       return  bulls + "A" + (cows - bulls) + "B";
        
        
        
    }
}