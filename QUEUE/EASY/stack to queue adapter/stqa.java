import java.io.*;
import java.util.*;

class StackQueue
{
	//creaing two stack to do operation.
	Stack<Integer>mainStack;
	Stack<Integer>helper;

	//constructor.
	StackQueue()
	{
		mainStack=new Stack<>();
		helper=new Stack<>();
	}
	
    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
		//removing element from the first stack 	 and adding to the second stack.
		while(mainStack.size()>0)
			{
				helper.add(mainStack.pop());
			}

		//now adding element element in stack 'mainQueue'
		mainStack.push(x);

		//now removed element added to the 'mainStack'
		while(helper.size()>0)
			{
				mainStack.add(helper.pop());
			}
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {

		//if 'mainStack size is zero we just return the -1'
		if(mainStack.size()==0)
		{
			return -1;
		}
		else
		{
			return mainStack.pop();
		}
	    
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);  
        StackQueue s = new StackQueue();	
        int q = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                s.Push(a);
            }
            else if(QueryType == 2)
            ans.add(s.Pop());
        q--;
        }	
        for(int x:ans)
        System.out.print(x+" ");       
     System.out.println();
    }
}