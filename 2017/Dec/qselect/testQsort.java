public class testQsort{
    public static void main(String a[]){
         
        qsort sorter = new qsort();
        qselect selector = new qselect();
        int[] input = {24,2,45,20,56,75,56,9,19,53,12,1,2,4,3,4,5,777,343,55,223,23,45};
        int[] input2 = {24,2,45,20,56,75,56,9,19,53,12,1,2,4,3,4,5,777,343,55,223,23,45};
        System.out.println("kth value is " + selector.select(input2, 1));

        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }




}