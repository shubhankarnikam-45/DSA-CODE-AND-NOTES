public static int[] twoSum(int[] arr, int target) {

		//first i created HashMap
		HashMap<Integer,Integer>m=new HashMap<>();

		//creating array to return answer.
		int ans[]=new int[2];
		
		for(int i=0;i<arr.length;i++)
			{
				//this is current element.
				int current=arr[i];

				//this element get when we deleted from the target which we find in the HashMap.
				int neededElement=target-current;

				if(m.containsKey(neededElement))
				{
					//if we get the desired key then we just add to the array . and RETURN
					ans[0]=m.get(neededElement)+1;
					ans[1]=++i;
					return ans;

				}
				else
				{
					//other wise we just put into the HashMap
					m.put(arr[i],i);
				}

				
			}
		return ans;
		
    }