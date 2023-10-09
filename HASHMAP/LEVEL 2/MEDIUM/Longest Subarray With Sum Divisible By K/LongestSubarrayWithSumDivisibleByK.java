
//here important thing when remainde is zero.

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        
        //creating hashmap that stores the key as remainder and value as the index.
        Map<Integer,Integer>hmap=new HashMap<>();
        
        //to store the prefixSum
        int prefixSum=0;
        
        //to store the final answer.
        int ans=0;
        
        //to store the remainder.
        int rem=0;
        
        //first time in hashmap
        hmap.put(rem,-1);
        
        //traverse
        for(int i=0;i<n;i++)
        {
            //each time we find the prefix sum.
            prefixSum+=a[i];
            
            //finding remainder.
            rem=prefixSum%k;
            
            //if rem is negative we make positive by adding k.
            if(rem<0)
            {
                rem=rem+k;
            }
            
            if(hmap.containsKey(rem))
            {
                int idx=hmap.get(rem);
                int len=i-idx;
                if(len>ans)
                {
                    ans=len;
                }
            }
            else
            {
                //we put remaider and index
                hmap.put(rem,i);
            }
        }
        return ans;
       
    }
 
}