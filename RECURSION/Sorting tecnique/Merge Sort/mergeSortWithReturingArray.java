import java.util.*;

public class Main {
  
  //logic of merge two sorted array.
	static int[] mergeTwoSortedArray(int a[],int b[])
	{
	  
	  //creaing resultant array of size (a.length+b.length).
	  int result[]=new int[a.length+b.length];
	  
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length)
			{
				if(a[i]<b[j])
				{
				  result[k]=a[i];
					i++;
					k++;
				}
				else
				{
				  result[k]=b[j];
				  j++;
				  k++;
				}
			}
			
			while(i<a.length)
			{
			  result[k]=a[i];
			  i++;
			  k++;
			}
			
			while(j<b.length)
			{
			  result[k]=b[j];
			  j++;
			  k++;
			}
			
			return result;
	}
  
  //logic of mergeSort()
  static int[] mergeSort(int []arr,int lo,int hi)
  {
    
    if(lo==hi)
    {
      int ba[]=new int[1];
      ba[0]=arr[lo];
      return ba;
    }
        int mid=(lo+hi)/2;
    
    	//first sorted half.
    	int firstSoretdHalf[]=mergeSort(arr,lo,mid);
    
    	//second sorted half.
    	int secondSortedHalf[]=mergeSort(arr,mid+1,hi);
    
    	//the result of this two we sort using logic of 'sort two array'.
    	int result[]=mergeTwoSortedArray(firstSoretdHalf,secondSortedHalf);
    	
    	return result;

  }
  
    public static void main(String[] args) {
      
    Scanner scn=new Scanner(System.in);
    
    //inputing the size of array.
    int n=scn.nextInt();
    
    //creating array of size n.
    int []a=new int[n];
    
    for(int i=0;i<n;i++)
    {
      a[i]=scn.nextInt();
    }
    
    int result[]=mergeSort(a,0,n-1);
    
    for(int i=0;i<result.length;i++)
    {
      System.out.println(result[i]);
    }
  }
}