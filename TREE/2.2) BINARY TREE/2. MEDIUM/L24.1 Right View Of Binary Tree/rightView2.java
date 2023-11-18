/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    //recursion
    public void recursion(TreeNode root,int level,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }

        if(ans.size()==level)
        {
            ans.add(root.val);
        }

        recursion(root.right,level+1,ans);
        recursion(root.left,level+1,ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        
        //creating arraylist to return answre.
        List<Integer>al=new ArrayList<>();

        recursion(root,0,al);

        return al;
    }
}