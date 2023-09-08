
//here we crate the code modular by defining function().
//here algorithm is important.


import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Solution ob =new Solution();
    ob.evaluate(exp);
  }
}

class Solution{
    public void evaluate(String exp){

		//creating stacks.
		
		//for prefix.
		Stack<String>prefix=new Stack<>();

		//for postfix
		Stack<String>postfix=new Stack<>();

		//for operator.
		Stack<Character>operator=new Stack<>();

		//to store the final result.
		Stack<Integer>ans=new Stack<>();


		for(int i=0;i<exp.length();i++)
			{
				char ch=exp.charAt(i);

				if(ch=='(')
				{
					operator.push('(');
				}
				else if(ch>='0' && ch<='9' || ch>='a'&& ch<='z' || ch>='A' && ch<='Z')
				{
					//push to theh prefix stack.
					prefix.push(ch+"");

					//push to the post fix stack.
					postfix.push(ch+"");

					//push to answer stack.
					ans.push(ch-'0'); 
					
				}
				else if(ch=='+' || ch=='-' || ch=='*'|| ch=='/')
				{
					while(operator.size()>0 && operator.peek()!='(' && precedence(ch)<=precedence(operator.peek()))
						{
							char op=operator.pop();

							//for prefix.
							String preValue2=prefix.pop();
							String preValue1=prefix.pop();

							String finalResult=op+preValue1+preValue2;

							prefix.push(finalResult);


							//for post fix.

							String postValue2=postfix.pop();
							String postValue1=postfix.pop();
							finalResult=postValue1+postValue2+op;

							postfix.push(finalResult);


							//for answwer.

							int v2=ans.pop();
							int v1=ans.pop();

							int finalAnswer=calculation(v1,v2,op);

							ans.push(finalAnswer);
						}

					operator.push(ch);
				}
				else if(ch==')')
				{
					while(operator.peek()!='(')
						{
							char op=operator.pop();

							//for prefix.
							String preValue2=prefix.pop();
							String preValue1=prefix.pop();

							String finalResult=op+preValue1+preValue2;

							prefix.push(finalResult);


							//for post fix.

							String postValue2=postfix.pop();
							String postValue1=postfix.pop();
							finalResult=postValue1+postValue2+op;

							postfix.push(finalResult);


							//for answwer.

							int v2=ans.pop();
							int v1=ans.pop();

							int finalAnswer=calculation(v1,v2,op);

							ans.push(finalAnswer);
						}

					operator.pop();
				}


				
			}

		while(operator.size()>0)
						{
							char op=operator.pop();

							//for prefix.
							String preValue2=prefix.pop();
							String preValue1=prefix.pop();

							String finalResult=op+preValue1+preValue2;

							prefix.push(finalResult);


							//for post fix.

							String postValue2=postfix.pop();
							String postValue1=postfix.pop();
							finalResult=postValue1+postValue2+op;

							postfix.push(finalResult);


							//for answwer.

							int v2=ans.pop();
							int v1=ans.pop();

							int finalAnswer=calculation(v1,v2,op);

							ans.push(finalAnswer);
						}



	






		System.out.println(ans.pop());
		System.out.println(postfix.pop());
		System.out.println(prefix.pop());

		
    }


	//this is for find the answer.
	public int calculation(int v1,int v2, char ch)
	{
		if(ch=='+')
		{
			return v1+v2;
		}
		else if(ch=='-')
		{
			return  v1-v2;
		}
		else if(ch=='*')
		{
			return v1*v2;
		}
		else
		{
			return v1/v2;
		}


	
	}


	//for precedence 

	public int precedence(char ch)
	{
		if(ch=='+')
		{
			return 1;
		}
		else if(ch=='-')
		{
			return  1;
		}
		else if(ch=='*')
		{
			return 2;
		}
		else if(ch=='/')
		{
			return 2;
		}
		else{
			return 0;
		}
	}
}               