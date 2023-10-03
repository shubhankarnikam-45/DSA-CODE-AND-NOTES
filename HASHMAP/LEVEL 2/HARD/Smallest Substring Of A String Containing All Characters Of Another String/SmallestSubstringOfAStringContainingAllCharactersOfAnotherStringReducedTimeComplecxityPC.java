// SmallestSubstringOfAStringContainingAllCharactersOfAnotherString

class Solution {
    public String minWindow(String s, String t) {

        //length of first string.
        int fs=s.length();

        //length of second string
        int ss=t.length();

       
        //creaing hasmap for first string that stores the 'chacter and it frequency'
        HashMap<Character,Integer>hmap1=new HashMap<>();
        
        //creaing hasmap for second string that stores the 'chacter and it frequency'
        HashMap<Character,Integer>hmap2=new HashMap<>();

        //storing the frequnecy using loop.
        for(int i=0;i<ss;i++)
        {
            char currChar=t.charAt(i);

            hmap2.put(currChar,hmap2.getOrDefault(currChar,0)+1);
        }

        //creaing two pointer initially they are -1.
        int i=-1;
        int j=-1;


        //this stores the final answer.
        String ans="";

        //match count length of second string.
        int matchCount=ss;

        //this is for potential count (this use when we traverse.)
        int potCount=0;

        while(true)
        {
            //this to break outer while loop.
            boolean f1=false;
            boolean f2=false;


            while(i<fs -1 && potCount<matchCount)
            {
                //increase the i.
                i++;

                //current character.
                char currChar=s.charAt(i);

                //incresing the frequency of current character in hashmap 1
                hmap1.put(currChar,hmap1.getOrDefault(currChar,0)+1);

                //if this count is hmap1 is less than or equal to hmap2 means we got the 
                //some characters.
                if(hmap1.getOrDefault(currChar,0)<=hmap2.getOrDefault(currChar,0))
                {
                    potCount++;
                } 

                f1=true;   
            }


            //now we find the potential answer and release.
            while(j<i && potCount==matchCount)
            {
                //this current string we get.
                String potAns=s.substring(j+1,i+1);

                if(ans.length()==0 || ans.length()>potAns.length())
                {
                    ans=potAns;
                }

                //increase j.
                j++;

                //current character.
                char currChar=s.charAt(j);

                //decrese the frequency in hmap1.
                if(hmap1.get(currChar)==1)
                {
                    hmap1.remove(currChar);
                }
                else
                {
                    hmap1.put(currChar,hmap1.get(currChar)-1);
                }

                //if frequency in currChar in hmap1 is mismatch in frequecy of currChar in hmap2 then we decrese the 'potCount'

                if(hmap1.getOrDefault(currChar,0)<hmap2.getOrDefault(currChar,0))
                {
                    potCount--;
                }

                f2=true;
        
            }


            if(f1==false && f2==false)
            {
                break;
            }
        }



        //return the answer.
        return ans;


    }
}