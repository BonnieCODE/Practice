import java.util.*;
import java.io.*;
import java.lang.*;

public class Reverse{
   
   public int reverse(int n){
       int reverse = 0;
       while(n != 0){
        int lastdigit = n%10;
        reverse = reverse*10 + lastdigit;
        n = n/10;      
       } 
    return reverse;  
   }

   public static void main(String arg[]){
      Reverse classObj = new Reverse();   
      System.out.println(classObj.reverse(1234567));
   }
   
}   