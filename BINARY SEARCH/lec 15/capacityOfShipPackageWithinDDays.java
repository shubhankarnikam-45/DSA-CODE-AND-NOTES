class Solution {

    //function that finds the max
    public int findMax(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            max=Math.max(arr[i],max);
        }
        return max;
    }

    //find the sum of array
    public int findSumOfArray(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    //this function gives the number of days.
    public int numberOfDays(int arr[],int cap ,int n)
    {
        int days=1;
        int load=0;

        for(int i=0;i<n;i++)
        {
            if(load+arr[i]>cap)
            {
                days+=1;
                load=arr[i];
            }
            else
            {
                load+=arr[i];
            }
        }

        return days;
    }
    public int shipWithinDays(int[] arr, int days) {
        
        //length
        int n=arr.length;

        //low
        int low=findMax(arr,n);
        //high
        int high=findSumOfArray(arr,n);

        //apply simeple binary search.
        while(low<=high)
        {
            //middle value.
            int mid=(low+(high-low)/2);

            //number of days.
            int noOfDays=numberOfDays(arr,mid,n);
            if(noOfDays<=days)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        //return the anwer.
        return low;
    }
}