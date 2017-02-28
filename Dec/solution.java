/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //Should use binery search to reduce function call 
        int lo = 1; 
        int hi = n; 
        while(lo < hi){
            int version_num = (lo + hi)/2;
            if(isBadVersion(version_num)){
                hi = version_num;
            }
            else{
                lo = version_num + 1;
            }
            
            
        }
        return hi;
    }
}