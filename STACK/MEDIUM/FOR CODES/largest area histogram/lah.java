
//this includes two quetions.
//small element at right & small element at left.
//pepcoding.


import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
      public static long maximumArea(long arr[], long n){

		  
        //next smaller element towares RIGHT.
        
        //this is used to store the right small index.
        //this index are useful to find the widht.
        long ngear[]=new long[arr.length];

        //creating stack to do operation.
        Stack<Integer>st=new Stack<>();

        //at first we add the first index of element to the stack.
        //this is all time we do.
        st.push(0);

        //now we traverse through the array.
        //now here important thing is why we start with the (i==1)?
        for(int i=1;i<arr.length;i++)
        {
            while(st.size()>0 && arr[i]<arr[st.peek()])
            {
                ngear[st.peek()]=i;
                st.pop();
            }

            st.push(i);

        }   

        while(st.size()>0)
        {
            ngear[st.peek()]=arr.length;
            st.pop();
        }


    //next smaller element to LEFT.

    //this is used to store the index from smaller left index.
    long nsetl[]=new long[arr.length];
		  

    //first we add the last index to stack.
    st.push(arr.length-1);

    //now we move for loop from last. of array.
    for(int i=arr.length-2;i>=0;i--)
    {
        //st.size()==0 means their no element in the stack.
        //and we pop() till second condition is not false.
        while(st.size()>0 && arr[i]<arr[st.peek()])
        {
            nsetl[st.peek()]=i;
            st.pop();
        } 

        st.push(i);
    }


    //now this while() loop for the remaining element in the stack.
    while(st.size()>0)
    {
        nsetl[st.peek()]=-1;
        st.pop();
    }


    long maxArea=0;

    for(int i=0;i<arr.length;i++)
    {
        long width=ngear[i]-nsetl[i]-1;
        long height=arr[i];

        long area=width*height;
        if(area>maxArea)
            maxArea=area;

    }

    return maxArea;
    }
}



