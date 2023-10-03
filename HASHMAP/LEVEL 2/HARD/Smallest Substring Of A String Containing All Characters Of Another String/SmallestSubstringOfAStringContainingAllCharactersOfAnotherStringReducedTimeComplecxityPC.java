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

// tc: 
// Time Complexity Analysis:

// HashMap Initialization (hmap1 and hmap2): O(ss + fs) = O(s), where ss is the length of the second string t and fs is the length of the first string s.

// Loop to Populate hmap2:

// This loop iterates over the characters of the second string t and inserts them into hmap2 with their frequencies. This takes O(ss) time.
// While Loop:

// The outer while loop runs at most fs times, as it depends on the length of the first string s.
// First Inner While Loop:

// The first inner while loop iterates until either i reaches the end of the first string (fs-1) or potCount reaches matchCount.
// In the worst case, it can iterate through the entire string, so it takes O(fs) time.
// Second Inner While Loop:

// Similar to the first inner while loop, it can also iterate through the entire string. Therefore, it takes O(fs) time.
// Overall, the time complexity of this code is O(s), where s is the length of the first string s. This is because the dominant factor in terms of time complexity is the length of the first string s.


//sc
// HashMap hmap1:

// It stores the frequency of characters from the first string s.
// In the worst case, it can store all unique characters from s, so it can take up to O(s) space.
// HashMap hmap2:

// It stores the frequency of characters from the second string t.
// In the worst case, it can store all unique characters from t, so it can take up to O(t) space.
// Integer Variables (fs, ss, i, j, matchCount, potCount):

// These variables are all of type int and they take constant space.
// String Variable ans:

// It stores the final answer, which is a substring of the first string. In the worst case, it can be as long as the entire string s. Therefore, it can take up to O(s) space.
// Loop Variables (i, j):

// These are integer variables used for looping and they take constant space.
// Overall, the space complexity of the code is O(s + t), where s is the length of the first string s and t is the length of the second string t. This is because the dominant factor in terms of space complexity is the sizes of the two input strings s and t.