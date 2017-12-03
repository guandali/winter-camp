class StringIterator {
    private String compressedString = null;
    private int idx = 0;
    private int count = 0;
    private char cur;
    public StringIterator(String compressedString) {
        this.compressedString = compressedString;
    }
    
    public char next() {
        if(this.count == 0 && idx < this.compressedString.length()){
            this.cur = this.compressedString.charAt(idx++);
            //Get count; 
            int tmp = this.compressedString.charAt(idx++) - '0';
            while(idx < this.compressedString.length() && (this.compressedString.charAt(idx) - '0' >= 0 && 
            this.compressedString.charAt(idx) - '0' <= 9)){
                tmp = tmp * 10 + this.compressedString.charAt(idx++) - '0';
            }
            System.out.println(tmp);
            this.count = tmp;
        }
        if(this.count == 0) return ' ';
        else {
            this.count --;
            return this.cur;
        }
    }
    
    public boolean hasNext() {
        return this.count != 0 || this.idx < this.compressedString.length();
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */