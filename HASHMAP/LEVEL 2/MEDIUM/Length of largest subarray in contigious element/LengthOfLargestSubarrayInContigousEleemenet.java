
//time complexity: O(N^2)
//sc: O(N)

// i can't see the article which take less time and space compecxity.


import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int maxLength(int[] arr) {
		
		//length
		int n=arr.length;

		//creaing hashSet to do opratio in case of duplicate elements.
		HashSet<Integer>checkDuplicacy=new HashSet<>();


		//global maximum
		int globalMax=0;

		//traverse.
		for(int i=0;i<n-1;i++)
		{
			int max=arr[i];
			int min=arr[i];

			for(int j=i;j<n;j++)
			{

				//adding this element in hashset.
				//this for chech the duplicate element
				// checkDuplicacy.add(arr[j]);
				
				//check for duplicacy using HashSet.
				if(checkDuplicacy.contains(arr[j]))
				{
					//if duplicate is present then we can't do anything.
					break;
				}
				//adding this element in hashset.
				//this for chech the duplicate element
				checkDuplicacy.add(arr[j]);

				//here we finding the each time maximum.
				max=Math.max(max,arr[j]);
				min=Math.min(min,arr[j]);

				if(max-min==j-i)
				{
					int length=j-i+1;
					if(length>globalMax)
					{
						globalMax=length;
					}
				}


			}

			//clear the hashset.
			checkDuplicacy.clear();
		}

		return globalMax;

	}

}
