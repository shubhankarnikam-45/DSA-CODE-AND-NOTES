
//tc: O(n)
//sc: O(n) 
//where n is size of array.

//this is code of PEPCODING i do it by own for learning the concept.

public static void displayArrReverse(int[] arr, int idx) {
      
      //base case.
      if(idx==arr.length)
      {
        return;
      }
      
      //recusive case.s
      displayArrReverse(arr,idx+1);
      System.out.println(arr[idx]);

    }