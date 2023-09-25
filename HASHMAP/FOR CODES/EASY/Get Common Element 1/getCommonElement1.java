class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        //ArrayList to store the common element.
        ArrayList<Integer>al=new ArrayList<>();

        //creating HashMap to store the 'key:value' pair
        HashMap<Integer,Integer>hm=new HashMap<>();

        //adding key value pair by traversing the 'num1' array.
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i]))
            {
                int oldKey=hm.get(nums1[i]);
                hm.put(nums1[i],oldKey+1);
            }
            else
            {
                //means this key is not present in the hm.
                //then we add and make frequency '1'
                hm.put(nums1[i],1);
            }
        }


        //traversing second arrray nums2.
        // if we found the key in hashmap then added to the arraylist.
        for(int i=0;i<nums2.length;i++)
        {
            if(hm.containsKey(nums2[i]))
            {
                al.add(nums2[i]);
                hm.remove(nums2[i]);
            }
        }


        //creating array of size arraylist
        int res[]=new int[al.size()];

        //adding element arraylist to the array
        for(int i=0;i<al.size();i++)
        {
            res[i]=al.get(i);
        }


        //return the result
        return res;


    }
}

