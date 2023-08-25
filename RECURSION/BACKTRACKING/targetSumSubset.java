
//this is quetion of backtracking i can't solve this 
//this is quetion of pepcoding.
//i learn the approach.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int tar = scn.nextInt();
    printTargetSumSubsets(arr, 0, "", 0, tar);      //1
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        
        //base case.
        if(idx==arr.length)
        {
          //if our sum is equal to the target then we print.
          if(sos==tar)
          System.out.println(set);
          return;
        }
        
        //here we select the number. in array.
        printTargetSumSubsets(arr,idx+1,set + arr[idx]+", ",sos+arr[idx],tar);
        
        //here we can't select the number. in array.
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }

}