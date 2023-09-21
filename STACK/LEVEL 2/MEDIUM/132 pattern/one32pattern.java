//this code has TC: O(n)
            //  SC: O(n)

import java.util.*;

class Solution {
    public boolean find132pattern(int[] arr) {

		//creating array to store the minimum element from right.
		int smallE[]=new int[arr.length];

		//finding small element.
		smallE[0]=arr[0];

		//traverse
		for(int i=1;i<smallE.length;i++)
			{
				smallE[i]=Math.min(smallE[i-1],smallE[i]);
			}

		//boolean flag.
		boolean flag=false;
		//stack
		Stack<Integer>k=new Stack<>();

		//traversing from last of array.
		for(int j=arr.length-1;j>=0;j--)
			{
				//pop small element
				while(k.size()>0 && k.peek()<=smallE[j])
					{
						k.pop();
					}

				//when we find the  desired result.
				if(k.size()>0 && k.peek()>smallE[j])
				{
					if(k.peek()<arr[j])
					{
						flag=true;
						break;
					}
				}

				//push
				k.push(arr[j]);
			}


		//reuturn flag
		return flag;
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
        boolean result = Obj.find132pattern(arr);
        if (result)
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}