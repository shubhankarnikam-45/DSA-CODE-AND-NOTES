//in acciojob the name of this questionis A Robber.

//for loop.

        // time complexity is O(N)
        // space complexity is O(1)


        // gettintg the size of array.
        // then i iterate over the array using loop.
        // in for loop i am checking that if(i%2==0)==> sum1+=arr[i];else sum2+=arr[i].
        // ans maximum of max(sum1,sum2) is our answer.
        // time complexity is O(N)
        // space complexity is O(1)

		size 
		int n=arr.length;

		int sum1=0;
		int sum2=0;
		//iterate.
		for(int i=0;i<n;i++)
			{
				if(i%2==0)
				{
					sum1+=arr[i];
				}
				else
				{
					sum2+=arr[i];
				}
			}

		if(sum1>sum2)
		{
			return sum1;
		}
		return sum2;