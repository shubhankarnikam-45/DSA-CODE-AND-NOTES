//this i solve 50 % without external help


import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] arr) {

		//length
		int n=arr.length;

		//stack
		Stack<Integer>st=new Stack<>();

		//first element of array add as it is
		st.push(arr[0]);

		//traverse
		for(int i=1;i<n;i++)
			{
				//when both as SAME SIGN 
				if(st.size()>0 && (st.peek()>0 && arr[i]>0) ||(st.peek()<0 && arr[i]<0))
				{
					st.push(arr[i]);
				}
				else if(st.size()>0 && (arr[i]>0 && st.peek()<0) )
				{
					//this if when same value but different sigh(+8,-8)
					if(Math.abs(st.peek())==arr[i])
					{
						st.pop();
					}
					else
					{
						//remove small element in the stack.
					st.pop();

					//add current element
					st.push(arr[i]);
					}
					
				}
				else
				{
					if(Math.abs(arr[i])==st.peek())
					{
						st.pop();
					}
				}
			}

		//creaing array of size stack.
		int stackSize=st.size();

		//array
		int result[]=new int [stackSize];

		int k=stackSize-1;
		while(st.size()>0)
			{
				result[k--]=st.pop();
			}


		return result;


		
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.asteroidCollision(arr);
        for (int i = 0; i < result.length; ++i)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}