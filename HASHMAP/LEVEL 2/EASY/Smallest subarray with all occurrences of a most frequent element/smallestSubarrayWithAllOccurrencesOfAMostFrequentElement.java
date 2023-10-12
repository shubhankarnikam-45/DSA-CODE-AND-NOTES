
class Solution{
    
  
    ArrayList<Integer> smallestSubsegment(int a[], int n)
    {
        
        //creating hashmap to store the a[i] element and it's frequency.
        HashMap<Integer,Integer>hmap=new HashMap<>();
        
        //creating one more hashmap to storing the startng point.
        HashMap<Integer,Integer>smap=new HashMap<>();
        
        
        //required variables.
        int startIndex=-1;
        int endIndex=-1;
        int highFreq=0;
        int globalMaxLen=endIndex-startIndex+1;
        
        //traverse
        for(int i=0;i<a.length;i++)
        {
            //incrse freq and starting point
            
            //current element
            int ce=a[i];
            
            if(hmap.containsKey(ce))
            {
                hmap.put(a[i],hmap.get(ce)+1);
            }
            else
            {
                //not contains.
                hmap.put(ce,1);
                smap.put(ce,i);
            }
            
            
            if(hmap.get(ce)>highFreq)
            {
                startIndex=smap.get(ce);
                endIndex=i;
                highFreq=hmap.get(ce);
                globalMaxLen=endIndex-startIndex+1;
            }
            else if(hmap.get(ce)==highFreq)
            {
                int len=i-smap.get(ce)+1;
                
                if(len<globalMaxLen)
                {
                    startIndex=smap.get(ce);
                    endIndex=i;
                    highFreq=hmap.get(ce);
                    globalMaxLen=endIndex-startIndex+1;
                }
            }
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=startIndex;i<=endIndex;i++)
        {
            ans.add(a[i]);
        }
        
        return ans;
        
    }
  
    
}