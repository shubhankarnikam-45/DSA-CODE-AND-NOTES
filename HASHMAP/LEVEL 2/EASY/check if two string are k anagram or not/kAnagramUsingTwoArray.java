//here we reduce space complexity

//User function template for JAVA

class Solution {
  //size of array is constant.
	static final int MAX_CHAR=26;
	
    boolean areKAnagrams(String s1, String s2, int k) {
        
        //length mismathc
        
        if(s1.length()!=s2.length())
        return false;

		//creaing two array to store frequecy of each character of two string.
		int count1[]=new int[MAX_CHAR];
		int count2[]=new int[MAX_CHAR];

		//storing the first string occurance in first array.
		for(int i=0;i<s1.length();i++)
			{
				//current character.
				char ch=s1.charAt(i);
				count1[ch-'a']++;
			}

		//storing the second string occurance in second array.
		for(int i=0;i<s2.length();i++)
			{
				//current character.
				char ch=s2.charAt(i);
				count2[ch-'a']++;
			}


		//int count(final answer.)
		int count=0;

		
		for(int i=0;i<MAX_CHAR;i++)
			{
				if(count1[i]>count2[i])
				{
					count+=Math.abs(count1[i]-count2[i]);
				}
			}

		//return count
		return count<=k;












		
    }
}