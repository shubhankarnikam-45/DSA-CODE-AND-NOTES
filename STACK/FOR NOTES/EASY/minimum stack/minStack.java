//this quetion i solved then i see teh solutio nof pepcoding.


import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			Solution g = new Solution();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
        sc.close();
		
	}
}

class Solution
{
	int minEle;
	Stack<Integer> n;
	Stack<Integer>min;
    
	Solution()
	{
		n = new Stack<Integer>();
		min=new Stack<Integer>();
	}

	void push(int x){

		//in normal stack we add each time.
		n.push(x);

		//here when min stack size is zero menas at first time inersertion. then we added.
		//second condition is learn by DR.
		if(min.size()==0 || x<=min.peek())
		{
			min.push(x);
		}
    }
	
	int pop(){


		if(n.size()==0)
		{
			return -1;
		}
		int popValue=n.pop();
		if(popValue==min.peek())
		{
			min.pop();
		}

		return popValue;
	}

    int getMin(){

		if(min.size()==0)
		{
			return -1;
		}
		else
		{
			return min.peek();
		}
	}	
}
