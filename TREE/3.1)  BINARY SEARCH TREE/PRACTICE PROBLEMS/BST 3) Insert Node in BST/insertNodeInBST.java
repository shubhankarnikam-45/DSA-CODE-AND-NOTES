//que link https://leetcode.com/problems/insert-into-a-binary-search-tree/

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
    public TreeNode insertIntoBST(TreeNode node, int val) {
        
        if(node == null)
        {
            return new TreeNode(val);
        }


        TreeNode root=node;

        while(root!=null)
        {
            if(root.val < val)
            {
                if(root.right != null)
                {
                    root =root.right;
                }
                else
                {
                    root.right = new TreeNode(val);
                    break;
                }
            }
            else if(root.val > val)
            {
                if(root.left != null)
                {
                    root=root.left;
                }
                else
                {
                    root.left = new TreeNode(val);
                    break;
                }
            }
        }

        return node;
    }
}