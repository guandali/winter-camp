public class SolutionSearchMatrix {
    private int[][] tb = null;
    private int m;
    private int n;
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        this.tb = matrix;
        this.m = matrix.length;
        if(m < 1 || matrix[0].length < 1) return ans;
        this.n = matrix[0].length;
        System.out.println("n : " + n);
        int i = findRowIndex(target);
        System.out.println("i : " + i);
        if(i != -1 && findCols(i, target) != -1){
            ans = true;
        }
        return ans;
    }
    
    private int findRowIndex(int target){
        int lo = 0;
        int hi = m - 1;
        int i = -1;
        while(lo <= hi){
            int mid = (hi - lo)/2 + lo;
            System.out.println("mid : " + mid);
            if(target >= tb[mid][0]  &&  target <= tb[mid][n-1] ) {
               i = mid;
               break;
            }
            else if(target < tb[mid][0]){
                hi = mid -1;
            }
            else{
                lo = mid + 1;
            }
        }
        return i;
    }
    // We already knows which rows, try to figure if the value in this row
    private int findCols(int i, int target){
        int lo = 0;
        int hi = n -1;
        int j = -1;
        while(lo <= hi){
            int mid = (hi - lo)/2 + lo;
            if(tb[i][mid] == target) {
             j = mid;
             break;
            }
            else if(tb[i][mid] < target){
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return j;

    }
}