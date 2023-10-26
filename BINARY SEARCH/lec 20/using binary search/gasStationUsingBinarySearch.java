public class Solution {

    //this function check the number of gas station possible
    public static int checkCount(int arr[],double dist)
    {
        //initially count is zero.
        int cnt=0;
        
        //we loop on array to find the count.
        for(int i=0;i<arr.length-1;i++)
        {
            //this gives the number of gas stations between consecutes.
            int noOfGasStation=(int)((arr[i+1]-arr[i])/dist);
            
            //this when exact division is possible.
            if((arr[i+1]-arr[i])==dist*noOfGasStation)
            {
                noOfGasStation--;
            }

            cnt+=noOfGasStation;
        }

        return cnt;
        
        
    } 
    public static double MinimiseMaxDistance(int []arr, int k){
        
        //length
        int n=arr.length;
        
        //low pointer
        double low=0;

         // high pointer.
        double high=0;

        //high depends on the consecutive max
        for(int i=0;i<n-1;i++)
        {
            high=Math.max(arr[i+1]-arr[i],high);
        }

        double diff=1e-6;

        //binary search.
        while(high-low>diff)
        {
            double mid=(low+high)/2.0;

            if(checkCount(arr,mid)>k)
            {
                low=mid;
            }
            else
            {
                high=mid;
            }
        }

        return high;

       
        
        
    }
}