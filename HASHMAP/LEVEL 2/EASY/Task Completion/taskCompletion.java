
//this quetion solve by me

class Solution {
    Tasks findTasks(int[] arr, int m, int n) {
        
        
        //making one gudge boolena variable.
        boolean gudge=true;
        
        //creaing HashSet
        HashSet<Integer>hset=new HashSet<>();
        
        //added element in hashset.
        for(int i=0;i<arr.length;i++)
        {
            hset.add(arr[i]);
        }
        
        //creaing two arraylist to store the answer.
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        
        //we run loop till n
        for(int i=1;i<=n;i++)
        {
            
            if(gudge==true && !hset.contains(i))
            {
                al1.add(i);
                gudge=false;
            }
            else if(gudge==false && !hset.contains(i))
            {
                al2.add(i);
                gudge=true;
            }
            
        }
        
        //craing task class for return
        Tasks t=new Tasks();
         t.tanya=al1;
         t.manya=al2;
         return t;
        
        //print data.
        //for tanya.
        // for(int i=0;i<al1.size();i++)
        // {
        //     System.out.print(al1.get(i)+" ");
        // }
        
        // //for manya.
        // for(int i=0;i<al2.size();i++)
        // {
        //     System.out.print(al2.get(i)+" ");
        // }
        
        
    }
}
