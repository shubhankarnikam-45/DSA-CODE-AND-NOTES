public class Solution {
    //return 1 if ==m
    //return 0 if <m
    //return 2 if >m
    public static int find(int mid,int n,int m)
    {
         long ans=1;

        //traverse
        for(int i=1;i<=n;i++)
        {
            ans*=mid;

            //this is case of overflow remove the right half
            if(ans>m)
            {
                return 2;
            }
        }

        //we found our desired result.
        if(ans==m)
        {
            return 1;
        }

        //this when m is smaller.
        return 0;
    }
    public static int NthRoot(int n, int m) {
        
        //low
        int low=1;
        //high
        int high=m;

        //binary search.
        while(low<=high)
        {
            int mid=(low+(high-low)/2);

            //middle number
            int midN=find(mid,n,m);
            if(midN==1)
            {
                //we go our answer.
                return mid;
            }
            else if(midN==0)
            {
                //remove left half
                low=mid+1;
            }
            else
            {
                //remove right half
                high=mid-1;
            }
        }



        //dummy return statement.
        return -1;




















    }
}
