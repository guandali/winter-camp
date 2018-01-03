import java.util.List;
import java.util.ArrayList;
public class fizzBuzz {
    public List<String> fizzBuzz(int n){
        
        List <String> results = new ArrayList<String>();
        for (int i = 1; i <= n; i++ ){
            if (i % 15 == 0){
                results.add("FizzBuzz");
            }
            else if (i % 5 == 0){
                results.add("Buzz");
            }
            else if (i % 3 == 0){
                results.add("Fizz");
            }
            else{
                results.add(Integer.toString(i));
            }
                
        }
        return results;
                
    }
}
