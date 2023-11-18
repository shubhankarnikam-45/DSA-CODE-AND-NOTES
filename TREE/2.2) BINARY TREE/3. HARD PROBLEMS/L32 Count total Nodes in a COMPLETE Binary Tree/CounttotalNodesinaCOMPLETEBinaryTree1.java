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
    public int countNodes(TreeNode root) {
            
        if(root==null)
        {
            return 0;
        }

        //left height
        int leftHeight=findLeftHeight(root);
        int rightHeight=findRightHeight(root);

        if(leftHeight==rightHeight)
        {
            return (int)Math.pow(2,leftHeight)-1;
        }

        return 1+countNodes(root.left)+countNodes(root.right);
    }

    //finding the left height.
    public int findLeftHeight(TreeNode root)
    {
        int count=0;

        while(root!=null)
        {
            count++;
            root=root.left;
        }

        return count;
    }

    //finding the right height.
    public int findRightHeight(TreeNode root)
    {
        int count=0;

        while(root!=null)
        {
            count++;
            root=root.right;
        }

        return count;
    }
}