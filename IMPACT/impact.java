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
      
      
  }
}