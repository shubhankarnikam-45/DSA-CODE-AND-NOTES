//brute force.
//TC: O(n) n is length of string.
//SC: O(n) n is length of string.

class Solution {
    static String revStr(String s) {
        
        //brute force.
        
        //maintain one variable to stroe the result.
        String result="";
        
        //now we traversing through end of for loop to print the reverse string.
        
        for(int i=s.length()-1;i>=0;i--)
        {
            //adding to the result.
            result+=s.charAt(i);
        }
        
        //return the result;
        return result;
    }
}