public class SolutionFindLongestWord {
    public String findLongestWord(String s, List<String> d) {
        int max = 0;
        List<String> can = new ArrayList<String>();
        String ans = "";
        for(String str : d){
            // Wont consider word itself is already too short.As we are trying to find longest
            if(str.length() < max || str.length() > s.length()) continue;
            int i = 0; 
            int j = 0;
            while(i < s.length()){
                if(j > str.length() -1) break;
                while(i < s.length() &&j < str.length() && s.charAt(i) != str.charAt(j))i++;
                if(i < s.length() &&j < str.length() && s.charAt(i) == str.charAt(j)){
                    j++;
                    i++;
                }
                
                
            }
            
        if(j == str.length()){
             if(j > max){
                can.clear();
                System.out.println("j is :" + j);
                System.out.println("Adding :" + str);
                can.add(str);
                max = j;
            }
            else if(max != 0 && j == max){
                can.add(str);
            }
            }

        }
        Collections.sort(can);
        for(String s0 : can) System.out.println(s0);
        return (can.size() != 0)?(can.get(0)):(ans);
        
        
        
        
    }
}