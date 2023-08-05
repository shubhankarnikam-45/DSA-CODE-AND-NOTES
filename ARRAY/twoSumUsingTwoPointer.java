//here we use the GREEDY APPROACH.
 boolean hasArrayTwoCandidates(int arr[], int n, int target) {
        //first of all make array sorted. to apply greedy approach.
         Arrays.sort(arr);
         // make 'left=0'
        int left=0;
        //make 'right=n-1'
        int right=n-1;
        
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {  
                return true; 
            }
            else if(sum<target)
            {
                left++;
            }
            else        //here (sum>target)
            {
                right--;
            }
        }
        
        return false;
    }

//must see the notes.       