
import java.lang.*;

public class qselect{
	private int length; 
	private int array[];
  private int kth;
  // Select take a array and value as input find kth largest among this array
	public int select(int[] input, int k){
        if (input == null){
        	return -1; 
        }
        length = input.length;
        this.array = input;
        this.kth = k;
        return selectHelper( 0, length-1 );

   }
   private int selectHelper( int loIndex, int hiIndex){


    	int i = loIndex; 
    	int j = hiIndex;
        // Select a pivot randomly
      int pivot_index = loIndex + (int) Math.floor(Math.random() * (hiIndex - loIndex + 1 ));
      int pivot = array[pivot_index];
        while (i <= j){
        	while (array[i] < pivot ){
        		i++;
        	}
        	while (array[j] > pivot ){
        		j -- ;
        	}
        	if (i <= j){
        		swap(i, j);
        		i++;
        		j--;
        	}


        }
        // Try locate kth element
        if (i == j && i == kth  ){
          return array[kth];



        }
        if (loIndex < j){
        	selectHelper(loIndex, j);
        }
        if ( i < hiIndex){
        	selectHelper(i, hiIndex);
        }
        if (loIndex > hiIndex){
          return -1; 
        }



   }

   private void swap(int i, int j){
   		int temp = array[i];
   		array[i] = array[j];
   		array[j] = temp;
   }


}