class Solution {
    public boolean canReorderDoubled(int[] arr) {
        
        //crating hashmap to do operation.
        HashMap<Integer,Integer>hmap=new HashMap<>();
        
        //stroing the frequency of each element in hashmap.
        for(int i=0;i<arr.length;i++)
        {
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }

   

        Arrays.sort(arr);     
           
        //now we again traverse to find the desired result.
        for(int i=0;i<arr.length;i++)
        {
            if(hmap.containsKey(arr[i]) && hmap.containsKey(arr[i]*2) )
            {
                //deal with arr[i] element freq.
                int freq=hmap.getOrDefault(arr[i],-1);

                if(freq==1)
                {
                    hmap.remove(arr[i]);
                }
                else
                {
                    hmap.put(arr[i],freq-1);
                }

                //deal with arr[i]*2 element freq.
                 freq=hmap.getOrDefault(arr[i]*2,-1);

                if(freq==1)
                {
                    hmap.remove(arr[i]*2);
                }
                else
                {
                    hmap.put(arr[i]*2,freq-1);
                }

            }
        }


        //if hashmap is empty means we found our answer.(true ) else (false)
        if(hmap.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}