// rabits In Forest
//i solve partially

class Solution {
    public int numRabbits(int[] arr) {
        
        //created hashmap that stores the frequency of each element in array.
        HashMap<Integer,Integer>hmap=new HashMap<>();

        //traverse
        for(int i=0;i<arr.length;i++)
        {
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }

        //final answer.
        int ans=0;

        //now traverse hashmap
        for(Integer key:hmap.keySet())
        {
            //this is no of group is formed
            int group=key+1;

            //no of repoortee
            int reportees=hmap.get(key);

            //no of rabbits in groupt
            int noOfGroup=(int)Math.ceil(reportees*1.0/group*1.0);

            //total number of rabit.
            int totalNoOfRabit=noOfGroup*group;

            //adding in answer.
            ans+=totalNoOfRabit;
        }


        //return ans
        return ans;
    }
}