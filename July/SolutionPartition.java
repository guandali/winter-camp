public class SolutionPartition {
    private StringBuilder s = null;
    public List<List<String>> partition(String s) {
        this.s = new StringBuilder(s);
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> temp = new ArrayList<String>();
        backTrack(ans, temp, 0);
        return ans;
        
    }
    
    private void backTrack(List<List<String>> ans, List<String> temp, int idx){
        if(idx >= s.length()){
            for(String str: temp) System.out.println(str);
            ans.add(new ArrayList<String>(temp));
            return;
        }
        int i = idx;        
        for(int j = i + 1; j <= s.length(); j++){
               if(isP(s.subSequence(i, j))){
                   temp.add(s.subSequence(i, j).toString());
                   backTrack(ans, temp,j);
                   temp.remove(temp.size()-1);
               }
        } 
    }
    
    private boolean  isP(CharSequence str){
        //System.out.println("is p");
        int start = 0; 
        int end = str.length() - 1;
        boolean ans = true;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                ans = false;
                break;
            }
            start++;
            end--;
        }
        return ans;
    }
}