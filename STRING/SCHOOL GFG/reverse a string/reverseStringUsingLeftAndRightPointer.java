
class Solution {
    static String revStr(String s) {
        
        //brute force.
        
        //maintain one variable to stroe the result.
        // String result="";
        
        // //now we traversing through end of for loop to print the reverse string.
        
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     //adding to the result.
        //     result+=s.charAt(i);
        // }
        
        // //return the result;
        // return result;
        
        // StringBuffer sb=new StringBuffer(s);
        
        // sb.reverse();
        
        // String reverse=sb.toString();
        
        // return reverse;
        
        //creating the one char Array to store the array of characters
        char charArray[]=s.toCharArray();   //TC: O(n)  //SC: O(n) 
        
        //maintaiing the two pointer left and right.
        int left=0; // point to star to the array of characters.
        int right=charArray.length-1; //point to end of char array.
        
        while(left<right)   //TC: O(n/2)==> O(n)
        {
            //swaping LEFT and RIGHT
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            
            
            left++;
            right--;
        }
        
        
        //now we convert this 'CHARARRY' to 'STRING';
        
        String reversed=new String(charArray);      //TC: O(n)  //SC: O(n)  
        return reversed;
        
        
        //TC: O(n)
        //SC: O(n)
    }
}