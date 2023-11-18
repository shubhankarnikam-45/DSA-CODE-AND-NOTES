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
    public int maxDepth(TreeNode root) {

        //base case.
        if(root==null)
        {
            return 0;
        }

        //faith.
        int firstDepth=maxDepth(root.left);
        int secondDepth=maxDepth(root.right);

        int finalMax=Math.max(firstDepth,secondDepth)+1;
        return finalMax;
    }
}