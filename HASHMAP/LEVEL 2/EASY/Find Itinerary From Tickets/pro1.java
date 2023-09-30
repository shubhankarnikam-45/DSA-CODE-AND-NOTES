// Find Itinerary From Tickets
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


    //creating hashset for storing the value unique
    HashSet<String>hs=new HashSet<>();
    
    for(String key:map.keySet())
		{
		   hs.add(map.get(key));
		}
		
		//first we have to find the starting point.
		String start="";
		
		//for that we goaing to each key and find this value is present in 'value' or not.
		//this is sing of starting point.
		for(String key:map.keySet())
		{
		    if(!hs.contains(key))
		    {
		      start=key;
		      break;
		    }
		}
		

		
		//creaating arraylist to store the 'source city' and 'destination city'
		ArrayList<String>al=new ArrayList<>();
		
		//at first time.
		// al.add(start);
		
		//one loop is run till the size of hashmap.
		
		    while(map.containsKey(start))
		    {
		        al.add(start);
		        start=map.get(start);
		    }
		


        
        
        
        //print the data.
        for(String city:al)
        {
            System.out.print(city+"-> ");
        }

//at last we add the last destination.
        al.add(start);
        
        System.out.print(start);
	}
}
