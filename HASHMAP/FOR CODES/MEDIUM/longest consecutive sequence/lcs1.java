import java.util.*;
import java.lang.*;
import java.io.*;

class Main {








    
    
    public static long longestConsecutiveSequence(int arr[], long n) 
    { 


		//this for storing the count
		int count=1;

		long max=1;

		//sort
		Arrays.sort(arr);

		// for(int i=0;i<n;i++)
		// 	System.out.println(arr[i]);

		//traversing from the 1st index
		for(int i=1;i<arr.length;i++)
			{
				//when true then we just inccese the count.
				if(arr[i]==arr[i-1]+1)
				{
					count++;
				}
				else 
				{
					//this is important case when their is equal element 
					if(arr[i]!=arr[i-1])
					{
						max=Math.max(max,count);
						count=1;
					}
					
				}
			}


		//this is when array [1,2,3,4,5,6] then loop else codition is not meet
		max=Math.max(max,count);


		//returing the result.
		return max;

    } 





















	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        System.out.println(longestConsecutiveSequence(arr, n));
		
	}
}



