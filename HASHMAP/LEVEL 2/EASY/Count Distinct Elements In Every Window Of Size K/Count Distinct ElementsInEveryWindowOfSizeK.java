import java.util.*;

class Solution {
    public int[] countDistinct(int[] arr, int k) {

		//creaing HashMap for storing the <element and freqeucy> each time.
		HashMap<Integer,Integer>frequencyMap=new HashMap<>();

		
		
		
	
		//now we use the logic of sliding window.
		//for that logic we use the two pointer aproach.
		int i=0;
		int j=-1;

		//first for loop for treaversing k-2 times.
		while(i<=k-2)
			{
				frequencyMap.put(arr[i],frequencyMap.getOrDefault(arr[i],0)+1);
				i++;
			}

		//now second loop for the find the desired result
		//which runs from the i==k-2
		//for that we decrese the count of i
		i--;

		ArrayList<Integer>al=new ArrayList<>();

		while(i<arr.length-1)
			{
				i++;
				frequencyMap.put(arr[i],frequencyMap.getOrDefault(arr[i],0)+1);

				// result[p]=frequencyMap.size();
				// p++;

				al.add(frequencyMap.size());

				//now release the j-- (previous pointer.)
				j++;

				int oldFrequency=frequencyMap.get(arr[j]);

				if(oldFrequency==1)
				{
					frequencyMap.remove(arr[j]);
				}
				else
				{
					frequencyMap.put(arr[j],oldFrequency-1);
				}
				
			}



		//creaing array of size 'al.size()' for storing the final result.
		int result[]=new int[al.size()];
		
		for(int w=0;w<al.size();w++)
			result[w]=al.get(w);

		
		return result;
	


		
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result[] = Obj.countDistinct(arr, k);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}