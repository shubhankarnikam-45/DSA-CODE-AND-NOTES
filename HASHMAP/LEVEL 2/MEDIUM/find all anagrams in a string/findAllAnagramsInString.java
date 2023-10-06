//438. Find All Anagrams in a String


import java.util.*;
import java.io.*;

class Solution {


	 //comapare function.
    public static boolean compare(HashMap<Character,Integer>smap,HashMap<Character,Integer>pmap)
    {
        
        for(Character c:smap.keySet())
        {
            if(pmap.getOrDefault(c,0)!=smap.get(c))
            {
                return false;
            }

        }

        return true;
    }

	 public List<Integer> findAnagrams(String s, String p) {

        // /creaing arraylist that holds the starting index.
        List<Integer>al=new ArrayList<>();

        //first string is less size 
        if(s.length()<p.length())
        {
            return al;
        }
        
        //creaing two hashmap 
        //first for the comparing the each window when we travese.
        //and secod is for storing the pattern string character and it's frequency.
        HashMap<Character,Integer>smap=new HashMap<>();
        HashMap<Character,Integer>pmap=new HashMap<>();

        

        //now we storing the frequency of characters string p in hashmap.
        for(int i=0;i<p.length();i++)
        {
            //current character.
            char ch=p.charAt(i);

            //adding this character frequency in hashmap.
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }

        //now we slide till the length of string(p) in string s for storing the character frequeyc of each  character.
        for(int i=0;i<p.length();i++)
        {
            //current character.
            char ch=s.charAt(i);

            //adding this character frequency in hashmap.
            smap.put(ch,smap.getOrDefault(ch,0)+1);
        }

        int i=p.length();
        //now slide and find valid answer.
        while(i<s.length())
        {
            //comparing the two hashmaps.
            if(compare(smap,pmap)==true)
            {
                //now adding starting index.
                al.add(i-p.length());
            }

            //current character.
            char ch=s.charAt(i);

            //adding this current character in the hashmap of (smap)
            smap.put(ch,smap.getOrDefault(ch,0)+1);

            //and remove the frequency of starting index (say j)
            char removedCharacter=s.charAt(i-p.length());
            if(smap.get(removedCharacter)==1)
            {

                smap.remove(removedCharacter);
            }
            else
            {
                smap.put(removedCharacter,smap.get(removedCharacter)-1);
            }

            //increse the window
            i++;

        }

        //one more comparision  is required
        //comparing the two hashmaps.
            if(compare(smap,pmap)==true)
            {
                //now adding starting index.
                al.add(i-p.length());
            }

        //return al;
        return al;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        Solution Obj = new Solution();
        List<Integer> res = Obj.findAnagrams(s, p);
        for(int i=0;i<res.size();i++)
            System.out.print(res.get(i) + " ");        
        System.out.println('\n');
    }
}