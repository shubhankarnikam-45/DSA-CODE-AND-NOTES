//see code notes

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        
        //loop till (n-2) to 0
        int n=arr.length;

        //stack 
        Stack<Integer>st=new Stack<>();

        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && st.peek()<=arr[i])
            {
                st.pop();
            }
            st.push(arr[i]);
        }

        //array to store the result.
        int ans[]=new int[n];

        //loop till (n-1) to 0
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()>0 && st.peek()<=arr[i])
            {
                st.pop();
            }

            ans[i]=(st.size()==0)?(-1):(st.peek());

            st.push(arr[i]);
        }


        // return
        return ans;
    }
}