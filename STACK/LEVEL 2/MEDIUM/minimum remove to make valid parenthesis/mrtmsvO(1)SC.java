
//this code has time complexity O(1) if stringBuilder is not considered.

class Solution {
    public String minRemoveToMakeValid(String s) {
        
        //optimal code if we not cosider the StringBuilder as the program code
        //depends on interviewer.

        //creaing one variable to store the opening brakets.
        int open=0;

        //length of string.
        int n=s.length();

        //creating the char array.
        char chars[]=s.toCharArray();

        //traverse.
        for(int i=0;i<n;i++)
        {
            //current char.
            char ch=s.charAt(i);

            if(ch=='(')
            {
                open++;
            }
            else if(ch==')')
            {
                //closing braket.
                if(open>0)
                {
                    open--;
                }
                else
                {
                    //make flag to desired answer.
                    chars[i]='.';
                    
                }
            }
        }


        //if some opening brakets.
        for(int i=chars.length-1;i>=0 && open>0;i--)
        {
            //currnent char
            char ch=chars[i];

            if(ch=='(')
            {
                chars[i]='.';
                open--;
            }
        }



        //printing the answer.
        StringBuilder sb=new StringBuilder();

        for(char c:chars)
        {
            if(c!='.')
            sb.append(c);
        }


        //return 
        return sb.toString();


    }
}