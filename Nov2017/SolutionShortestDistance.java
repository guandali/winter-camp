class SolutionShortestDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int minDistance = Integer.MAX_VALUE;
        int idx1 = -1;
        int idx2 = -1;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                if(idx2 != -1) minDistance = Math.min(minDistance, i - idx2);
                idx1 = i;
            }
            else if(words[i].equals(word2)){
                if(idx1 != -1) minDistance = Math.min(minDistance, i - idx1);
                idx2 = i;
            }
        }
        return minDistance;
    }
}