public class reverseWordsSolution {
    public String reverseWords(String s) {
      final String SPACE_PATTERN = "\\s+";
      s = s.trim();
      String []  arr = s.split(SPACE_PATTERN );
      int len = arr.length;
      if(len == 1 || len == 0){
          return s;
      }
      String result = "";
      for(int i = arr.length - 1; i>=0; i--){
          result = result + " " +  arr[i];
      }
      return result.trim();
        
    }
}