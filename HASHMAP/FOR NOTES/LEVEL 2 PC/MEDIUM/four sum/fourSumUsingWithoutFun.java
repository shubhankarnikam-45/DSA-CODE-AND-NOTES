//this code is without funnciton.

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        
        //sort array.
        Arrays.sort(arr);

        //this code is not general code 

        //crating Arraylist of Arraylist ot return answer.
        List<List<Integer>>ans=new ArrayList<>();

        //first loop for the first pair
        for(int i=0;i<arr.length;i++)
        {
            //for avoiding duplicate cases.
                if(i!=0 && arr[i]==arr[i-1])
                {
                    continue;
                }

            for(int j=i+1; j<arr.length; j++)
            {
                //for avoiding duplicate cases.
                if(j!=i+1 && arr[j]==arr[j-1])
                {
                    continue;
                }
                //we uses the two pointer aproach.

                //start index.
                int si=j+1;

                //end index.
                int ei=arr.length-1;

                while(si<ei)
                {

                   


                    int sum=arr[i]+arr[j]+arr[si]+arr[ei];

                    if(sum>target)
                    {
                        ei--;
                    }
                    else if(sum<target)
                    {
                        si++;
                    }
                    else if(sum==target)
                    {
                        //if we found the required pari
                        ans.add(new ArrayList(Arrays.asList(arr[i],arr[j],arr[si],arr[ei])));
                        ei--;
                        si++;

                           //for avoiding the duplicares.
                            while(si<ei && arr[si]==arr[si-1])
                            {
                                si++;
                            }

                            
                            while(si<ei && arr[ei]==arr[ei+1]);
                            {
                                ei--;
                            }


                    }

                  


                }


            }
        }


        //return answer.
        return ans;

    }
}