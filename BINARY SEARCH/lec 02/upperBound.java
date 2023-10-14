public class Solution {
    public static int upperBound(int []arr, int x, int n){
        
        int low=0;
        int high=n-1;

        //to store the final answer.
        //if we not found any value then we return size of array.
        int ans=n;

        while(low<=high)
        {
            //finding middle value
            int mid=(low+high)/2;

            if(arr[mid]>x)
            {
                //probably answer.
                ans=mid;
                high=mid-1;
            }
            else
            {
                //going towards right.
                low=mid+1;
            }

        }

        //return answer.
        return ans;
    }
}
