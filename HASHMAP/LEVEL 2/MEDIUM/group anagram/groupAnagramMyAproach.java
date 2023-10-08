//this quetion is totalllay solve my me 
//

class Solution {

   
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //string of array that holds the sorted string.
        String[]sortedString=new String[strs.length];

        //traverse given string.
        for(int i=0;i<strs.length;i++)
        {
            //current string.
            String currString=strs[i];

            //creaing array of character.
            char a[]=currString.toCharArray();

            Arrays.sort(a);

            //againg converted to string.
            currString=new String(a);

            //added to sorted String
            sortedString[i]=currString;
        }

        
        //creating HashMap that stores the 'String' and 'index' appeared
        HashMap<String,ArrayList<Integer>>hmap=new HashMap<>();

        //now we traverse soreted String and storing the index appeared.
        for(int i=0;i<sortedString.length;i++)
        {
            //current String 
            String cs=sortedString[i];

            if(hmap.containsKey(cs))
            {
                ArrayList<Integer>al=hmap.get(cs);
                al.add(i);

                hmap.put(cs,al);
            }
            else
            {
                //not contain
                ArrayList<Integer>al=new ArrayList<>();
                al.add(i);

                hmap.put(cs,al);
            }
        }



        //now we traverse HashMap and find our desired result.
        //before that we create ArrayList of Arraylist.
        List<List<String>>fa=new ArrayList<>();

        for(String str:hmap.keySet())
        {
            ArrayList<Integer>al=hmap.get(str);


            List<String>ans=new ArrayList<>();

            //using for loop find ans
            for(int i=0;i<al.size();i++)
            {
                ans.add(strs[al.get(i)]);
            }

            fa.add(ans);


        }


        //return ans;
        return fa;

        
    }
}
