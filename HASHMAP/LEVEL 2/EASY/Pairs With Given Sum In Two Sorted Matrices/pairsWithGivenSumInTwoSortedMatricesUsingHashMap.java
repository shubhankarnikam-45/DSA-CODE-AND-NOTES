
//this code is from gfg (in gfg compiler code is not work for the duplicate values.)

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        
        //creating hashmap that stores the frequency of each each element in matrix 1
        HashMap<Integer,Integer>hmap=new HashMap<>();
        
        //for count hold
        int count=0;
        
        //adding freq in hashmap.
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[0].length;j++)
            {
               hmap.put(mat1[i][j],hmap.getOrDefault(mat1[i][j],0)+1);
            }
        }
        
        
        //now find process starts
        

        for(int i=0;i<mat2.length;i++)
        {
            for(int j=0;j<mat2[0].length;j++)
            {
                //matrix value
                int matValue=mat2[i][j];
                
                //value to be found in map.
                int reqValue=x-matValue;
                
                //if this value contains in map then added count.
                if(hmap.containsKey(reqValue))
                {
                    count+=hmap.get(reqValue);
                }
            }
        }
        
        
        //return the count
        return count;
        
        
        
        
    }
}