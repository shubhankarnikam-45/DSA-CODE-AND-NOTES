
//this problem solve using concept of PREFIX SUM with TC O(N)

import java.io.*;
import java.util.*;
 
 class Solution
{
         static int solve(int n, int[] arr, int k){

			 //creating hashmap that stores the PREFIX SUM 
			 HashMap<Integer,Integer>hmap=new HashMap<>();

			 //in map we added 0->1
			 //for treat if sum is zero when we traverse the array.
			 hmap.put(0,1);

			 //creating count variable that store the final answer.
			 int count=0;

			 //creating sum varible for store the prefix sum in hashmap.
			 int sum=0;

			 //traverse
			 for(int i=0;i<n;i++)
				 {
					 //each time we store the frequency.
					 sum+=arr[i];

					 //if in map we found key (sum-k) then add to the count.
					 if(hmap.containsKey(sum-k))
					 {
						 count+=hmap.get(sum-k);
					 }

					 //every time we added this sum to hashmap.
					 hmap.put(sum,hmap.getOrDefault(sum,0)+1);					 
				 }

			 //return answer.
			 return count;
    
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_Arr = br.readLine().split(" ");
         int[] Arr = new int[N];
         for(int i_Arr = 0; i_Arr < arr_Arr.length; i_Arr++)
         {
         	Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
         }
         int K = Integer.parseInt(br.readLine().trim());
 
         int out_ =  Solution.solve(N, Arr, K);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
}