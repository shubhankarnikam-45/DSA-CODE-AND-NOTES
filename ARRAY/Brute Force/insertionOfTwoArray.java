//Brute force and Arraylist

class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {

        //size of array 'arr1'
        int n1=arr1.length;

        //size of array 'arr2'.
        int n2=arr2.length;

        //creating ArrayList.
        ArrayList<Integer>al=new ArrayList<>();      //SC: O(N)

        //using for loop traverse in eac element.
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {

                //TC: O(N^2)
                //if we found the same element then we just add to ArrayList.
                if(arr1[i]==arr2[j])
                {
                    al.add(arr1[i]);

                    //after that we make arr[i]=arr[j]=0 because if we not make it zero t 
                    //the some blunder happen because of rechecking of element.(learn by 
                    // DRY RUN)
                    arr1[i]=arr2[j]=-1;
                    break;
                }
            }
        }


        //now we create array of size ArrayList.

        int sizeOfArraylist=al.size();
        int result[]=new int[sizeOfArraylist]; //SC: O(N)

        //add element ArrayList to the Array.
        for(int i=0;i<sizeOfArraylist;i++)
        {
            result[i]=al.get(i);  //TC: O(N)
        }

        //returnign the array.
        return result;



    //SC: O(N)
    //TC: O(N^2)
        
    }
}