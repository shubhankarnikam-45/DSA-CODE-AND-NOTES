
//using brute force.
class GfG
{
	boolean isBinary(String str)
	{
	  //size of string.
	  int n=str.length();

	  //maintain one flag variable for knowing the result.
	  boolean flag=true;
	  
	  //traversing throught the string 
	  //if str.charAt(i)!=0 || str.charAt(i)!=1
	  //then flag==flase this sign of our string container number other than 0 and 1.
        
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!='0' && str.charAt(i)!='1')
            {
                flag=false;
                break;
            }
        }
        
        //here we check that if flag==true that means our string coining binay number.
        if(flag==true)
        {
            return true;
        }
        else
        {
            return false;
        }
	  
	}
}