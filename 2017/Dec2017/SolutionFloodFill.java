class SolutionFloodFill {
    private int[][] images = null;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.images = image;
        if(sr>=this.images.length || sr<0||sc<0||sc>=images[0].length) return images;
        int target = this.images[sr][sc];
        int goal = newColor;
        if(target == goal) return this.images;
        fillHelepr(target, goal, sr,sc);
        return images;
    }
    
    private void fillHelepr(int target, int goal, int i, int j){
        if(i>= this.images.length || i < 0|| j >=this.images[0].length || j <0) return;
        if(this.images[i][j] != target) return;
        this.images[i][j] = goal;
        fillHelepr(target, goal, i+1, j);
        fillHelepr(target, goal, i-1, j);
        fillHelepr(target, goal, i, j+1);
        fillHelepr(target, goal, i, j-1);
        return;
    }
}