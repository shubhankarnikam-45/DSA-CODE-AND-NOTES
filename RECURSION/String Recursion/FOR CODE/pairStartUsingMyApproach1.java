
//this quetion is encounter when i solved the ASSIGNEMENT PRACITICE QUETION OF ACCIOJOB.


static String helper(String s,int idx)
	{
		//base case.
		//if idx is at s.length() then we just return the empty string.
		if(idx==s.length()-1)      //1
		{
			return s.charAt(idx)+"";
		}

		String ans=helper(s,idx+1); //2

		if(s.charAt(idx)==ans.charAt(0))    //3
		{
			return s.charAt(idx)+"*"+ans;
		}
		else
		{
			return s.charAt(idx)+ans;
		}
		
	}
    static String PairStar(String s) {

		//here no index is given hence we required heplper fn
		String str=helper(s,0);
		return str;
    }