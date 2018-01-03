/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class SolutionFirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int ans = -1;
        while(lo <= hi){
          if(isBadVersion(lo)){
              ans = lo;
              break;
          }
          int mid = lo + (hi - lo)/2;
          if(isBadVersion(mid)){
              if(mid == 1 || (mid - 1 >= 1 && !isBadVersion(mid-1))){
                 ans = mid;
                 break;
              }
              hi = mid -1;

          }
          else {
              lo = mid + 1;
          }
          
        }
        return ans;

        
    }
}