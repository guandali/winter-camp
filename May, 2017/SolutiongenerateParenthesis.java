public class SolutiongenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans =  new ArrayList<String>();
        if(n <= 0){
            return ans;
        }
        
        helper(ans, "", 0, 0, n);
        return ans;
    }
    
    public void helper(List<String> ans, String str, int open, int close, int limit){
        if(limit * 2 == str.length()){
            ans.add(str);
            return;
        }
        if(open < limit){
            helper(ans, str + "(", open + 1, close, limit);
        }
        if(close < open){
            helper(ans, str + ")", open, close + 1, limit);
        }
    }
}