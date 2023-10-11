import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossibleToReorder(int n, int[] arr) {
		
		//created TreeMap to do operation.
		TreeMap<Integer,Integer>tmap=new TreeMap<>();

		//stroing the freq of element in tmap
		for(int i=0;i<n;i++)
		{
			tmap.put(arr[i],tmap.getOrDefault(arr[i],0)+1);
		}

		//travese tree map.
		for(Integer x:tmap.keySet())
		{
			//if current element frequency is 0 then remove from hashmap.
			if(tmap.get(x)==0) continue;

			//find target element
			int target=(x<0)?(x/2):(x*2);

			//false condtion
			if(x<0 && x/2!=0 || tmap.get(x)>tmap.getOrDefault(target,0))
			{
				return false;
			}

			//put the valu in tree map
			tmap.put(target,tmap.get(target)-tmap.get(x));
		}

		//return true
		return true;
		
	}
}