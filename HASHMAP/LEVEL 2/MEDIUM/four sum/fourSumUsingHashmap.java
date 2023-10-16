class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        //creating hashmap to strore the sum of element in array first and second.
        HashMap<Integer,Integer>hmap=new HashMap<>();

        //for store the final answer.
        int count=0;

        //traverse first two array.
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int sum=nums1[i]+nums2[j];
                hmap.put(sum,hmap.getOrDefault(sum,0)+1);
            }
        }

        //now traverse on third and fourth array.
        for(int i=0;i<nums3.length;i++)
        {
            for(int j=0;j<nums4.length;j++)
            {
                int sum=nums3[i]+nums4[j];
                
                //adding to final answer.
                count+=hmap.getOrDefault(0-(sum),0);
            }
        }


        //return answer.
        return count;
    }
}