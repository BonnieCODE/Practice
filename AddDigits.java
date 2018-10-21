import java.util.*;
import java.io.*;
import java.lang.*;

public class AddDigits{
    
    public int addDigits(int num) {
        int sum=0;
        String numStr = Integer.toString(num);
        int len = numStr.length(); 
        if(len == 1){
            sum = num;
        }
        else{
            String[] strArray = numStr.split("");
            int[] intArray = new int[strArray.length];
            for(int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            int newNum =  Arrays.stream(intArray).sum();
            return addDigits(newNum);
        }      
        return sum;  
    }
   
   public static void main(String arg[]){
   AddDigits classObj = new AddDigits();   
   System.out.println(classObj.addDigits(38));     
}   
    
}