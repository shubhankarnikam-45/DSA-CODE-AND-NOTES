class Solution {
    //function that find the minimum value.
	public static int findMin(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
			{
				min=Math.min(min,arr[i]);
			}

		return min;
	}

	//function that find the maximum value.
	public static int findMax(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
			{
				max=Math.max(max,arr[i]);
			}

		return max;
	}

	//function that finds the possibility answer.
	public static boolean possible(int arr[],int mid,int m, int k)
	{
		int count=0;
		int noOfBook=0;

		for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<=mid)
				{
					count++;
				}
				else
				{
					noOfBook+=(count/k);
					count=0;
				}
			}

		//this is special
		noOfBook+=(count/k);

		return noOfBook>=m;
	}
    public int minDays(int[] arr, int m, int k) {
        	//length
		int n=arr.length;

		//deal with the invalid case.
        long val=(long)m*(long)k;
		if(n<val)
		{
			return -1;
		}

		//low
		int low=findMin(arr);
		//high
		int high=findMax(arr);;


		//binary search.
		while(low<=high)
			{
				//middle value.
				int mid=(low+(high-low)/2);

				//we check this 'mid' value is possible or not.
				if((possible(arr,mid,m,k)))
				{
					//we not create the 'ans' variable to store the answer.
					//just return the 'low'
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
}