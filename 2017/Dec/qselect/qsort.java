

public class qsort{
	private int length; 
	private int array[];

	public void sort(int[] input){
        if (input == null){
        	return; 
        }
        length = input.length;
        this.array = input;
        sortHelper( 0, length-1 );

   }
   private void sortHelper( int loIndex, int hiIndex ){
    	int i = loIndex; 
    	int j = hiIndex;
        // Select a pivot from middle
        int pivot = array[loIndex + (hiIndex - loIndex)/2];
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
        if (loIndex < j){
        	sortHelper(loIndex, j);
        }
        if ( i < hiIndex){
        	sortHelper(i, hiIndex);
        }


   }

   private void swap(int i, int j){
   		int temp = array[i];
   		array[i] = array[j];
   		array[j] = temp;

   }


}