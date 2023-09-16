//this is not solve i solve only 10%
//try to learn the aproach.

class Solution {
    public String removeOuterParentheses(String s) {
        
        //length of string
        int n=s.length();

        //stack
		Stack<Character>st=new Stack<>();

		//answer string.
		StringBuilder sb=new StringBuilder();

		//traverse.
		for(int i=0;i<n;i++)
			{
				char ch=s.charAt(i);
				if(ch=='(')
				{
					if(st.size()>0)
					{
						sb.append(ch);
					}
					st.push(ch);
				}
				else
				{
					//closing braket.
					st.pop();
					if(st.size()>0)
					{
						sb.append(ch);
					}
				}
			}

		return sb.toString();
    }
}