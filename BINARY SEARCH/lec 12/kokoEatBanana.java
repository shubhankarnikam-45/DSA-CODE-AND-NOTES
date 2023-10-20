import java.util.Scanner;

import java.util.*;

class Solution {
	//function to find the maximum in array.
	public static int maxInArray(int []arr)
	{
		int max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)
			{
				max=Math.max(arr[i],max);
			}

		return max;
	}

	//function to find how much time is taken.
	public static int totalTimeTaken(int arr[],int mid)
	{
		int total=0;

		for(int i=0;i<arr.length;i++)
			{
				total+=(int)Math.ceil((double)arr[i]/(double)mid);
			}

		return total;
	}
	
    public static int minEatingSpeed(int[] piles, int h) {

		//length
		int n=piles.length;

		//low
		int low=1;

		//high
		int high=maxInArray(piles);

		//creating answer variable that store the answer.
		int ans=0;

		//binary search.
		while(low<=high)
			{
				//middle value.
				int mid=(low+(high-low)/2);
				
				//this gives the time taken.
				int total=totalTimeTaken(piles,mid);

				//condition to store the answer.
				if(total<=h)
				{
					ans=mid;
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
				
			}


		return ans;
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int h = scanner.nextInt();
        System.out.println(Solution.minEatingSpeed(array, h));
        scanner.close();
    }
}
