import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      ArrayList<Integer>al=new ArrayList<>();
      
      //adding element in arraylist.
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      
      System.out.println(al);
      
      //VARIATION OF add().
      //this is not work as the .set() function is work.
      al.add(1,232);
      System.out.println(al);
      
      //getting the element in ArrayList. at particular INDEX.
      int data=al.get(1);
      System.out.println(data);
      
      //REMOVE element at PARTICULAR INDEX.
      data=al.remove(1);      
      System.out.println(al);
      
      //UPDATING element at PARTICULAR INDEX.
      al.set(0,100);
      System.out.println(al);
      
      

      
  }
}