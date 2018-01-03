/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class SolutionCanAttendMeetings {
    public boolean canAttendMeetings(Interval[] intervals) {
        boolean answer = true;
        if(intervals.length == 0)  return answer;
        Arrays.sort(intervals, (Interval i1, Interval i2) ->{
            return i1.start - i2.start;
        });
        int prev = -1;
        for(Interval i:intervals){
            if(prev > i.start){
                answer = false;
                break;
            }
            prev = i.end;
        }
        return answer;
    }
}