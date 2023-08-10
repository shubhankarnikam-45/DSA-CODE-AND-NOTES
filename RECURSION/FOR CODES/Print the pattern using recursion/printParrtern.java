
//TC: O(n^2).
//SC: O(n). n is no of CALLSTACK.
public static void solve(int n)
    {
		//base case.
		if(n==0)
			return;

		//rc
		solve(n-1);
		for(int i=1;i<=n;i++)
			{
				System.out.print("*"+" ");
			}
		System.out.println();
        
    }