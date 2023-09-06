

//this i learn from the pepcoding but solve in acciojob plat form
//this not solve by me i see the solution for another quetions.
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    { 

		//creating answer arry to hold the address.
		//size === arr.length
		long ans[]=new long[arr.length];

		//creating stack to do operation.
		Stack<Long>st=new Stack<>();

		//now when we moving from back.
		//the last element as no such greater element.
		//hence we put '-1' at that index.
		ans[arr.length-1]=-1;

		//and this element push() to the stack.
		st.push(arr[arr.length-1]);

		//now we traversing from last of aray.
		for(int i=arr.length-2;i>=0;i--)
			{
				//st.size()>0 means in stack some element.
				//and arr[i]>=st.peek() means we not found greater element yet in stack
				while(st.size()>0 && arr[i]>=st.peek())
					{
						st.pop();
						
					}

				//if this while loop is end that means there are two conditions.
				//1. when st.size()>0 that means stack is empty now we add ans[i]=-1 as we not found greater element
				//2. when we found the greater element.
				//see below.
				if(st.size()==0)
				{
					//1.
					ans[i]=-1;
				}
				else
				{
					//2.
					ans[i]=st.peek();
				}

				st.push(arr[i]);
			}

		return ans;
		
    } 
}
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}