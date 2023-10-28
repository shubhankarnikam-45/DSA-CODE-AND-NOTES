// que link https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
          //global max
        int globalMax=0;

        //for comparing.
        int max=Integer.MIN_VALUE;

        int curr=-1;

        //this holds the final answer.
        int idx=-1;
        
        //traverse
        for(int i=0;i<arr.length;i++)
            {
             
                max=Integer.MIN_VALUE;
                
                //low 
                int low=0;
                int high=arr[0].length-1;
                while(low<=high)
                {
                    //mid
                    int mid=(low+(high-low)/2);
                    
                    if(arr[i][mid]==1)
                    {
                        //going to the left half
                        high=mid-1;
                    }
                    else
                    {
                        low=mid+1;
                    }
                }
                
                max=arr[0].length-low;
                if(globalMax<max)
                {
                    globalMax=max;
                    idx=i;
                }
                
            }


        // return (globalMax==Integer.MIN_VALUE)?(-1):(globalMax);
        return idx;
    }
}