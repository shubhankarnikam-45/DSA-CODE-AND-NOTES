public class Solution {
    public static double MinimiseMaxDistance(int []arr, int k){
        
        //length
        int n=arr.length;

        //creating array that tells that how  many section are possible
        int howMany[]=new int[n-1];

        //this stores the maximum element
        double maxSection=-1;
        int maxIndex=-1;
         
        //now we traverse from 1--k
        for(int i=1;i<=k;i++)
        {
            maxSection=-1;
            maxIndex=-1;

            //now we traverse array for finding the answer.
            for(int j=0;j<n-1;j++)
            {
                //this gives the current  maximum section.
                double findMax=(double)(arr[j+1]-arr[j])/(double)(howMany[j]+1);

                if(maxSection<findMax)
                {
                    maxSection=findMax;
                    maxIndex=j;
                }
            }

            //adding the index position to 'array of howMany'
            howMany[maxIndex]++;
        }

        double ans=-1;

        //now we again traverse throught the given array to find the final answer.
        for(int i=0;i<n-1;i++)
        {
             //this gives the current  maximum section.
            double findMax=(arr[i+1]-arr[i])/(howMany[i]+1);

            ans=Math.max(findMax,ans);
        }

        //return the final answer.
        return ans;


    }
}