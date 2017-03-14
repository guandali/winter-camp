public class SolutionForfirstUniqChar {
    public int firstUniqChar(String s) {
        int index = -1;
        if (s == null) return index;
        int [] indexes = new int [26];
        char[] arr = s.toCharArray();
        for (int i =0; i< arr.length; i++){
            indexes[arr[i] - 'a'] ++;
        }
        for (int i =0; i< arr.length; i++){
            if(indexes[arr[i] - 'a'] == 1){
                return i;
            }
        }
        return index;
        
    }
}