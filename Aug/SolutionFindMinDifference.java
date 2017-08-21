public class SolutionFindMinDifference {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size() < 2) return -1;
        boolean hasZero = false;
        for(int i = 0; i < timePoints.size(); i++ ){
            if(timePoints.get(i).equals("00:00")) timePoints.set(i, "24:00");
        }
        Collections.sort(timePoints);
        timePoints.add(timePoints.get(0));
        int minDiff = Integer.MAX_VALUE;
        int prev = -1;
        int cur = -1;
        for(int i = 0; i < timePoints.size(); i++){
            System.out.println("prev :" + prev);
            System.out.println("cur :" + cur);
            cur = convert(timePoints.get(i));
            if(prev == -1) prev = cur;
            else {
               minDiff =  Math.min(((i == timePoints.size() - 1)?(cur - prev + 1440):(cur - prev)), minDiff);
                prev = cur;
            }
        }
        return minDiff;
        
    }
    private int convert(String str){
        int val =  (Integer.valueOf(str.substring(0, 2))) * 60 + Integer.valueOf(str.substring(3)); 
        return val;
    }
}