class SolutionDecodeString {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> sbs = new Stack<StringBuilder>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==']'){
                int count = st.pop();
                StringBuilder tmp = new StringBuilder();
                while(count>0){
                    tmp.append(sb);
                    count--;
                }
                sb = sbs.pop();
                sb = sb.append(tmp);
            }
            else if((c-'a'>=0&&c-'a'<=25)||(c-'A'>=0&&c-'A'<=25)) sb.append(c);
            else {
                int count = 0;
                if(c-'0'>0&&c-'0'<=9){
                    while(c-'0'>=0&&c-'0'<=9){
                        count = count*10 + c-'0';
                        c = s.charAt(++i);
                    }
                }
                else count = 1;
                st.push(count);
                sbs.push(sb);
                sb = new StringBuilder();
            }
        }
        return sb.toString();
    }
}