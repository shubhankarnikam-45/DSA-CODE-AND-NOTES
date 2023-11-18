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
    public int maxDepth(TreeNode root)
    {
         //base case.
        if(root==null)
        {
            return 0;
        }

        //faith.
        int firstDepth=maxDepth(root.left);

        //edge case 
        if(firstDepth==-1)
        {
            return -1;
        }
        int secondDepth=maxDepth(root.right);

        //edge case 
        if(secondDepth==-1)
        {
            return -1;
        }

        //imp
        if(Math.abs(firstDepth-secondDepth)>1)
        {
            return -1;
        }



        int finalMax=Math.max(firstDepth,secondDepth)+1;
        return finalMax;
    }
    public boolean isBalanced(TreeNode root) {
        
        if(maxDepth(root)==-1)
        {
            return false;
        }
        return true;
    }
}