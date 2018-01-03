public class SolutionLongestValidParentheses {
    public int longestValidParentheses(String s) {
        char[] list = s.toCharArray();
        Stack<Character> chars = new Stack<Character>();
        Stack<Integer> idxs = new Stack<Integer>();
        for(int idx = 0; idx < list.length; idx++){
           char elem = list[idx];
           if(elem == ')'){
               if(!chars.empty() && chars.peek() == '('){
                   chars.pop();
                   idxs.pop();
               }
               else {
                   chars.push(elem);
                   idxs.push(idx);
               }
           }
           else {
               chars.push(elem);
               idxs.push(idx);
           }
        }
        int max = 0;
        if(idxs.empty()) return list.length;
        int prev = list.length;
        int tmp = -1;
        while(!idxs.empty()){
            tmp = idxs.pop();
            max = Math.max(max, prev - tmp - 1 );
            prev = tmp;
        }
       if (tmp != -1 ) max = Math.max(max, tmp);
       return  max;
        
    }
}