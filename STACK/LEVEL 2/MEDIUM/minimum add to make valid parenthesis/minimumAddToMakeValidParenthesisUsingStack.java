//this aproach when stack is used.


import java.util.*;

class Solution {
    public int MinOps(String s) {


		//string size.
		int n=s.length();

		//creatint stack to do operation.
		Stack<Character>st=new Stack<>();

		for(int i=0;i<n;i++)
			{
				char ch=s.charAt(i);
				if(ch=='(')
				{
					st.push(ch);
				}
				else
				{
					if(st.size()>0 && st.peek()=='(')
					{
						st.pop();
					}
					else
					{
						st.push(ch);
					}
				}
			}


		return st.size();

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
	    Solution Obj = new Solution();
        System.out.println(Obj.MinOps(s));
    }
}