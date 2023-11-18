/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root.val<p.val && root.val<q.val)
        {
            //goring towards right
            return lowestCommonAncestor(root.right,p,q);
        }
        else if(root.val>p.val && root.val > q.val)
        {
            //going towards left.
            return lowestCommonAncestor(root.left, p, q);
        }
        else 
        {
            //mismatch case.
            return root;
        }
    }
}