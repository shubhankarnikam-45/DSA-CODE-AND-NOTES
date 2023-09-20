//this i solve using the apeoch of 'pc' 
//next program which is optimal  see code carefully

class Solution {
    public String minRemoveToMakeValid(String s) {
        
        //stack.
        Stack<Integer>st=new Stack<>();

        //string to char array.
        char chars[]=s.toCharArray();

        //traverse.
        for(int i=0;i<chars.length;i++)
        {
            char ch=chars[i];

            if(ch=='(')
            {
                st.push(i);
            }
            else if(ch==')')
            {
                //closing braket.
                if(st.size()==0)
                {
                    chars[i]='.';
                }
                else
                {
                    st.pop();
                }
            }
        }

        //peding opening breaket in stack.
        while(st.size()>0)
        {
            chars[st.pop()]='.';
        }


        //traver and add to the stringBuilder
        StringBuilder sb=new StringBuilder();

        for(char c:chars)
        {
            if(c!='.')
            sb.append(c);
        }


        return sb.toString();
    }
}