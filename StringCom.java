import java.util.*;
import java.io.*;
import java.lang.*;

public class StringCom{
public void stringCompression(String s){
         char c[] = s.toCharArray();
         int counter=1;
         ArrayList<String> result = new ArrayList<>();
             
         for (int i=0; i<c.length-1; i++){             
              if( Character.toLowerCase(c[i]) == Character.toLowerCase(c[i+1]) ){                
                  counter+=1;  
                  if (i+1 == c.length-1){           
                  result.add(Character.toString (c[i+1] )); result.add(Integer.toString(counter));
                  }
              }
              else if( Character.toLowerCase(c[i]) != Character.toLowerCase(c[i+1]) ){
                  result.add(Character.toString (c[i] )); result.add(Integer.toString(counter));
                  counter=1;
                  if (i+1 == c.length-1){           
                  result.add(Character.toString (c[i+1] )); result.add(Integer.toString(counter));
                  }     
              }                                                  
         }
         if(c.length==1 ){
           result.add(s); result.add(Integer.toString(counter));
         }  
     System.out.print( String.join("", result) );
}

public static void main(String arg[]){
StringCom classObj = new StringCom();   
   classObj.stringCompression("a");     
}

}
/*
      HashMap<Character, Integer> result = new HashMap<Character, Integer>();  

   for (Character key: result.keySet()){
   System.out.print( key+""+ Integer.toString(result.get(key)) );
}
*/