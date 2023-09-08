//this is important quetion as i learn new concpet.


class Solution {

    public int[] nextGreaterElement(int arr[])
    {
        int nge[]=new int[arr.length];

        //stack.
        Stack<Integer>st=new Stack<>();

        nge[arr.length-1]=arr.length;
        st.push(arr.length-1);

        for(int i=arr.length-2;i>=0;i--)
        {
            //-a+
            while(st.size()>0 && arr[i]>arr[st.peek()])
            {
                st.pop();
            }

            if(st.size()==0)
            {
                nge[i]=arr.length;
            }
            else
            {
                nge[i]=st.peek();
            }


            st.push(i);

        }




        return nge;
        
    }

    public int[] maxSlidingWindow(int[] arr, int k) {
        
        
        //first we create array of next greater element.
        int nge[]=nextGreaterElement(arr);


        //creating array to hold the answer.
        int ans[]=new int[arr.length-k+1];
        
        //now we running loop till (arr.length-k)
        for(int i=0;i<=arr.length-k;i++)
        {
            int j=i;

            while(nge[j]<i+k)
            {
                j=nge[j];
            }

            ans[i]=arr[j];
        }

        return ans;

    }
}