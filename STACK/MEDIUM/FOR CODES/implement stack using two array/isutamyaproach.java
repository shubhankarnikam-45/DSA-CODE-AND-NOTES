//this i solved in ac portal and this is different aproach.

import java.util.*;

class twoStacks {
	int[] arr;
	int size;
	int top1, top2;

	// Constructor
	twoStacks(int n)
	{
		size = n;
		arr = new int[n];
		top1 = n / 2 + 1-1;
		top2 = n / 2+1;
	}

	// Method to push an element x to stack1
	void push1(int x)
	{
		if(top1==arr.length)
		{
			System.out.println("-1");
		}
		else
		{
			top1++;
			arr[top1]=x;
			
		}
	}

	// Method to push an element
	// x to stack2
	void push2(int x)
	{
       if(top2==-1)
	   {
		   System.out.println("-1");
	   }
		else
	   {
		    top2--;
		   arr[top2]=x;
		  
	   }
	}

	// Method to pop an element from first stack
	void pop1()
	{
		if(top1==size / 2 + 1-1)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(arr[top1]);
			top1--;
		}
	}

	// Method to pop an element
	// from second stack
	void pop2()
	{
		if(top2==size/2+1)
		{
			System.out.println("-1");
		}
		else{
			System.out.println(arr[top2]);
			top2++;
		}
	}
};
public class Main {

	/* Driver program to test twoStacks class */
	public static void main(String[] args)
	{
		twoStacks ts = new twoStacks(50);
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i =0; i<n; i++){
            int temp;
            temp = sc.nextInt();
            if(temp == 1) ts.pop1();
            else if(temp==3) ts.pop2();
            else if(temp == 2) {
                int temp2;
                temp2 = sc.nextInt();
                ts.push1(temp2);
            }
            else{
                int temp2;
                temp2 = sc.nextInt();
                ts.push2(temp2);
            }
        }
	}
}