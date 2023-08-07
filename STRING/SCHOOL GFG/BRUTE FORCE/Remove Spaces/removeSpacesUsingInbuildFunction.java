 //using inbuild functions.

 
 // method 2: 
        //using split method creating array of string which words in string.
        String str[]=s.split(" ");  //TC: O(N)  //SC: O(m)
        
        //to hold result.
        String result="";
        
        //traversing over the array of string.
        for(int i=0;i<str.length;i++)  //TC: O(N)  
        {
                result+=str[i];        //SC: O(N)
        }
        
        //return result;
        return result;


        // total TC: O(N)
        // total SC: (N+m)