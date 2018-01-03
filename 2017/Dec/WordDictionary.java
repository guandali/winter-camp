import java.util.HashSet;
public class WordDictionary {


    HashSet <String>dict = new HashSet <String>();
    char DOT = '.';
    // Adds a word into the data structure.
    public void addWord(String word) {
       
       char [] list = word.toCharArray();
       int length = list.length;
       // Add oiginal text first
       dict.add(word);
       int duration = 1;
       while (duration < length){
           for(int i = 0; i< length; i++ ){

               char [] newList = list.clone();
               for(int j = 0; j <= duration; j++  ){
                   if (i+j > length){
                       return;
                   }
                   newList[i + j] = DOT;
               }
               dict.add(new String(newList));
            }
        duration++;
               
       }
       
     return; 
        
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return dict.contains(word);
        
    }
}