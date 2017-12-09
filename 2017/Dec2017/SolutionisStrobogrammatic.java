class .java {
    private char[] arr = new char[10];
    public boolean isStrobogrammatic(String num) {
        if(num.length() == 0){
             char c = num.charAt(0);
            if(c != '1' && c!='8'&& c!='9' && c!='6' && c!='0') return false;
        }
        for(int i = 0; i < arr.length;i++){
            arr[i] = (char) i;
        }
        arr[6] = '9';
        arr[9] = '6';
        arr[0] = '0';
        arr[1] = '1';
        arr[8] = '8';
        int i = 0;
        int j = num.length()-1;
        while(i<=j){
            if(arr[num.charAt(i) - '0'] != num.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}