
//HashMap and ArrayList
class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        
        //first of all we pass the small size array at first place in `intersect function`
        //then pass big size array this is for future (to reduce the iteration which we see later) 
        if(arr1.length>arr2.length)
        {
            intersect(arr2,arr1);
        }

        //now we creating the Map to store the frequency of element in first array.
        Map<Integer,Integer>m=new HashMap<>();

        //now we store the <element => frquency>
        for(int arr:arr1)
        {
            m.put(arr,m.getOrDefault(arr,0)+1);
        }

        //now we creating the ArrayList to store the count of "common element".
        List<Integer>al=new ArrayList<>();

        //now we interate over the second Array & see the common 
        // element using Map we created earlier.

        for(int arr:arr2)
        {
            int count=m.getOrDefault(arr,0);

            //if count ==0 that means their is not element present hence we 
            //check for the 'count>0'
            if(count>0)
            {
                //due to this condition is true we add element to the ArrayList.
                al.add(arr);

                //decrease the count of element in the map.
                m.put(arr,count-1);
            }
        }

        //now we create Array of size ArrayList to "return"; 
        int result[]=new int[al.size()];

        //putting value in ArrayList to the normal Array. for 'return ' purpose
        for(int i=0;i<al.size();i++)
        {
            result[i]=al.get(i);
        }

        return result;



    }
}