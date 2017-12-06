class SolutionFindMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (b1, b2) -> b1[0] - b2[0]);
        int count = 0;
        for(int i = 0; i< points.length; i++){
            int end = points[i][1];
            count++;
            i++;
            while(i < points.length && points[i][0] <= end){
                end = Math.min(end, points[i][1]);
                i++;
            }
            i--;
        }
        return count;
    }
}