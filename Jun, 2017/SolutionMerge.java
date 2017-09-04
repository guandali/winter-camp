/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class SolutionMerge {
    public List<Interval> merge(List<Interval> intervals) {
        //Key question: how do we define overlap mathmathically ?
        for(int i = 0; i < intervals.size(); i++){
            Interval i0 = intervals.get(i);
            for(int j = i + 1; j < intervals.size(); j ++){
                Interval i1 = intervals.get(j);
                if(isOverlaped(i0, i1)){
                    intervals.add(new Interval(Math.min(i0.start, i1.start), Math.max(i0.end, i1.end)));
                    intervals.remove(i0);
                    intervals.remove(i1);
                    i = i -1;
                    break;
                }
            }
        }
        
        return intervals;
        
        
        
    }
    
    private boolean isOverlaped(Interval i0, Interval i1){
        return ((i0.start <= i1.end && i0.end >=  i1.start) || (i1.start <= i0.end && i1.end >=  i0.start));
    }
}