public class SolutionLadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<String> reached = new ArrayList<String>();
        int ans = 1;
        reached.add(beginWord);
        while(!reached.contains(endWord)){
            List<String> tmp = new ArrayList<String>();
            for(String aWord : reached){
                for(int idx = 0; idx < aWord.length(); idx++){
                    char[] list = aWord.toCharArray();
                    for(char c = 'a'; c <= 'z'; c++){
                        list[idx] = c;
                        String str = new String(list);
                        if(wordList.contains(str)){
                            tmp.add(str);
                            wordList.remove(str);
                        }
                    }
                    
                }
            }
            if(tmp.size() == 0) return 0;
            ans++;
            reached = tmp;
            
        }
        
        return ans;
        
    }
}