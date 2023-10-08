
//tc: O(n)
//sc: O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //creating two hashmap
        HashMap<Character,Character>hmap1=new HashMap<>();
        HashMap<Character,Boolean>hmap2=new HashMap<>();

        //now traverse string.
        for(int i=0;i<s.length();i++)
        {
            //we required the character of both string.
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(hmap1.containsKey(ch1))
            {
                //contains
                //then value in hmap1 is must match.
                if(hmap1.get(ch1)!=ch2)
                {
                    return false;
                }
            }
            else
            {
                //not contains
                // first check this mapping wiht value is valid or not.
                if(hmap2.containsKey(ch2))
                {
                    return false;
                }
                else
                {
                    hmap1.put(ch1,ch2);
                    hmap2.put(ch2,true);
                }
            }
        }

        //return true;
        return true;
    }
}