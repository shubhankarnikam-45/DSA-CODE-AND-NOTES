

//TC: O(N)
//SC: O(1)
class GFG {
    String longest(String arr[], int n) {
        
      
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].length()>arr[max].length())
            {
                max=i;
            }
        }
        
        return arr[max];
        
        
    }
}