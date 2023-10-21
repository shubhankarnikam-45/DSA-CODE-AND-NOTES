
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int threshold = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.smallestDivisor(arr, threshold));
        sc.close();
    }
}

class Solution {
	//in this function we found that the is possble answer or not.
	public boolean possible(int arr[],int m,int t)
	{
		
		//length
		int n=arr.length;

		//total sum
		int totalSum=0;
		
		//traverse array to find the answer.
		for(int i=0;i<n;i++)
			{
				totalSum+=(int)Math.ceil((double)arr[i]/m);
			}
		

		return (totalSum<=t);
	}
    public int smallestDivisor(int[] arr, int threshold) {

		//length
		int n=arr.length;

		//min value.
		int min=Integer.MAX_VALUE;
		//max value.
		int max=Integer.MIN_VALUE;

		//this loop will find the minimum and maximum value.
		for(int i=0;i<n;i++)
			{
				min=Math.min(min,arr[i]);
				max=Math.max(max,arr[i]);
			}

		//low
		int low=min;
		int high=max;

		//binary search on this question.
		while(low<=high)
			{
				//middle value.
				int mid=(low+(high-low)/2);
				
				if(possible(arr,mid,threshold)==true)
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}

		//return answer.
		return low;
	
		
    }
};