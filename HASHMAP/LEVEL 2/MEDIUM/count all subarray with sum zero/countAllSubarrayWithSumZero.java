
//this is present on gfg platform

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //this is value of i that we increse each time.
        int i=-1;
        
        //initially sum is zero
        int sum=0;
        
        //crating hashmap to do operation.
        HashMap<Integer,Integer>hmap=new HashMap<>();
        
        //for future zero we put in hashmap.(0,1); assume zeor occure 1 time
        hmap.put(0,1);
        
        //creating count variable that holds the count.
        long count=0;
        //traverse
        while(i<arr.length-1)
        {
            i++;
            sum+=arr[i];
            
            if(hmap.containsKey(sum)==true)
            {
                //this means sum is prsent
                count+=hmap.get(sum);
                
                //and increse the frequency of this sum in hmap
                hmap.put(sum,hmap.get(sum)+1);
            }
            else
            {
                //this means sum is not prsent
                hmap.put(sum,1);
            }
        }
        
        
        
        //return the result.
        return count;
    }
}