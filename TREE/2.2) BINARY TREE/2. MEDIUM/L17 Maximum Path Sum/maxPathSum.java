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
    //global max
    int max=Integer.MIN_VALUE;

    public int maxSum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

         //left max(lm)
        int lm=Math.max(0,maxSum(root.left));
        //right max(rm)
        int rm=Math.max(0,maxSum(root.right));

        max=Math.max(lm+rm+root.val,max);

        return Math.max(lm,rm)+root.val;
    }


    public int maxPathSum(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }

        maxSum(root);

        return max;

       
    }
}