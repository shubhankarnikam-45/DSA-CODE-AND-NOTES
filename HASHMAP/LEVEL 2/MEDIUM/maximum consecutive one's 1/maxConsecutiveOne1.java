//this is leetcode medium quetion.
// in plat form name is maximum consecutive one 2

import java.util.*;

public class Main {

    public static int solution(int[] arr){
        
        //creaing one pointer j for traversing.
        int j=-1;
        
        //creaing count variable that used for storing the freqency of zero.
        int count=0;
        
        //creating one variable that stores the result.
        int result=0;
        
        //traverse.
        for(int i=0;i<arr.length;i++)
        {
            //if current array element is  0 then increse the count.
            if(arr[i]==0)
            {
                count++;
            }
            
            //this is step of release.
            while(count>1)
            {
                j++;
                if(arr[j]==0)
                {
                    count--;
                }
            }
            
            //now we find our answer.
            int len=i-j;
            if(len>result)
            {
                result=len;
            }
            
        }

        return result;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
	}

}
