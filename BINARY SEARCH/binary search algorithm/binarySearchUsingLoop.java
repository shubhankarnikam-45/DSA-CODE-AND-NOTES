class Solution {
    public int search(int[] nums, int target) {
        
        //low value
        int low=0;

        //high value
        int high=nums.length-1;

        while(low<=high)
        {
            //calculating the mid value
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        //when we not found element then we retur -1;
        return -1;
    }
}