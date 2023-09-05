
//this quetion i see th aproach.

import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean duplicateParanthesis(String expr) {
		
		Stack<Character>st=new Stack<>();

		for(int i=0;i<expr.length();i++)
		{
			//extracting te first character.
			char ch =expr.charAt(i);

			//if(ch==')' that means we doing some thing.)
			//else we push element to the stack.
			
			if(ch==')')
			{
				//if we found direct '(' then we just return true
				//this is sign of the not valid.
				if(st.peek()=='(')
				{
					return true;
				}
				else
				{
					while(st.peek()!='(')
					st.pop();
					
					st.pop();
				}
			}
			else
			{
				st.push(ch);
			}
		}


		//if for loop run whole that means we not found any like this.

		return false;
	}

}
