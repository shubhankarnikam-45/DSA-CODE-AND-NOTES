//this is totally new quetion for me .
//here important thing is to learn is the time complecxity.
//and APRACH


import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    } 
} 
class Solution
{ 
    int findCelebrity(int arr[][], int n)
    {

		//creating stack to do operation.
		Stack<Integer>st=new Stack<>();

		for(int i=0;i<arr.length;i++)
			st.push(i);

		while(st.size()>=2)
			{
				//now we pop() two element.
				int i=st.pop();
				int j=st.pop();

				if(arr[i][j]==0)
				{
					//i not know j ==> i is celebrity.
					st.push(i);
				}
				else
				{
					//i knows j ==> j is celebrity.
					st.push(j);
				}

				
			}


		int pot=st.pop();   //this may be answer.

		for(int i=0;i<arr.length;i++)
			{
				if(i!=pot)
				if(arr[i][pot] ==0 || arr[pot][i]==1)
				{
					return -1;
				}
			}


		return pot;


		
    }

}