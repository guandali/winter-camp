public class SolutionFindWords {
    public String[] findWords(String[] words) {
       List<String> ans = new ArrayList<String>();
       List<Character> row_0 = Arrays.asList('q', 'w', 'e', 'r', 't', 'y','u','i', 'o','p');
       List<Character> row_1 = Arrays.asList('a','s','d','f','g','h','j','k','l');
       List<Character> row_2 = Arrays.asList('z','x','c','v','b','n','m');
       for(int i = 0; i < words.length; i++){
           char [] aWord = words[i].toLowerCase().toCharArray();
           
           List<Character> temp = new ArrayList<Character>();
           for(int j = 0; j < aWord.length; j++ ){
               temp.add(aWord[j]);
           }
           
           if(row_0.containsAll(temp) || row_1.containsAll(temp) || row_2.containsAll(temp)){
               ans.add(words[i]);
           }
           
       }
       
       
       return ans.toArray(new String[0]);
       
        
    }
}