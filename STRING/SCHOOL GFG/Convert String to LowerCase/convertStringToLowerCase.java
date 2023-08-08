
//this quetion i solve for warm up.
//TC: O(n).
//SC: O(n)


class Solution {
    static String toLower(String s) {
        
        //initialize with explty string. to store the final result.
        String result="";
        
        //traversing throught String. if(capital letter) then convert into SMALL
        //LETTER otherwise maintain AS IT IS.
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
            {
                //convert into small letter
                result+=(char)(s.charAt(i)+' ');
            }
            else
            {
                //maintain as it is.
                result+=s.charAt(i);
            }
        }
        
        return result;
    }
}