//this quetion is solved by me as use the (next greater element at right)
//this is aproach 1.


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
    
    //this holds the answer array.
    int ans[]=new int[arr.length];
    
    //creating stack to do operation.
    Stack<Integer>=new Stack<>();
    
    //fisrt time (1st index can't have the right side grater elemen)
    //hence this we put -1;
    //and added to stack is arr[0] element.
    ans[0]=-1;
    st.push(arr[0]);
    
    
    for(int i=1;i<arr.length;i++)
    {
        while(st.size()>0 && arr[i]>st.peek())
        {
            
            st.pop();
        }
        
        if(st.size()==0)
        {
            ans[i]=-1;
        }
        else
        {
            ans[i]=st.peek();
        }
        
        st.push(arr[i]);
    }
    
    
    return ans;
  }

}