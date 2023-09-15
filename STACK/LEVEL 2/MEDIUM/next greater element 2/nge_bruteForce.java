
//this i soved using my aproach.

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	  public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    int n = Integer.parseInt(br.readLine().trim());
			    String inputLine[] = br.readLine().trim().split(" ");
			    int[] nums = new int[n];
			    for(int i=0; i<n; i++)nums[i]=Integer.parseInt(inputLine[i]);
			    int[] res = new Solution().nextLarger2(nums, n);
			    for (int i = 0; i < n; i++) 
			        System.out.print(res[i] + " ");
			    System.out.println();
		}
}
class Solution{
  
	public static int[] nextLarger2(int[] arr, int n)
    { 

		//first we find the nge
		//creaint 'nge' array of size arr.length
		int nge[]=new int[arr.length];

		//creatint stack to do operation.
		Stack<Integer>st=new Stack<>();

		nge[arr.length-1]=-1;

		st.push(arr[arr.length-1]);

		//using logic find the 'nge'
		for(int i=arr.length-2;i>=0;i--)
			{
				while(st.size()>0 && arr[i]>=st.peek())
					{
						st.pop();
					}

				if(st.size()==0)
				{
					nge[i]=-1;
				}
				else
				{
					nge[i]=st.peek();
				}

				st.push(arr[i]);
			}



		for(int i=0;i<nge.length;i++)
			{
				
				if(nge[i]==-1)
				{
					for(int j=0;j<i;j++)
						{
							if(arr[j]>arr[i])
							{
								nge[i]=arr[j];
								break;
							}
						}
				}
			}

		return nge;
		
}
}