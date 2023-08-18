import java.util.*;

public class Main {
  
  
  static void partitioningOfArray(int a[],int pivot)
  {
    
    //at starting i and j pointing to the oth position.
    int i=0;
    int j=0;
    
    
    // i -- end ==> unknown.
    // 0 -- j-1 ==> small and equal.
    // j -- i-1 ==>greater 
    
    while(i<a.length)
    {
      
      if(a[i]<=pivot)
      {
        //swaping the element at ith and jth postion.
          int item=a[i];
          a[i]=a[j];
          a[j]=item;
        
        //increment i .
        i++;
        
        //increment j .
        j++;
      }
      else
      {
        i++;
      }
    }
    
 
    
  }

  

  
    public static void main(String[] args) {
      
    Scanner scn=new Scanner(System.in);
    
    //inputing the size of array.
    int n=scn.nextInt();
    
    //pivot element.
    int pivot=scn.nextInt();
    
    //creating array of size n.
    int []a=new int[n];
    
    for(int i=0;i<n;i++)
    {
      a[i]=scn.nextInt();
    }
    
    partitioningOfArray(a,pivot);
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }
}