class SolutionCompress {
    public int compress(char[] chars) {
        int start = 0;
        int i = 0;
        int j = 0;
        while(j < chars.length){
            while(j < chars.length && chars[i] == chars[j]) j++;
            int count = j - i;
            chars[start++] = chars[i];
            if(count >1){
                String str = "" + count;
                for(Character c : str.toCharArray()){
                    chars[start++] = c;
                }
            }
            i = j;
            j = i;
        }
        return start;
    }
}