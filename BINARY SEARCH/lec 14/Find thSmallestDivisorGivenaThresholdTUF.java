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

        //edge case
        if(n>threshold)
        {
            return -1;
        }

		//max value.
		int max=Integer.MIN_VALUE;

		//this loop will find the minimum and maximum value.
		for(int i=0;i<n;i++)
			{
				
				max=Math.max(max,arr[i]);
			}

		//low
		int low=1;
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
}