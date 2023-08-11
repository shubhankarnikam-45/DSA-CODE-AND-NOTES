
//tc: O(m) ...m is no of call to fnd the 'x' element.
//sc: O(m) 

//this quetion is to see how array recursion work



 public static int firstIndex(int[] arr, int idx, int x){
        
        //base case.
        //this is the sign of we can't found any element.
        if(idx==arr.length)
        return -1;
        
        if(arr[idx]==x)           //1
        {
          return idx;
        }
        else
        {
          int firstIndexInSmallerArray=firstIndex(arr,idx+1,x);      //2
          return firstIndexInSmallerArray;
        }
    }