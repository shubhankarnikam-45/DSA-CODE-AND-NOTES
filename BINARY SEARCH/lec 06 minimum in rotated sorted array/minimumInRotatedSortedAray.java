class Solution {
    public int findMin(int[] arr) {
        
        //length of array.
        int n=arr.length;

        //low
        int low=0;
        //high
        int high=n-1;

        //that store the  minimum value.
        int min=Integer.MAX_VALUE;

        //binary search algorithm
        while(low<=high)
        {
            //middle value.
            int mid=(low+(high-low)/2);

            //if one half is already soretd.
            if(arr[low]<=arr[high])
            {
                min=Math.min(arr[low],min);
                break;
            }

            if(arr[low]<=arr[mid])
            {
                //left half is sorted.

                min=Math.min(arr[low],min);
                low=mid+1;
            }
            else
            {
                //right half is soretd.

               min=Math.min(arr[mid],min);
                high=mid-1;
            }



        }

        return min;
    }
}