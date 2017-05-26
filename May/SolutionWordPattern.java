public class SolutionWordPattern {
    public boolean wordPattern(String pattern, String str) {
        boolean ans = true;
        String[] list = str.split("\\s+");
        if(pattern.length() != list.length){
            System.out.println("exit her ");
            ans = false;
            return ans;
        }
        //Space O(n)
        HashMap <Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < list.length; i++){
            
            char temp = pattern.charAt(i);
            if(!map.containsKey(temp) ){
                if(!map.containsValue(list[i])){
                    map.put(temp, list[i]);
                }
                else {
                    ans = false;
                    break;
                }
                
            }
            // If we also have the mapping it must follow the pattern
            else if(!list[i].equals(map.get(temp))) {
                ans = false;
                break;
                
            }
        }
        return ans;
        
        
        
    }
}
