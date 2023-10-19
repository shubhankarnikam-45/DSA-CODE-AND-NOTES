class Solution {
    public int findPeakElement(int[] arr) {

        //length
        int n=arr.length;
        	//SOME EDGE CASES.

		if(n==1)
		{
			return 0;
		}

		//for index at 0
		if(arr[0]>arr[1])
		{
			return 0;
		}

		//for index n-1
		if(arr[n-1]>arr[n-2])
		{
			return n-1;
		}
		
		//low pointer.
		int low=1;
		//high pointer.
		int high=n-2;

		//bs traversal.
		while(low<=high)
			{
				//middle value.
				int mid=(low+(high-low)/2);

				//condition we found the peak element.
				if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
				{
					return mid;
				}
				else if(arr[mid]>arr[mid-1])
				{
					//when their is increasing curve.
					low=mid+1;
				}
				else if(arr[mid]>arr[mid+1])
				{
					//when we are at decresing curve
					high=mid-1;
				}
				else
				{
					//this handles special case when [1,5,1,2,1]
					low=mid+1;
				}
			}


		//dummay return statement.
		return -1;
    }
}