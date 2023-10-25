//brute force aproach.
class Solution {

    //function to find the maximum of array.
    public int findMax(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(arr[i],max);
        }
        return max;
    }

    //function to find sum
    public int findSum(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    //this counts the count of subarray.
    public int countSubarray(int arr[],int limit)
    {
        //this counts the number of subarray.
        int count=1;
        int subarraySum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(subarraySum+arr[i]<=limit)
            {  
                subarraySum+=arr[i];
            }
            else
            {
                count+=1;
                subarraySum=arr[i];
            }
        }
      
        return count;
    }
    public int splitArray(int[] arr, int k) {
        
        //low
        int low=findMax(arr,arr.length);
        
        //high
        int high=findSum(arr,arr.length);

        //traverse.
        while(low<=high)
        {
            //mid=
            int mid=(low+(high-low)/2);

            //this return the subarray possible
            int cs=countSubarray(arr,mid);
            
            if(cs>k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }

        return low;
    }
}   