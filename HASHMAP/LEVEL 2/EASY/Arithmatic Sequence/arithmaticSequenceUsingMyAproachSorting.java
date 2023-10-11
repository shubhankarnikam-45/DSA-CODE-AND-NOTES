class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        //sort aray.
        Arrays.sort(arr);

        //first difference
        int firstDiff=arr[1]-arr[0];

        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]!=firstDiff)
            {
                return false;
            }
        }

        return true;
    }
}