
//que link
//https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/


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
    public int max=0;

    public TreeNode bstToGst(TreeNode root) {
        

        if(root==null)
        return null;
        //going to extreme right.
        TreeNode l=bstToGst(root.right);
        max+=root.val;
        root.val=max;
        TreeNode r=bstToGst(root.left);

        return root;
    }
}