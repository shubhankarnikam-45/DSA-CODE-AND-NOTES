
//this code i solve partially but after applying the aproch of pc i solve compleixly.

class Solution {
    public int scoreOfParentheses(String s) {
        
        //stack. of integer.
        Stack<Integer>st=new Stack<>();

        //traverse
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='(')
            {
                //-1 is sign of the '(' braket
                st.push(-1);
            }
            else
            {
                //immmediate '(' braket.
                if(st.peek()==-1)
                {
                    st.pop();
                    st.push(1);
                }
                else
                {
                    int val=0;
                    while(st.peek()!=-1)
                    {
                        val=val+st.pop();
                    }
                    st.pop();
                    st.push(2*val);
                }
            }
        }

        int val=0;
                    while(st.size()>0)
                    {
                        val=val+st.pop();
                    }

        return val;            

    }
}