import java.util.*;

public class Main {
    public static void main(String[] args) {


            
      //character contains number and we converted into the proper number.
      char ch='1';
      
      int num= ch-'0';
      
      System.out.println(num);
      
      
      // suppose 1--> a, 2-->b,......,26-->z.
      //see convertion.
      
      int chValue=1;
      
      char code =(char)('a'+chValue-1);
      
      System.out.println(code);
      
      
      
      //integer to String.
      int num1=12;
      String intToStr=Integer.toString(num1);
      System.out.println(intToStr);


      //check the given character is digit or not.  
      //to check the given Character is  DIGIT OR NOT.
      char ch='8';
      
      System.out.println(Character.isDigit(ch));      //output is TRUE


    //character + string ==> string
    char ch='a';
    
    String str=ch+"";
    
    System.out.println(str);  //a

    //int array store the by default 0 value
    //Integer array store the by default 'null' value.

    //in arraylist by default null

    //how to fill array using inbuild method.
    int arr[] =new int[5];  //{0,0,0,0,0} 
    Arrays.fill(arr, -1);   //{-1, -1, -1, -1, -1}
      
      
      
  }
}