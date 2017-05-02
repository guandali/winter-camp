public class SolutionisPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null ){
            return false;
        }
        s = s.trim();
        if (s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        char [] arr = s.toCharArray();
        int i =0;
        int j = arr.length - 1;
        while (i < j){
            while (!((arr[i] >= 'a' && arr[i] <= 'z') ||(arr[i] >= '0' && arr[i] <= '9')) && (i < j)){
                i++;
            }
            while (!((arr[j] >= 'a' && arr[j] <= 'z') ||(arr[j] >= '0' && arr[j] <= '9')) && (i < j)){
                j--;
            }
            if ( ((i < j) && (arr[i] != arr[j]))  ){
                return false;
            }

            else{
                 i++;
                 j--;
            }
        }
        return true;
            
        }
    }
