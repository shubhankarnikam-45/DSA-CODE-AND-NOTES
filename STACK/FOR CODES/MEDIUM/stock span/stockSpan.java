//this is solved by me 
//this used apraoch of 'next greter element at left'.


import java.io.*;
import java.util.*;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s  = new Solution();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] stockSpan(int[] arr) {

		//creating stack to do operation.
		Stack<Integer>st=new Stack<>();

		//creating ans[] array to hold the address.
		//size of given array.
		int ans[]=new int[arr.length];
		ans[0]=1;
		//at first we only push the first index.
		st.push(0);

		//now we traversing from the 1st index.
		for(int i=1;i<arr.length;i++)
			{
				//first we abstracting the first index.
				int currentIndex=i;

				//st.size() for the stack is not empty.
				//arr[i]>arr[st.peek()] is for the find left large index.
				while(st.size()>0 && arr[i]>=arr[st.peek()])
					{
						
						st.pop();
					}

				// that means we at last of oth index of array.
				if(st.size()==0)
				{
					int reqIndex=currentIndex+1;
					ans[i]=reqIndex;
				}
				else
				//this is when in above while condition.(arr[i]>=arr[st.peek()) is break.
				{
					int reqIndex=currentIndex-st.peek();
					ans[i]=reqIndex;
				}

				//every time we push the index to stack.
				st.push(i);
			}


		return ans;
		
    }
}