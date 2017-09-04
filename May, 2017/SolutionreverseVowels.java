public class SolutionreverseVowels {
    public String reverseVowels(String s) {
        if(s == null) return "";
        char [] arr = s.toCharArray();
        int len = arr.length;
        if (len <= 1) return s;
        String vowels = "aeiouAEIOU";
        int i = 0;
        int j = len -1;
        while (i < j){
            while ( (!vowels.contains(arr[i] +""))&& (i < j)){
                i++;
            }
           while ((!vowels.contains(arr[j] + "")) && (i < j)){
                j--;
            }
            if ((vowels.contains(arr[i]+"")) && (vowels.contains(arr[j]+"")) && i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
;
            }
                i++;
                j--;
        }
        
        return new String(arr);
        
    }
}