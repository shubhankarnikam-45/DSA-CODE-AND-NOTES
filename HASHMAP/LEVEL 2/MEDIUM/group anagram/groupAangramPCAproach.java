
//here we learn the Hashmap can have key as HashMap

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //length of string.
        int len=strs.length;


        //crating hashmap in which key as a hashmap and value as string.
        HashMap<HashMap<Character,Integer>,ArrayList<String>>bmap=new HashMap<>();

        //goint to each string in array of string and creating hashmap for that
        for(String str:strs)
        {
            //creating hashmap.
            HashMap<Character,Integer>hmap= new HashMap<>();

            for(int i=0;i<str.length();i++)
            {
                //current character.
                char ch=str.charAt(i);

                //adding freq of character.
                hmap.put(ch,hmap.getOrDefault(ch,0)+1);

            }

            if(bmap.containsKey(hmap))
            {
                //contains.
                
                //first give the arraylist.
                ArrayList<String>al=bmap.get(hmap);
                al.add(str);
            }  
            else
            {
                //not contains.
                ArrayList<String>al=new ArrayList<>();
                al.add(str);

                //added to big map.
                bmap.put(hmap,al);
            }
            
        }

        //now going to values of big hashmap. and added to the arrayList.
        //for that creating the Arraylist of Arraylist.
        List<List<String>>result=new ArrayList<>();

        for(ArrayList<String>str:bmap.values())
        {
            result.add(str);
        }


        return result;

    }
}