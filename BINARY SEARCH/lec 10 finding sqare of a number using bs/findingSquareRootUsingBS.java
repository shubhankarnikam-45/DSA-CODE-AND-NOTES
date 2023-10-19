import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int sqrt(int n) {

		//low
		int low=1;
		int high=n;

		//apply binary search.
		while(low<=high)
			{
				//middle value.
				long mid=(low+high)/2;

				//square value.
				long sqrt=(mid*mid);

				if(sqrt>(long)n)
				{
					high=(int)mid-1;
				}
				else
				{
					low=(int)mid+1;
				}
			}

		return high;
    }

  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int A = sc.nextInt();
	  
    System.out.println(sqrt(A));
		
	}
}