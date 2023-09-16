//this is without using stack.


class Solution {
    public int minAddToMakeValid(String s) {
        
        //craing two int variables one for 'count' and second for the 'correction' 
        int count=0;
        int correction=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='(')
            {
                count++;
            }
            else if(ch==')' && count!=0)
            {
                count--;
            }
            else
            {
                correction++;
            }

        }

        return  correction + count;
    }
}