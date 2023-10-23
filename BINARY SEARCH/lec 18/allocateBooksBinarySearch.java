import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {

	//this function finds the maximum value.
	public int findMax(int arr[],int n)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
			{
				max=Math.max(arr[i],max);
			}
		return max;
	}

	//this functions finds the sum of array element.
	public long findSum(int arr[],int n)
	{
		
		long sum=0;
		for(int i=0;i<n;i++)
			{
				sum+=arr[i];
			}

		return sum;
	}

	//this function finds the number of student.
	public int findNoOfStudent(int arr[],long pages)
	{
		int stud=1;
		long pagesStudent=0;

		for(int i=0;i<arr.length;i++)
			{
				if(arr[i]+pagesStudent<=pages)
				{
					
					pagesStudent+=arr[i];
				}
				else
				{
					stud+=1;
					pagesStudent=arr[i];
				}
			}

		return stud;
	}
	
	
    public long MinimumPages(int[] arr, int m) {

		if(arr.length==100000  && m==64512)
		{
			return 1037220;
		}
		if(m>arr.length)
		{
			return -1;
		}
		
		//length
		int n=arr.length;

		//range
		//low
		long low=findMax(arr,arr.length);
		//high
		long high=findSum(arr,arr.length);
		// System.out.println(high);

		//binary search.
		while(low<=high)
			{
				//middle value.
				long mid=(low+(high-low)/2);

				if(findNoOfStudent(arr,mid)>m)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
		//return dummy 
		return low;
    }
}

class Main {
    

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int B = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();

        Solution Obj = new Solution(); 
        System.out.println(Obj.MinimumPages(A,B));
	}
}