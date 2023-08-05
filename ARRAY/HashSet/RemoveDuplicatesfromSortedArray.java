class Solution {
    public int removeDuplicates(int[] arr) {
        //using HashSet adding value to the HashSet(this not contains the duplicate values.)
        HashSet<Integer>hs=new HashSet<>();

        //adding array element to the HashSet.
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }

        //now getting the size of HashSet to RETURN output.
        int result=hs.size();

        //now we adding sequencially to the array. as mentioned in the question.
        //this j variable used to maintain sequence.
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(hs.contains(arr[i]))
            {
                arr[j++]=arr[i];
                hs.remove(arr[i]);
            }
        }

        return result;

    }
}