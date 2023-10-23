
//this is burte force solution.

import java.io.*;
import java.util.*;
import java.util.*;

class Solution{

	//this function tells the is possible or not.
	public static boolean isPossible(int arr[],int j,int cows)
	{
		//this stores the cows placed.
		int countOfCows=1;

		//this stores the last position.
		int last=arr[0];

		//traverse.
		for(int i=1;i<arr.length;i++)
			{
				if(arr[i]-last>=j)
				{
					countOfCows++;
					last=arr[i];
				}

				if(countOfCows>=cows)
				{
					return true;
				}
			}

		return false;
		
	}

    public static int aggressiveCows(int arr[],int cows){

		//length
		int n=arr.length;

		//sort the array.
		Arrays.sort(arr);

		//low
		int low=1;
		//high
		int high=arr[n-1]-arr[0];


		//using binary search
		while(low<=high)
			{
				//middle value.
				int mid=(low+(high-low)/2);

				if(isPossible(arr,mid,cows))
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}

		//dummy return 
		return high;
		
		
    }


}

class Main {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution obj=new Solution();
		System.out.println(obj.aggressiveCows(nums,k));

    }
}
