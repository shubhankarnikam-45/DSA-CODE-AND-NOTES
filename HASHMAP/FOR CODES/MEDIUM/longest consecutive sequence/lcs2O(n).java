import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scn.nextInt();
    }
    
    
    //first we create the HashMap and mark it as true for all items in array
    
    HashMap<Integer,Boolean>hm=new HashMap<>();
    
    //traverse and mark it as false.
    for(int i=0;i<a.length;i++)
    {
        hm.put(a[i],true);
    }
    
    //now we again traverse the array if previous element is found in array then we mark it as false.
    //this is sign of this is not starting point.
    for(int i=0;i<a.length;i++)
    {
        if(hm.containsKey(a[i]-1))
        {
            hm.put(a[i],false);
        }
    }
    
    
    
    //now we again travese the array and if this element is marked as true that means we have to find the longest sequence.
    
    //this holds the maxium start point
    int msp=0;
    int max=0;
    for(int i=0;i<a.length;i++)
    {
        if(hm.get(a[i])==true)
        {
            int tsp=a[i];
            int tempMax=1;
            
            //while() loop till we found the sequence.
            while(hm.containsKey(tsp+tempMax))
            {
                tempMax++;
            }
            
            if(tempMax>max)
            {
                max=tempMax;
                msp=a[i];
            }
        }
    }
    
    
    //now print this data.
    
    for(int i=0;i<max;i++)
    {
        System.out.println(msp+i);
    }
    
 }

}