//this code i learn from PC

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}

		
		//first we make one Hashmap for find the starting point.
		HashMap<String,Boolean>hm=new HashMap<>();
		
		//running for loop on the give HashMap and make all keys as true.
		for(String key:map.keySet())
		{
		  hm.put(key,true);
		}
		
		//this is actual loop where we find the 'staring point'
		String src="";
		
		for(String start:map.keySet())
		{
		  Boolean val=hm.get(start);
		  if(val==true)
		  {
		    src=start;
		    break;
		  }
		}
		
		
		while(true)
		{
		  if(map.containsKey(src)==true)
		  {
		    System.out.print(src+"->");
		    src=map.get(src);
		  }
		  else
		  {
		    System.out.print(src+".");
		    break;
		  }
		}
	}
}
