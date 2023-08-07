
//TC: O(N)
//SC: O(1)
class GFG {
    String longest(String arr[], int n) {
        
        maintaining one varaible `max` to find the maximum string length;
        int max=0;
        
        // this `index` varible to store the index of desierd element.
        int index=-1;
        
        //traversing throught the for loop for finding the maximum length string.
        for(int i=0;i<n;i++)
        {
            int len=arr[i].length();
            if(len>max)
            {
                //this max variable now hold the maximum length string.
                max=len;
                
                //this `index` variable hold the index of requierd element.
                index=i;
            }
        }
        
        //return the result.
        // if(index!=-1)
        return arr[index];
    }

}