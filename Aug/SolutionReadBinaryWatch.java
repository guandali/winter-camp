public class SolutionReadBinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<String>();
        char [] list = new char[12];
        Arrays.fill(list, '0');
        helper(ans, num, 0, list);
        return ans;
        
    }
    public void helper(List<String> ans, int count, int idx, char[] list){
        if(idx > 11) return ;
        if(count == 0){
            String str = new String(list);
            StringBuilder tmp = new StringBuilder();
            int hrs = Integer.valueOf(str.substring(0, 4),2);
            int mins = Integer.valueOf(str.substring(4), 2);
            if(hrs > 11 || mins > 59) return;
            tmp.append(hrs);
            tmp.append(':');
            tmp.append((mins < 10)?("0" + mins):(mins));
            String str1 = tmp.toString();
            if(!ans.contains(str1)) {
                ans.add(str1);
            };
            return;
        }
        for(int i = idx; i < 12 && count != 0; i++){
            if(list[i] == '0'){
                list[i] = '1'; 
                helper(ans, count - 1, idx + 1, list);
                list[i] = '0';
            }
        }
    }
}