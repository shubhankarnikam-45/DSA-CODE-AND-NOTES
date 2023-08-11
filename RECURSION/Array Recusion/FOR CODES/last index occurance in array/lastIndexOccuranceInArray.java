
//tc: O(n)
//sc: O(n)

//this quetion to learn the conpce of array in recursion

 public static int lastIndex(int[] arr, int idx, int x){
        
        //base case.
        if(idx==arr.length)           //1
          return -1;
          
        int fiisa=lastIndex(arr,idx+1,x);  //2
        
        if(fiisa==-1)              //3
        {
          if(arr[idx]==x)              //3.1
          {
            return idx;
          }
          else                        //3.2
          {
            return -1;
          }
        }
        else                    
        {
          return fiisa;                         //4
        }
        
    }