//this i code using PC.

class Solution {
    public boolean canPair(int[] nums, int k) {
        
        //first find frequency of all remainder.
        HashMap<Integer,Integer>freqHMap=new HashMap<>();
        
        //length of array
        // int n=nums.length;
        
        //by traversing the array finding the frequnecy.
        for(int n:nums)
        {
            //find the remainder of current element.
            int rem=n%k;
            
            //getting old frequnecy if not then we got the '0'
            int oldFrequency=freqHMap.getOrDefault(rem,0);
            
            //adding count of frequency one by one    
            freqHMap.put(rem,oldFrequency+1);
        }
        
        
        //now treversing the array again and find the result.
        for(int i:nums)
        {
            //gettig the reaminder of current array element.
            int rem=i%k;
            
            if(rem==0)
            {
                //here we check the count is 'even'
                int countOfFrequency=freqHMap.get(rem);
                
                //here we check that count is zero or not.
                if(countOfFrequency%2==1)
                {
                    return false;
                }
            }
            else if(2*rem==k) //here must think why not k/2
            {
                //here we check the count is 'even'
                int countOfFrequency=freqHMap.get(rem);
                
                //here we check that count is zero or not.
                if(countOfFrequency%2==1)
                {
                    return false;
                }
            }
            else
            {
                //here we got the frquecy of n (x)
                int countOfFrequency=freqHMap.get(rem);
                
                ////here we got the frquecy of n (k-x)
                int otherFrequency=freqHMap.getOrDefault(k-rem,0);
                
                //here we check that count is equla or not.
                //freq(x)==freq(k-x)
                //this false then return 'false'
                if(countOfFrequency!=otherFrequency)
                {
                    return false;
                }               
            }
            
            
        }
        
        
            //here we reach that means all is fine and we just return the 'true'
            return true;
    }
}