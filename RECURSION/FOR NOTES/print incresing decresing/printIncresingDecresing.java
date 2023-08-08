
//this code is know how recursion work actually.
//not for problem sovling. 
// this refrence of pepcoding.
import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    pdi(n);
  }

  public static void pdi(int n) {

    if (n == 0) {                 //1
      return;
    }
    System.out.println(n);        //2
    pdi(n - 1);                   //3
    System.out.println(n);        //4
  }

}