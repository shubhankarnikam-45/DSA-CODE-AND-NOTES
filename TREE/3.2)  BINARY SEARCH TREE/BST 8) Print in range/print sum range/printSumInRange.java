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
    public int rangeSumBST(TreeNode root, int low, int high) {
          
        
        
        if(root==null)
        return 0;
        
        if(root.val < low && root.val < high)
        {
            int sum=rangeSumBST(root.right,low,high);
            return sum;
            
            
        }
        else if(root.val> low && root.val > high)
        {
            int sum=rangeSumBST(root.left,low,high);
            return sum;
        }
        else
        {
            int sum1=rangeSumBST(root.left,low,high);
            
            sum1+=root.val;
            
            int sum2=rangeSumBST(root.right,low,high);
            
            return sum1+sum2;
        }

    }
}