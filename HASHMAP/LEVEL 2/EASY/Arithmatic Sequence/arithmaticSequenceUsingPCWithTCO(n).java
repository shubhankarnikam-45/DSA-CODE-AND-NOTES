
class Solution
{
    boolean checkIsAP(int arr[] ,int n)
    {
        //for onely one element in array
        if(n==1)
        return true;
        
        //first we find the min eleement.
        int min=Integer.MAX_VALUE; 
        
        //second we find the min eleement.
        int max=Integer.MIN_VALUE; 
        
        //creaint set
        HashSet<Integer>set=new HashSet<>();
        
        //travese to find the 'min' and 'max' value and each time add to set.
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
            set.add(arr[i]);
        }
        
        //using formula findind the answer.
        int d=(max-min)/(n-1);
        
        //now againg traverse array for finding the answer.
        for(int i=0;i<n;i++)
        {
            //ith element.
            int ai=min+i*d;
            
            //if this ith eleement is not contains in the set then return false
            if(!set.contains(ai))
            {
                return false;
            }
        }
        
        return true;
    }
    
    
}