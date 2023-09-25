class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        //sorting the two array.
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        //two pointer aproach.
        int i=0;
        int j=0;

        //length of two array.
        int n1=nums1.length;
        int n2=nums2.length;

        //creating arraylist to store the result.
        ArrayList<Integer>al=new ArrayList<>();
        while(i<n1 && j<n2)
        {
            if(nums1[i]==nums2[j])
            {
                al.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }


        //creaint array of size arraylist.
        int res[]=new int[al.size()];

        //now added array list data to the array.
        for(int k=0;k<al.size();k++)
        {
            res[k]=al.get(k);
        }


        //return 
        return res;
    }
}