class SolutionExclusiveTime {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] times = new int[n];
        Arrays.fill(times, 0);
        Stack<String[]> st = new Stack<>();
        for(String log:logs){
            String[] info = log.split(":");
            if(info[1].equals("start")){
                st.push(info);
            }
            else{
                int notUsedTime = 0;
                while(true && !st.empty()){
                    String[] tmp = st.peek();
                    if(tmp[1].equals("USED")){
                        notUsedTime += Integer.parseInt(tmp[2]);
                        st.pop();
                    }
                    else break;
                }
                String[] s = st.pop();
                int roughTime = Integer.parseInt(info[2]) - Integer.parseInt(s[2]) +1;
                int realTime = roughTime - notUsedTime;
                int funcNum = Integer.parseInt(info[0]);
                times[funcNum] += realTime;
                String[] placeholder = new String[3];
                placeholder[1] = "USED";
                placeholder[2] = "" + roughTime;
                st.push(placeholder);
            }
        }
        return times;
        
    }
}