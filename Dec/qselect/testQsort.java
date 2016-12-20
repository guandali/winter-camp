public class testQsort{
    public static void main(String a[]){
         
        qsort sorter = new qsort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12,1,2,4,3,4,5};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }




}