/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class SolutionInsert {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int ns = newInterval.start;
        int ne = newInterval.end;
        ListIterator<Interval> iter = intervals.listIterator();
        while(iter.hasNext()){
            Interval tmp = iter.next();
            if((ns >= tmp.start && ns <= tmp.end ) || (ne >= tmp.start && ne <= tmp.end)){
                ns = Math.min(ns, tmp.start);
                ne = Math.max(ne, tmp.end);
                iter.remove();
            }
            else if(ns <= tmp.start && ne >= tmp.end) iter.remove();
        }
        Interval addInterval = new Interval(ns, ne);
           int idx = 0;
           for(int i = 0; i < intervals.size(); i++){
               if((intervals.get(i).end < addInterval.start && i+1>=intervals.size()) ||(intervals.get(i).end < addInterval.start) &&                         (intervals.get(i+1).start > addInterval.end) ){
                   idx = i + 1;
               }
           }
        intervals.add(idx,addInterval);
        return intervals;
    }
}