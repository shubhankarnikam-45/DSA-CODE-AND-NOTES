
//must read commments for better understaning.

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      //creaing hashmap.
      HashMap<String,Integer>hm=new HashMap<>();
      
      //pusing the value in hash map using '.put()' function.
      hm.put("India",145);
      hm.put("US",22);
      hm.put("UK",40);
      hm.put("China",200);
      
      //print the data.
      System.out.println(hm);
      
      //understnading the behaviour of the .put() method.
      hm.put("Nigeria",60);
      hm.put("US",45);
      
      //print the data.
      System.out.println(hm);
      
      //here important thing to note is we added new key:"Nigeria" and 
      //update the existing one "US"
      
      //and the 'Nigeria' is not added at last is added in between 
      //this is default behaviour of the 'HaspMap';
      
      
      //BEHAVIOR OF .get() function.
      System.out.println(hm.get("India"));
      System.out.println(hm.get("Utopia"));
      
      //here 'India' is present we got the output '135'
      //and "Utopia" is not present hence we got the 'null'
      
      
      //BEHAVIOR OF .containsKey() function.
      System.out.println(hm.containsKey("India"));
      System.out.println(hm.containsKey("Utopia"));
      
      //if key prsent then it returns 'true' else return 'false'
      
      //******************************
      //collecting the 'keys'
      Set<String>keys=hm.keySet();
      System.out.println(keys);
      
      //this is useful when we  print the key and value.
      for(String key:hm.keySet())
      {
        Integer val=hm.get(key);
        System.out.println(key+" "+val);
      }
      
      
      
      //all this function .put() ,.get() ,.constainsKey() ,.keySet() 
      //are done in time complexity O(1)
      
      
  }
}