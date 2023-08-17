import java.util.*;

class Solution {
    public int[] MergeSortArray(int[] a, int[] b) {

		//length of array 'a'
		int n1=a.length;

		//length of array 'b'
		int n2=b.length;
		
		//creating the array of size(a.lengh+b.length).
		//that to be returned.
		int result[]=new int[n2+n2];

		//creating POINTER related to the ARRAY.
		int i=0;         //for a.
		int j=0;         //for b.
		int k=0;    //for result.

		while(i<n1 && j<n2)
			{
				if(a[i]<b[j])
				{
					//we assing the current element in array a[] in the result.
					result[k]=a[i];

					//and increment. i
					i++;

					//k++;
				}
				else
				{
					//we assing the current element in array b[] in the result.
					result[k]=b[j];

					//and increment j.
					j++;
					
					//k++;
				}

				//every time we increase the count of 'k'
				k++;
			}

		//when element in array a[] is pending.
		while(i<n1)
			{
				result[k]=a[i];
				i++;
				k++;
			}

		//when element in array b[] is pending.
		while(j<n2)
			{
				result[k]=b[j];
				j++;
				k++;
			}


		//now we just return result.
		return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[] A = new int[m];
        int[] B = new int[n];

        for(int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        Solution Obj = new Solution();

        int[] ans = Obj.MergeSortArray(A,B);

        for(int i = 0; i < n + m; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}