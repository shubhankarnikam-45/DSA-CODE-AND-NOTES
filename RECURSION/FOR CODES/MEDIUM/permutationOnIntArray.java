
//this quetion is variation of 'permutation of string problem'
//this is not optimized soulution 
//refer the stiver yt viedo.
//also see the optimized sollution.



class Solution {


    //helper function.
    public void helper(int nums[],List<List<Integer>> ans,List<Integer>asf,boolean arr[])
    {

        //base case.
        if(asf.size()==nums.length)
        {
            //this means we at base case.
            ans.add(new ArrayList<>(asf));
            return;

        }


        for(int i=0;i<nums.length;i++)
        {
            //this means currnet index is false.
            if(!arr[i])
            {
                //making in mapped array true.
                arr[i]=true;

                //and add this element to the data structure.
                asf.add(nums[i]);

                //now we calling to the recursive function.
                helper(nums,ans,asf,arr);

                asf.remove(asf.size()-1);
                

                //now when we going back to the recursive call then we remove the true
                arr[i]=false;

            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
       

       //this holds the our final answer.
       List<List<Integer>> ans=new ArrayList<>();

       //this is to store the map array(boolean)
       boolean arr[]=new boolean[nums.length];

       //this holds the answer so far.
       List<Integer>asf=new ArrayList<>();

        //recursive call start here.
       helper(nums,ans,asf,arr);

       return ans;
        
    }
}