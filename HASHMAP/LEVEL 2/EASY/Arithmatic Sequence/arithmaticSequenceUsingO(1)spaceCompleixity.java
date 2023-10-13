class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        //size of arr
        int n=arr.length;

        //minimum element
        int min=Arrays.stream(arr).min().getAsInt();

        //maximum element
        int max=Arrays.stream(arr).max().getAsInt();

        //if after divide remainder is not zero then we just return
        if((max-min)%(n-1)!=0)
        {
            return false;
        }

        //find d
        int d=(max-min)/(n-1);

        //running loop on array.
        int i=0;
        while(i<n)
        {
            //first we check that ith  index the fit element or not.
            int ithElement=min+i*d;
            if(arr[i]==ithElement)
            {
                i++;
            }
            else
            {
                //first we check this divide or not.
                if((arr[i]-min)%d!=0)
                return false;
                
                //now we find the required index.
                int reqIndex=(arr[i]-min)/d;

                //if ith and jth element is same we just return flase
                if(arr[i]==arr[reqIndex])
                {
                    return false;
                }

                //if above condition is not true then we swap the element.
                int p=arr[i];
                arr[i]=arr[reqIndex];
                arr[reqIndex]=p;
            }
        }


        //this when our all work is done we return true
        return true;



    }
}