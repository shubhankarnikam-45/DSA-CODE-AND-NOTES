//this is last optimal code apraoch ~

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        //creating HashSet to store the uniqueu values.
        HashSet<Integer>hset=new HashSet<>();

        //traverse to find combination.
        for(int i=1;i<bound;i=i*x)  
        {
            for(int j=1;i+j<=bound;j=j*y)
            {
                int sum=(i+j);

                //adding to set.
                hset.add(sum);

                //for avoiding when  y==1;
                //for avoding infinite loop.
                if(y==1)
                {
                    break;
                }
            }

            //for avoiding when  y==1;
            //for avoding infinite loop.
            if(x==1)
            {
                break;
            }
        }


        //creating arraylist to return.
        List<Integer>al=new ArrayList<>(hset);

        return al;
    }
}