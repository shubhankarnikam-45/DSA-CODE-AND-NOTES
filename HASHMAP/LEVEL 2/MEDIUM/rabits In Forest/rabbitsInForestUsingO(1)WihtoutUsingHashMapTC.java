//this code is without using hashmap

class Solution {
    public int numRabbits(int[] answers) {
        
        //as mention in quetion constraint
        int c[]=new int[1000];

        //to store the result.
        int res=0;

        for(int i:answers)
        {
            if(c[i]%(i+1)==0)      //that means we can create group of arr[i]+1
            {
                res+=i+1;
            }

            //each time we increase count
            c[i]++;
        }

        //return the result
        return res;
    }
}