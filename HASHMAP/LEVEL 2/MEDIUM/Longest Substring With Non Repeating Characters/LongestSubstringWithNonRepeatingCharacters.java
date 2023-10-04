// Longest Substring With Non Repeating Characters
//this algorithm is super important.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //creaing two pointer i and j for traversing.
        int i=-1;
        int j=-1;

        //creating hashmap for storing frequency.
        HashMap<Character,Integer>hmap=new HashMap<>();

        //creating two boolean variable for break the outer loop.
        boolean f1=false;
        boolean f2=false;

        //this holds the global maximum
        int ans=0;

        while(true)
        {
            f1=false;
            f2=false;
            //aquire and find answer.
            while(i<s.length()-1)
            {
                //makeing f1 true;
                f1=true;
                
                //increase i.
                i++;
                //current character.
                char ch=s.charAt(i);

                //increse the frequnecy of this characte in HashMap.
                hmap.put(ch,hmap.getOrDefault(ch,0)+1);

                if(hmap.get(ch)==2)
                {
                    //this means we found repeat character.
                    //break
                    break;
                }
                else
                {
                    int len=i-j;
                    if(ans<len)
                    {
                        ans=len;
                    }
                }

            }  

            //release.
            while(j<i)
            {
                //makign f2 true.
                f2=true;
                //increse j
                j++;

                //current character.
                char ch=s.charAt(j);

                //increse the frequnecy of this characte in HashMap.
                hmap.put(ch,hmap.get(ch)-1);

                //if frequency is 1 means it is valid hecne we break;.
                if(hmap.get(ch)==1)
                {
                    break;
                }   

            }  

            //if f2 and f1 is false this is sign of done our work we just break from loop.
            if(f1==false && f2 ==false)
            {
                break;
            }
        }

        //return answer
        return ans;
    }
}