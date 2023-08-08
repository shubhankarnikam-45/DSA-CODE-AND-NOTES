 public static int multiplyRecursively(int n, int m) {

	  //base case.
	  if(m==0)
	  {
		  return 0;
	  }

	  //recursive case.
	  int sum=n+multiplyRecursively(n,m-1);
	  return sum;
  }