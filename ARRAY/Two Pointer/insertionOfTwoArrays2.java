class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        
        //getting the size of two array.
        int n1=a.length;
        int n2=b.length;
        
        //first of we sort the array.
        Arrays.sort(a);
        Arrays.sort(b);
        
        //for the returning the array we create the arraylist. in case we return count we 
        //just retur count.
        
        List<Integer>al=new ArrayList<>();
        
        //maintaing two pointer for traversing the two array.
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            //as we found the smaller element compare with array b[] then
            //that means we move ahead for finding 
            if(a[i]<b[j])
            {
                i++;
            }
            //as we found the greater element compare with array b[] then
            //that means we move ahead for finding 
            else if(a[i]>b[j])
            {
                j++;
            }
            else
            {
                //this means we found equal element then add to ArrayList.
                //and increment the count of i and j (i++ and j++)
                al.add(a[i]);
                i++;
                j++;
            }
        }
        
        
        //in case we return in array then create the array of size ArrayList 
        // and add element one by one.
        
        //in this example we just return the count.
        int count=al.size();
        return count;
    }
};
