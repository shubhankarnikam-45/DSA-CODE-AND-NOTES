

import java.io.*;
import java.util.*;
class Stack
{
	//creaint two queue for our operation.
	Queue<Integer> mainQueue;
	Queue<Integer> helper;

	//contructor.
	Stack()
	{
		mainQueue=new ArrayDeque<>();
		helper=new ArrayDeque<>();
		
	}
    void push(int a)
    {

		//copy 'mainQueue' element to the 'helper'
		while(mainQueue.size()>0)
			{
				helper.add(mainQueue.remove());
			}

		//now we add value to the mainQueue.
		mainQueue.add(a);

		//now we added this removed element again to the 'mainQueue'
		while(helper.size()>0)
			{
				mainQueue.add(helper.remove());
			}
    }
    
    int pop()
    {

		if(mainQueue.size()>0)
		{
			return mainQueue.remove();
		}
		else
		{
			return -1;
		}
    }	
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);    
        Stack g = new Stack();			
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1){
                int a = sc.nextInt();
                    // call push function here
					g.push(a);
            }
            else if(QueryType == 2){
                    // call pop function here
					System.out.print(g.pop()+" ");
            }
            q--;
        }	
    }
}