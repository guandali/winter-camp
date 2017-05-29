public class SolutionFindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        HashSet hasSeen = new HashSet();
        HashSet hasAdded = new HashSet();
        for(int i = 10; i <= s.length(); i++){
            String temp = s.substring(i-10, i);
            if(!hasSeen.contains(temp)){
                hasSeen.add(temp);
            }
            else if(!hasAdded.contains(temp)){
                hasAdded.add(temp);
                ans.add(temp);
            }
            
        }
        
        return ans;
        
        
    }
}
