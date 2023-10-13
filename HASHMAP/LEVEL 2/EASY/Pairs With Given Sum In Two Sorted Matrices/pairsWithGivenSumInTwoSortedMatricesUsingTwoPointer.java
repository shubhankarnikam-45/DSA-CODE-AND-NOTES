
//i can't solve this by my own i only learn the aproach.
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        
        //this code is using two pointer aproach.
        
        //for first matrix.
        int c1=0;
        int r1=0;
        
        //for second matrix.
        int c2=n-1;
        int r2=n-1;
        
        //resultant count.
        int count=0;
        
        while(r1<n && r2>=0)
        {
            //value
            int value=mat1[r1][c1]+mat2[r2][c2];
            
            if(value==x)
            {
                //increse count
                count++;
                
                c1++;
                c2--;
            }
            else if(value<x)
            {
                c1++;
            }
            else
            {
                c2--;
            }
            
            
            //if c1 cross the right boundry.
            if(c1==n)
            {
                c1=0;
                r1++;
            }
            
            //if c2 cross the left boundry
            if(c2==-1)
            {
                c2=n-1;
                r2--;
            }
        }
        
        //return answer(count)
         return count;
    }
    
    
   
}