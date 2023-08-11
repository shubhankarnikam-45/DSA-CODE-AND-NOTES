

//tc: o(n)
//sc: o(n) ...n is size of array.

//this code is learn the concept.


public static int maxOfArray(int[] arr, int idx){
        
        //base case.
        if(idx==arr.length-1)        //1
         return arr[idx]; 
         
         
         int maxIndexInSmallerArray=maxOfArray(arr,idx+1);     //2
         
         //here we check the current index elelment is grater that previous
         //value return by recursion or not.
         if(maxIndexInSmallerArray>arr[idx])      //3
         {
           return maxIndexInSmallerArray;
         }
         else
         {
           return arr[idx];
         }
    }