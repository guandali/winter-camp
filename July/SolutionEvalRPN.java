public class SolutionEvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st =  new Stack<Integer>();
        int a, b;
        for(String str : tokens){
                switch(str){
                    case "+":
                        a = st.pop();
                        b = st.pop();
                        st.push(a+ b);
                        break;
                    case "-": 
                        a = st.pop();
                        b = st.pop();                   
                        st.push(b - a );
                        break;
                    case "*":
                        a = st.pop();
                        b = st.pop();
                        st.push(a* b);
                        break;
                    case "/":
                        a = st.pop();
                        b = st.pop();
                        st.push(b/ a);
                        break;
                    default: 
                        st.push(Integer.parseInt(str));
                        
                        
                }
            
        }
        
        return (st.empty()?(0):(st.pop()));
        
        
    }
}