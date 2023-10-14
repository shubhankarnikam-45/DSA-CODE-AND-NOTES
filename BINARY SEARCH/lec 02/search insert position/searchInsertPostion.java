class Solution {
    public int searchInsert(int[] arr, int target) {
        
        if(target<arr[0])
        {
            return 0;
        }
        //length of array.
        int n=arr.length;

        //low value
        int low=0;

        //high value
        int high=n-1;

        //final answer.
        int ans=n;

        while(low<=high)
        {
            //middle value.
            int mid=(low+high)/2;

            //if we found the value then we just return.
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {

                //if not found.
                ans=mid+1;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return ans;

    }
}