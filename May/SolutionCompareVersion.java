public class SolutionCompareVersion {
    public int compareVersion(String version1, String version2) {
        int ans = 0;
        if(version1 == null || version2 == null){
            return ans;
        }
        String[] list1 = version1.split("\\.");
        String[] list2 = version2.split("\\.");
       
        int len = (list1.length > list2.length)?(list1.length):(list2.length);
        
        for(int i =0; i< len; i++){
             if(i >= list1.length && list1.length < list2.length){
                 int j = i;
                 while(j < list2.length && Integer.parseInt(list2[j]) == 0){
                     j++;
                 }
                 ans = (j == list2.length)?(0):(-1);
                 break;
             }
             if(i >= list2.length && list2.length < list1.length){
                int j = i;
                 while(j < list1.length && Integer.parseInt(list1[j]) == 0){
                     j++;
                 }
                 ans = (j == list1.length)?(0):(1);
                 break;
             }
             int val1 = Integer.parseInt(list1[i]);
             int val2 = Integer.parseInt(list2[i]);
             
             if(val1 > val2){
                 ans = 1;
                 break;
             }
             if(val1 < val2){
                 ans = -1;
                 break;
             }
            
        }
        
        return ans;
        
    }
}