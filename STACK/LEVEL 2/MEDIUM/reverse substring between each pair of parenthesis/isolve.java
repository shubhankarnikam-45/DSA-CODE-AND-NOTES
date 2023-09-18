//this i solve own :)


import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    System.out.println(reverseParentheses(s));
  }

  public static String reverseParentheses(String s) {

	  //length
	  int n=s.length();

	  //stack.
	  Stack<Character>st=new Stack<>();

	  //result holding string.
	  StringBuffer sb=new StringBuffer();
	  
	  //traverse.
	  for(int i=0;i<n;i++)
		  {
			  //currnent char.
			  char ch=s.charAt(i);

			  if(ch=='(')
			  {
				  st.push(ch);
			  }
			  else if(ch>='a' && ch<='z')
			  {
				  st.push(ch);
			  }
			  else
			  {
				  sb.setLength(0);
				  
				  //closing braket
				  while(st.size()>0 && st.peek()!='(')
					  {
						  sb.append(st.peek());
						  st.pop();
					  }
				  st.pop();

				  //traverse
				  for(int j=0;j<sb.length();j++)
					  {
						  st.push(sb.charAt(j));
					  }
				  
			  }
		  }


	  sb.setLength(0);
	  while(st.size()>0)
		  {
			  sb.append(st.pop());
		  }

	    StringBuilder reversed = new StringBuilder(sb);
	  reversed.reverse();
	  return reversed.toString();
  }
}