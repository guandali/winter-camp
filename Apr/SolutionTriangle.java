public class SolutionTriangle {
    public int minimumTotal(List<List<Integer>> triangle) {
      int len = triangle.size();
      List<Integer>  prev =  triangle.get(len -1);
      for(int layer = len -2; layer >= 0; layer --){
          List<Integer>  cur = new ArrayList<Integer>();
          for(int j = 0; j <triangle.get(layer).size(); j++){
              int temp =  Math.min(prev.get(j), prev.get(j+1)) + triangle.get(layer).get(j);
              cur.add(j, temp);
          }
          
          prev = cur;
          
      }
      return prev.get(0);
    }
}