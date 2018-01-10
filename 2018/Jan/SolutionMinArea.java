class SolutionMinArea {
    private int i0 = Integer.MAX_VALUE;
    private int j0 = Integer.MAX_VALUE;
    private int i1 = Integer.MIN_VALUE;
    private int j1 = Integer.MIN_VALUE;
    private char[][] image = null;
    public int minArea(char[][] image, int x, int y) {
        int maxSize = Integer.MIN_VALUE;
        if(image.length<1|| image[0].length<1||(x<0||x>=image.length||y<0||y>=image[0].length)||(image[x][y]!='1')){
            return maxSize;
        }
        this.image = image;
        helper(x, y);
        return (i1-i0+1)*(j1-j0+1);
    }
    
    private void helper(int i, int j){
        if((i<0||i>=image.length||j<0||j>=image[0].length)||(image[i][j]!='1')) return;
        this.i0 = Math.min(this.i0, i);
        this.j0 = Math.min(this.j0, j);
        this.i1 = Math.max(this.i1, i);
        this.j1 = Math.max(this.j1, j);
        this.image[i][j] = '2';
        helper(i-1,j);
        helper(i+1,j);
        helper(i,j-1);
        helper(i,j+1);
        return;
    }
    
    
}