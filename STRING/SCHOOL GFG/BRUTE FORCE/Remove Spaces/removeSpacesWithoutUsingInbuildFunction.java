//this code is without using INBUILD FUNCTIONS.

//TC: O(N)
//SC: O(m) --m==no.of characters in string.

 //length of string.
        int n=s.length();
        
        // this variable to hold the result.
        String result="";
        
        //traversing throught the string.
        for(int i=0;i<n;i++)
        {
            
            //if(s.charAt(i)==' ' that means we doing something)
            if(s.charAt(i)!=' ')
            {
                result+=s.charAt(i);
            }
        }
        
        return result;