static int solve(int arr[])
    {
		//maintain tow pointer  for iteration of array
		//due to using this two pointer approach.
		//our space complexity is O(1)
		int i=0;
		int j=1;

		//length of array.
		int n=arr.length;
		while(j<n)
			{
				if(arr[i]!=arr[j])
				{
					i++;
					arr[i]=arr[j];
				}

				//in each iteration we just j++.
				j++;
			}

		//returning the size of array which contains no duplicate.
		return i+1;


		//TIME COMPLEXITY : O(n).
		//SPACE COMPLEXITY: O(1).
		
		
        
    }