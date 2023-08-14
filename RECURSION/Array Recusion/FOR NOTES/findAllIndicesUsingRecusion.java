//tc: O(n)
//sc: O(n)

// this code is to learn the array recursion (pepcoding.)
//here we learn the new concept the returing the ARRAY from BASE CASE.
//first time i am see the we not set the EXPECTATION and FAITH

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {

        
        //base case.
        if(arr.length==idx)
        {
          return new int[fsf];
        }
        
        
        //recusive case.
        if(arr[idx]==x)
        {
          int iarr[]=allIndices(arr,x,idx+1,fsf+1);
          iarr[fsf]=idx;
          return iarr;
        }
        else
        {
          int iarr[]=allIndices(arr,x,idx+1,fsf);
          return iarr;
        }
        
    }