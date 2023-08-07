
//using split() and join().


//User function Template for Java
class Solution
{
   
    String modify(String s)
    {
        //third method.
        
        String str[]=s.split(" ");
        
        String result=String.join("",str);
        return result;
    }
}