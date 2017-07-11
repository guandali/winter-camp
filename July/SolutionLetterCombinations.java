public class SolutionLetterCombinations {
    private String digits = null;
    private List<String> tb = Arrays.asList("abc", "def", "ghi", 
                                           "jkl", "mno", "pqrs", 
                                           "tuv", "wxyz");
    
    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        List<String> ans = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        helper(0, sb, ans);
        return ans;
        
        
    }
    
    private void helper(int idx, StringBuilder sb, List<String> ans){
        if(idx >= digits.length()){
            if(sb.length() > 0)ans.add(sb.toString());
            return;
        }
        int num = digits.charAt(idx) - '2';
        String nums = tb.get(num);
        for(int i = 0; i < nums.length(); i++){
            helper(idx + 1, sb.append(nums.charAt(i)), ans);
            sb.deleteCharAt(sb.length() - 1);
        }
        return;
    }
}