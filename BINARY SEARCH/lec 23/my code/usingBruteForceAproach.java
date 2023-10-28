import java.io.*;
import java.util.*;

// que link: https://www.codingninjas.com/studio/problems/row-of-a-matrix-with-maximum-ones_982768?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//https://course.acciojob.com/idle?question=40ad500f-e244-4123-96fa-fb6300ce8eac
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.rowWithMaximumOnes(arr,n,m));
        
    }
}

class Solution {
    static int rowWithMaximumOnes(int arr[][], int n, int m) {

        //global max
        int globalMax=Integer.MIN_VALUE;

        //for comparing.
        int max=Integer.MIN_VALUE;

        int curr=-1;

        //this holds the final answer.
        int idx=-1;
        
        //traverse
        for(int i=0;i<arr.length;i++)
            {
                int cnt=0;
                max=Integer.MIN_VALUE;
                for(int j=0;j<arr[0].length;j++)
                    {
                        //current element.
                         curr=arr[i][j];

                        if(curr==1)
                        {
                            cnt++;
                        }
                        if(curr==0 && cnt!=0)
                        {
                            max=Math.max(cnt,max);
                            cnt=0;
                        }
                    }

                if(cnt!=0)
                    {
                        max=Math.max(cnt,max);
                        cnt=0;
                    }

                if(globalMax<max)
                {
                    globalMax=max;
                    idx=i;
                }
                // globalMax=Math.max(max,globalMax);
                
            }


        // return (globalMax==Integer.MIN_VALUE)?(-1):(globalMax);
        return idx;
























        
    }
}