//tc: O(n)
//sc: O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //creaing arrya of size 256
        int map1[]=new int[256];
        int map2[]=new int[256];

        //now traverse string
        for(int i=0;i<s.length();i++)
        {
            //currnet charaters
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            //if frequency is mismatch then we return false.
            if(map1[ch1]!=map2[ch2])
            {
                return false;
            }

            map1[ch1]=i+1;
            map2[ch2]=i+1;
        }


        //return false
        return true;
    }
}