
//tc : O(n+1)k ==>O(n)
//scs : O(n+1)k ==>O(n)

//this is quetion is based on STRING and i learn when i learn the RECURSION 
// this quetion is encounter on ACCIOJOB PORTAL.



static String helper(String s,int idx)
	{
		//if index is out of bound.
		if(idx==s.length())
		{
			//we just return a empty String.
			return "";
		}

		//now each time we create the empty string. ans
		String ans="";

		//if current character is NOT EQUAL TO THE 'x' then we just.
		//concatinate the CURRNET CHARATER with ANSWER STRING.
		if(s.charAt(idx)!='x')
			ans+=s.charAt(idx);

		//now we cancatinate the ans with above function call.
		//here we just made a function call.
		ans+=helper(s,idx+1);

		//return a ans variable.
		return ans;
	}
    static String noX(String s) {

		//when we not given index then we use HELPER FUNCTION.
		String ans=helper(s,0);
		return ans;
        
    }