// que link.
//https://www.codingninjas.com/studio/problems/median-of-a-row-wise-sorted-matrix_1115473?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

public final class Solution {

    
    //black box function.
    
    public static int findMedian(int matrix[][], int m, int n) {
        
        //defining the low and high pointer.
        int low = 0;
        int high  = (int)1e9;

        //middle value of whole array.
        int medianPointer = m*n/2;
        while(low<=high)
        {
            //middle value.
            int mid = (low + (high - low)/2);

            int lesserValue = blackBox(matrix, m, n, mid);

            if(lesserValue<=medianPointer)
            {
                low = mid + 1;
            }
            else
            {
                high = mid -1;
            }

        }

        return low;
    }

    public static int blackBox(int mat[][], int m, int n, int num)
    {
        int cnt = 0;

        for(int[]arr : mat)
        {
                cnt += upperBound(arr, m,n, num);   
        }

        return cnt;
    }

    //function that finds the upperbound.
    public static int upperBound(int arr[], int m, int n, int val)
    {
        
            int low = 0;
            int high = n-1;

            int ans = n;
            while(low<=high)
            {
                int mid = (low + (high - low)/2);

                if(arr[mid] > val)
                {
                    ans = mid;
                    high = mid -1;
                }
                else
                {
                    low  = mid + 1;
                }
            }
        
        //return the high.
        return low;
    }
    
}