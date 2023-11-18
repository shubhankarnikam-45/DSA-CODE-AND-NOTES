// Count total Nodes in a COMPLETE Binary Tree

//que link: 
//https://leetcode.com/problems/count-complete-tree-nodes/


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

    public boolean isLeave(TreeNode root)
    {
        return(root.left==null)&&(root.right==null);
    }
    public int countNodes(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        if(isLeave(root))
        {
            return 1;
        }

        //faith.
        int left=countNodes(root.left);
        int right=countNodes(root.right);

        return left+right+1;
    }
}
