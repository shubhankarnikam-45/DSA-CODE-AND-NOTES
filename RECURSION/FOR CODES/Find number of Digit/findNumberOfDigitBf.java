
//TC: O(n)
//SC: O(1)

//this quetion is sloved for my practice only 
//their is not new concept i learn.

static int numOfDigi(int n) {
        //base case.
		if(n==0)  //1
			return 0;

		int sum=1+numOfDigi(n/10); //2
		return sum; //3
		
    }