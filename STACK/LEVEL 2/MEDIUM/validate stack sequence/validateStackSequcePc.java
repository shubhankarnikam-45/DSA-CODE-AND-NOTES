class Solution {
    public boolean validateStackSequences(int[] pushed, int[] poped) {
        
        //creaing stack to do operation.
        Stack<Integer>st=new Stack<>();

        int j=0;

        for(int num:pushed)
        {
            st.push(num);
            while(st.size()>0 && st.peek()==poped[j])
            {
                st.pop();
                j++;
            }
        }


        return j==poped.length;
    }
}