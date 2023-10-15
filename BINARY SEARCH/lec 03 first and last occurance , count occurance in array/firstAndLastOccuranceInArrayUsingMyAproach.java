class Solution {

    	//creating function to find the first occuracne.
	public static int findFirstOcc(int arr[],int n,int k)
	{
		int low=0;
		int high=n-1;

		//to store the first occurance.
		int firstOcc=-1;

		while(low<=high)
			{
				//middle index.
				int mid=low+(high-low)/2;

				if(arr[mid]==k)
				{
					firstOcc=mid;
					high=mid-1;
				}
				else if(arr[mid]<k)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}

		//return answer.
		return firstOcc;
	}

    // creating function to find the last occuracne.
	public static int findLastOcc(int arr[],int n,int k)
	{
		int low=0;
		int high=n-1;

		//to store the first occurance.
		int lastOcc=-1;

		while(low<=high)
			{
				//middle index.
				int mid=(low+(high-low)/2);

				if(arr[mid]==k)
				{
					lastOcc=mid;
					low=mid+1;
				}
				else if(arr[mid]<k)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}

		//return answer.
		return lastOcc;
	}
    public int[] searchRange(int[] nums, int k) {

            //length
            int n=nums.length;

			//function that return the first occurance
			int firstOcc=findFirstOcc(nums,n,k);


			
			// function that return the last occurance
			int lastOcc=findLastOcc(nums,n,k);

            //return array of answer.
            int ans[]=new int [2];
            ans[0]=firstOcc;
            ans[1]=lastOcc;

            return ans;
    }
}