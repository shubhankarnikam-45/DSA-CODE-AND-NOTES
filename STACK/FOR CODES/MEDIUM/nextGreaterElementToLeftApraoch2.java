//this is aproach 2

//here dry run is important.
import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] ngl = solve(a);
    display(ngl);
  }

  public static int[] solve(int[] arr) {
    
    //now we move right to left.
    
    //this holds the answer array.
    int ans[]=new int[arr.length];
    
    //creating stack to do operation.
    Stack<Integer>st=new Stack<>();
    

    //at first in stack we push the last array element index.
    st.push(arr.length-1);
    
    for(int i=arr.length-2;i>=0;i--)
    {
        //here st.size()>0 because of the size()>0  is must.
        //and we pop() element till the arr[i]>st.peek().
        while(st.size()>0 && arr[i]>arr[st.peek()])
        {
            
            int pos=st.peek();
            ans[pos]=arr[i];
            st.pop();
            
        }
        
        st.push(i);
    }
    
    //this is because at last some element are in stack.
    while(st.size()>0)
    {
        int pos=st.peek();
        ans[pos]=-1;
        st.pop();
    }
    
    // input
//     5
// 5
// 3
// 8
// -2
// 7

// output
// -1
// 5
// -1
// 8
// 8
    
    
    
    
    
    return ans;
  }

}