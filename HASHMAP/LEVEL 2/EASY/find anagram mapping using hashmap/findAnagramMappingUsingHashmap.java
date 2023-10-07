public class Solution {
    /**
     * @param a: lists A
     * @param b: lists B
     * @return: the index mapping

     
     */

     public static class Pair
     {
         int idx=0;
         ArrayList<Integer>al=new ArrayList<>();
     }
    public int[] anagramMappings(int[] a, int[] b) {
        
        //creating HashMap for storing the element and index's
       HashMap<Integer,Pair>hmap=new HashMap<>();

        //storing the element and index of second array.
        for(int i=0;i<b.length;i++)
        {
            if(hmap.containsKey(b[i]))
            {
                Pair p=hmap.get(b[i]);
                p.al.add(i);

            }
            else
            {
                Pair p=new Pair();
                p.al.add(i);
                hmap.put(b[i],p);
            }
        }

        //creating array that return answer.
        int ans[]=new int[a.length];

        //now we travese first array and find out answer.
        for(int i=0;i<a.length;i++)
        {
            //desired element index class
            Pair p=hmap.get(a[i]);

            ans[i]=p.al.get(p.idx);
            p.idx++;

        }


        //return ans;
        return ans;

    }
}

     

  
       
       