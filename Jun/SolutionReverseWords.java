public class SolutionReverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        String[] list = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=0; i < list.length; i++){
            ans.append(new StringBuilder(list[i]).reverse() + " ");
        }
        
        return ans.toString().trim();
        
        
    }
}
