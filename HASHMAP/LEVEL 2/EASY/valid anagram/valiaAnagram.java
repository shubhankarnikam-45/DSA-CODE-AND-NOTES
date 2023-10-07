
//this easy quetion only for learning.

import java.util.*;

class Solution {
   static boolean areAnagram(String c1, String c2) {



	   //length mismatch.
	   if(c1.length()!=c2.length())
		   return false;
	   
	   //creaing hashmap to store the frequecy of first string.
	   HashMap<Character,Integer>hmap=new HashMap<>();
	   
	   for(int i=0;i<c1.length();i++)
		   {
			   //current character.
			   char ch=c1.charAt(i);
			   hmap.put(ch,hmap.getOrDefault(ch,0)+1);
		   }

	   //now traverse second string and decrese the frequency.
	   for(int i=0;i<c2.length();i++)
		   {
			   //current character.
			   char ch=c2.charAt(i);

			   if(hmap.containsKey(ch)){
			   if(hmap.get(ch)==1)
			   {
				   hmap.remove(ch);
			   }
			   else
			   {
				   hmap.put(ch,hmap.get(ch)-1);
			   }
			   }
		   }


	   if(hmap.size()==0)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
