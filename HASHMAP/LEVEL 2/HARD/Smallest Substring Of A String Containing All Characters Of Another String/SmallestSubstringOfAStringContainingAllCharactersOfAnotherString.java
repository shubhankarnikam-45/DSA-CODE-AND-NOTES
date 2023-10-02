//this is solved my me and 
//tc is O(N^2)
//sc is O(N)

import java.io.*;
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

		//creating hashmap for storing the key as character and  value as integer.
		HashMap<Character,Integer>frequencyOfEachChar=new HashMap<>();

		//global string.
		String globalString ="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

		//treverse for finding the result.
		for(int i=0;i<=s.length()-t.length();i++)
			{
				
				String currentString="";
				//now each time we creaing hashmap and it's frequency.
				for(int k=0;k<t.length();k++)
					{
						char ch=t.charAt(k);
						if(frequencyOfEachChar.containsKey(ch)==true)
						{
							int oldFreq=frequencyOfEachChar.get(ch);
							frequencyOfEachChar.put(ch,oldFreq+1);
						}
						else
						{
							frequencyOfEachChar.put(ch,1);
						}
					}


				
				

				for(int j=i;j<s.length();j++)
					{
					

						//if hashmap is empty means we found our result we just compare.
						if(frequencyOfEachChar.size()==0)
						{
							// System.out.println(currentString);
							//here we found the small size string.
							if(currentString.length() <globalString.length())
							{
								globalString=currentString;
							}

							break;
						}

						

						//we got the current char.
						char currentChar=s.charAt(j);

						//if current char is prsent in the hashmap then we decrese the count .
						if(frequencyOfEachChar.containsKey(currentChar))
						{
							int freq=frequencyOfEachChar.get(currentChar);

							//if freq is 1 means we remove it else we just decrese the count.
							if(freq==1)
							{
								frequencyOfEachChar.remove(currentChar);
							}
							else
							{
								frequencyOfEachChar.put(currentChar,freq-1);
							}

							
						}


						//addng character in given String 
						currentString+=currentChar;


						
					}	

				if(frequencyOfEachChar.size()==0)
						{
							// System.out.println(currentString);
							//here we found the small size string.
							if(currentString.length() <globalString.length())
							{
								globalString=currentString;
							}

							
						}

			frequencyOfEachChar.clear();
			}

		return globalString;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s = sc.next();
		t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s,t));
    }
}