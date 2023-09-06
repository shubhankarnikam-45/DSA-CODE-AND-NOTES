

//this is second apraoch(left to right).

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        
        
        //to hold the answer array.
        long ans[]=new long[arr.length];
        
        //creating stack to do operation.
        Stack<Integer>st=new Stack<>();
        
        //at first time we add first element array index.
        st.push(0);
        
        //now we traversing throught the array.
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && arr[i]>arr[st.peek()])
            {
                int pos=st.peek();
                ans[pos]=arr[i];
                st.pop();
            }
            
            
            st.push(i);
        }
        
        while(st.size()>0)
        {
            int pos=st.peek();
            ans[pos]=-1;
            st.pop();
        }
        
        
        return ans;
        
    } 
}
