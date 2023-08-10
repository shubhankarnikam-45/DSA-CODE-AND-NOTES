


 public static long fib(int n)
        {
                //base case.
			if(n==1)
			 return 0;    //1
			if(n==2)
				return 1;

			long sum=fib(n-1)+fib(n-2);  //2
			return sum;                 //3
        }