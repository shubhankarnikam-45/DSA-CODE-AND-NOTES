//que link
//https://leetcode.com/problems/combinations/

//this question related to the combination.
//important solving the recursion problems.

class Solution {

    public void combineHelper(int n, int k, int currLevel, List<List<Integer>> ans, List<Integer> alist)
    {
        if(n<currLevel){

        if(alist.size() == k)
        {
            //added to the resultant arraylist.
            ans.add(new ArrayList<>(alist));
            
        }
        return;
        }

        //we use the pick or not pick approach.
        combineHelper(n, k, currLevel+1,ans,  alist);
        alist.add(currLevel);
        combineHelper(n, k, currLevel+1,ans, alist);
        alist.remove(alist.size()-1);
    }
    public List<List<Integer>> combine(int n, int k) {
        
        //created arraylist to return.
        List<List<Integer>> ans = new ArrayList<>();

        //current level.
        int currLevel = 1;
        combineHelper(n, k, currLevel, ans, new ArrayList<Integer>());

        return ans;
    }
}