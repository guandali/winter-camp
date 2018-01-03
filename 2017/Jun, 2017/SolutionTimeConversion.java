import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionTimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        String ans = "";
        String time = s.substring(s.length()-2, s.length());
        if(time.equals("AM")){
            if(s.substring(0, 2).equals("12")){
                ans = "00"+ s.substring(2,s.length()-2);
            }
            else {
                ans = s.substring(0,s.length()-2);
            }
            
        }
        else {
            if(s.substring(0, 2).equals("12")){
                ans = s.substring(0,s.length()-2);
            }
            else {
                ans = Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2,s.length()-2);
            }
            
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

