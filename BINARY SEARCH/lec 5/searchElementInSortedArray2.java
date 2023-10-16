class Solution {
    public boolean search(int[] arr, int target) {
         
        	//length
		int n=arr.length;

		//low 
		int low=0;
		
		//high
		int high=n-1;

		while(low<=high)
			{
				//middle value.
				int mid=(low+(high-low)/2);

				//if required value is present.
				if(arr[mid]==target)
				{
					return true;
				}

                //trim condition.
                if(arr[low]==arr[mid] && arr[mid]==arr[high])
                {
                    low++;
                    high--;
                    continue;
                }
				//if left half is soreted.
				//here one thing is sure that one of half is soreted.
				if(arr[low]<=arr[mid])
				{
					if(arr[low]<=target && target<=arr[mid])
					{
						high=mid-1;
					}
					else
					{
						low=mid+1;
					}
				}
				else   //if right half is soreted.
				{
					if(arr[mid]<=target && target<=arr[high])
					{
						low=mid+1;
					}
					else
					{
						high=mid-1;
					}
				}
			}

		//return if not found any index.
		return false;
    }
}