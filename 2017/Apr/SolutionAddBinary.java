ipublic class SolutionAddBinary {
    public String addBinary(String a, String b) {
       String ans  = new String();
       //int len = (a.length() > b.length())? (a.length()):(b.length());
       int next =  0;
       if (a.length() == 0 && b.length() != 0) return b;
       if (a.length() != 0 && b.length() == 0) return a;
       if (a.length() == 0 && b.length() == 0) return "";
       int a_len =  a.length() - 1;
       int b_len =  b.length() - 1;
       while ((a_len >= 0) || (b_len >= 0) || (next != 0)){
           int cur = next;
           next = 0;
           if(a_len >=0 ){
               cur = cur + (a.charAt(a_len) - '0');
           }
           if(b_len >=0 ){
               cur = cur + (b.charAt(b_len) - '0');
           }
           if(cur > 1 ){
               next = 1;
               cur = cur - 2;
           }
           
           ans = cur + ans;
           a_len --;
           b_len --;
       }
       
       return ans;
        
    }
}
