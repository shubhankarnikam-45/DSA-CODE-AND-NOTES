
//tc: O(log(n)).
//first we solved this problem  using normal recursive approach due to this time complexity.
//is O(n) but we OPTIMIZE CODE and or TC is O(log(N))

//sc: O(log(n))

//this quetion is important because due to this we learn code optimization.
public static long power(int x, int n)
    {
		//base case.
		if(n==0)     //1
			return 1;

		long xpnb2=power(x,n/2);     //2
		long xn=xpnb2*xpnb2;   //3

		//if(n is odd)
		if(n%2==1)      //4
		{
			xn*=x;
		}

		return xn;  //5
		
    }