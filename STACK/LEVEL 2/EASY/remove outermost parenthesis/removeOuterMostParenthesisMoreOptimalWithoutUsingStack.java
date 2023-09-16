//this is without using the stack and memory efficient as we not use the stack.

class Solution {
    public String removeOuterParentheses(String s) {
        
        //length of string
        int n=s.length();

        //ans string
        StringBuilder sb=new StringBuilder();

        //to store the count of opended brakets.
        int open=0;

        //traverce
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                if(open>0)
                {
                    sb.append(c);
                }
                open++;
            }
            else
            {
                //closed brakets.
                if(open>1)
                {
                    sb.append(c);
                }
                open--;
            }
        }


        return sb.toString();
    }
}