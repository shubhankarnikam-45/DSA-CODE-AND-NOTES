// que link: https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        //array 1 size
        int n1=nums1.length;
        //array 2 length
        int n2=nums2.length;

        //if n1>n2
        if(n1>n2)
        {
            return findMedianSortedArrays(nums2,nums1);
        }

        //total size of two array.
        int n=(n1+n2);

        //low pointer
        int low=0;
        //high pointer.
        //size is equal to the size of second array.
        int high=n1;

        //the number required on the left.
        int left=(n1+n2+1)/2;

        //binary search.
        while(low<=high)
        {
            //middle value.
            int mid=(low+(high-low)/2);

            //now we check for this mid value is valid or not.
            
            //middle value of first array.
            int mid1=mid;
            //middle value of second array.
            int mid2=left-mid1;

            //this holds the first array left value.
            int firstArrayLeftValue=Integer.MIN_VALUE;
            //this holds the first array right value.
            int firstArrayRightValue=Integer.MAX_VALUE;

            //this holds the second array left value.
            int secondArrayLeftValue=Integer.MIN_VALUE;
            //this holds the second array right value.
            int secondArrayRightValue=Integer.MAX_VALUE;

            //if mid1 is go out of index. on right
            //we check specially
            if(mid1<n1)
            {
                firstArrayRightValue=nums1[mid1];
            }

            //if mid2 is go out of index. on right
            //we check speciialy.
            if(mid2<n2)
            {
                secondArrayRightValue=nums2[mid2];
            }

            //when mid1 is go out of index on left.
            if(mid1-1>=0)
            {
                firstArrayLeftValue=nums1[mid1-1];
            }

            //when mid 2 is go out of index on left
            if(mid2-1>=0)
            {
                secondArrayLeftValue=nums2[mid2-1];
            }


            if(firstArrayLeftValue<=secondArrayRightValue && secondArrayLeftValue <=firstArrayRightValue)
            {
                //if odd
                if(n%2==1)
                {
                    return Math.max(firstArrayLeftValue,secondArrayLeftValue);
                }

                return( (double)Math.max(firstArrayLeftValue,secondArrayLeftValue)+Math.min(firstArrayRightValue,secondArrayRightValue))/2.0;
            }
            else if(firstArrayLeftValue>secondArrayRightValue)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }

        return 0;
    }
}