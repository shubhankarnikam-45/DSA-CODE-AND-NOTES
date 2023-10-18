class Solution {
    public int singleNonDuplicate(int[] arr) {
        
        //length
        int n=arr.length;

        //if array contains only one element.
        if(arr.length==1)
        {
            return arr[0];
        }

        //to avoid the edge cases.
        if(arr[0]!=arr[1])
        {
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2])
        {
            return arr[n-1];
        }


        //now low
        int low=1;
        //high
        int high=n-2;

        while(low<=high)
        {
            //middle element.
            int mid=(low+(high-low)/2);

            //condition to found the desired element.
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }

            //condition to remove the search space.(we are on left)
            if(mid%2==1 && arr[mid]==arr[mid-1] || mid%2==0 && arr[mid]==arr[mid+1])
            {
                //remove left portion
                low=mid+1;
            }
            else
            {
                //this is sure that this is right portion.
                high=mid-1;
            }

        }

        //dummy return statement.
        return -1;

    }
}