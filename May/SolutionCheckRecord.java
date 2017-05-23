c class SolutionCheckRecord {
    public boolean checkRecord(String s) {
        boolean hasReward = true;
        char[] list = s.toCharArray();
        int countOfA = 0;
        for(int i =0; i < list.length; i++){
            if(i>= 2 &&list[i-1] == list[i] && list[i] =='L' && list[i-2] == list[i]){
               hasReward = false;
               break;
            }
            if(list[i] == 'A'){
                countOfA++;
                if(countOfA > 1){
                    hasReward = false;
                    break;
                }
            }
            
        }
        return hasReward;
        
    }
}
