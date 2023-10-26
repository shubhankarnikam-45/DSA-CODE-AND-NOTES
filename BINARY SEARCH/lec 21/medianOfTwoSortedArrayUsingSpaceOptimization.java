class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        //length of first array.
        int n1=nums1.length;
        //length of second array.
        int n2=nums2.length;

        //length of all this two arrray.
        int n=(n1+n2);

        //creating two pointer for traverese.
        int i=0;
        int j=0;

        //desired index req.
        int idx2=(n/2);
        int idx1=(n/2)-1;

        //element at index1
        int idx1Element=-1;
        //element at index2
        int idx2Element=-1;

        //this variable track of answer.
        int cnt=0;

        //traverse to find answer.
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                //if we meet the first req index count
                //then store this element.
                if(cnt==idx1)
                {
                    idx1Element=nums1[i];
                }

                //if we meet the second req index count
                //then store this element.
                if(cnt==idx2)
                {
                    idx2Element=nums1[i];
                }

                cnt++;
                i++;

            }
            else
            {
                //if we meet the first req index count
                //then store this element.
                if(cnt==idx1)
                {
                    idx1Element=nums2[j];
                }

                //if we meet the second req index count
                //then store this element.
                if(cnt==idx2)
                {
                    idx2Element=nums2[j];
                }

                cnt++;
                j++;
            }
        }

        //if first element in arrray is pending.
        while(i<n1)
        {
             if(cnt==idx1)
                {
                    idx1Element=nums1[i];
                }

                //if we meet the second req index count
                //then store this element.
                if(cnt==idx2)
                {
                    idx2Element=nums1[i];
                }

                cnt++;
                i++;
        }

        while(j<n2)
        {
            //if we meet the first req index count
                //then store this element.
                if(cnt==idx1)
                {
                    idx1Element=nums2[j];
                }

                //if we meet the second req index count
                //then store this element.
                if(cnt==idx2)
                {
                    idx2Element=nums2[j];
                }

                cnt++;
                j++;
        }


        //if size of n is odd
        if(n%2==1)
        {
            return idx2Element;
        }

        //if size of n is even
        return (double)((double)idx2Element+(double)idx1Element)/2.0;

    }
}