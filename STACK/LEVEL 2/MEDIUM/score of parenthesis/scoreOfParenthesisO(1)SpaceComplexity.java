
// tc: O(n)
// sc: O(1)

class Solution {
    public int scoreOfParentheses(String s) {
        
        //maintain two variable.
        //1. result.
        int result=0;

        //2. depth
        int depth=0;

        //previous.
        char previousChar='(';

        //traverse.
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                depth++;
            }
            else
            {
                depth--;

                if(previousChar=='(')
                {
                    result+= Math.pow(2,depth);
                }
                   
            }

            previousChar=ch;
        }


        //return result.
        return result;
    }
}