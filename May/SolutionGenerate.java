public class SolutionGenerate {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
       List<Integer> prev = null;
       for(int i = 1; i <= numRows; i++ ){
           int[] arr = new int[i];
           int j = 0;
           while (j < i){
               if(j == 0 || j == i - 1){
                   arr[j] = 1;
               }
               else if (prev != null){
                   arr[j] = prev.get(j) + prev.get(j-1);
               }
               j++;
           }
           prev = IntStream.of(arr).boxed().collect(Collectors.toList());;
           ans.add(prev);
       }
       
       return ans;
        
    }
}
