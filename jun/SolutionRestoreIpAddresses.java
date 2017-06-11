public class SolutionRestoreIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<String>();
        if(s.length()> 12){
            return ans;
        }
        String temp = "";
        backTrack(ans, temp, s, 0, 4);
        return ans;
        
        
    }
    
    public void backTrack(List<String> ans, String temp, String str, int idx, int count){
        if(idx == str.length() && count == 0){
            String t = temp.substring(0, temp.length()-1);
            ans.add(t);
            return;
        }
        
        for(int i = idx+1; i <= str.length(); i++){
            String valStr = str.substring(idx, i);
            if(valStr.length() > 1 && valStr.startsWith("0")){
                return;
            }
            int val = Integer.parseInt(valStr);
            if( val < 256 && val >= 0) {
                String saved = temp;
                count--;
                backTrack(ans, temp + val + ".", str, i, count);
                temp = saved;
                count++;
            }
            else {
                break;
            }
            
        }
        
        return;
        
    }
}