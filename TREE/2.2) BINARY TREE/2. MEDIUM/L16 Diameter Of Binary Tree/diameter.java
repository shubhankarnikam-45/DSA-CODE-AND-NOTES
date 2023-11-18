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

    //global max;
    public int max=0;

    //height function
    public int maxDepth(TreeNode root)
    {
         //base case.
        if(root==null)
        {
            return 0;
        }

        //faith.
        int firstDepth=maxDepth(root.left);
        int secondDepth=maxDepth(root.right);

        //compre.
        max=Math.max(max,firstDepth+secondDepth);

        int finalMax=Math.max(firstDepth,secondDepth)+1;
        return finalMax;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        maxDepth(root);

        return max;

    }
}