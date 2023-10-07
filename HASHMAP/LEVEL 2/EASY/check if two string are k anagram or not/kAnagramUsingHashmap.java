
class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        
        //if length of two string is mismatch then we just return false
        if(s1.length()!=s2.length())
        return false;
		//using hashmap stroing the frequecy of each character in string 1
		HashMap<Character,Integer>hmap=new HashMap<>();
		for(int i=0;i<s1.length();i++)
			{
				//current character 
				char ch=s1.charAt(i);

				//putting in hmap.
				hmap.put(ch,hmap.getOrDefault(ch,0)+1);
			}

		//now traverset second second string and decrese freq of current character.
		for(int i=0;i<s2.length();i++)
			{
				//currnet char
				char ch=s2.charAt(i);

				//decrese freq
				if(hmap.getOrDefault(ch,0)>0)
				{
					hmap.put(ch,hmap.get(ch)-1);
				}
			}

		//for stroign the sum
		int count=0;
		
		//now adding freq
		for(char c:hmap.keySet())
			{
				count+=hmap.get(c);		
			}

		//
		if(count>k)
		{
			return false;
		}
		else
		{
			return true;
		}
    }
}