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
    public boolean preorder(TreeNode p,TreeNode q)
    {

        if(p==null && q==null)
        {
            return true;
        }



        if(p!=null && q==null || p==null && q!=null)
        {
            return false;
        }

        if(p!=null && q!=null)
        {
            if(p.val!=q.val)
            {
                return false;
            }
        }





        boolean flag1=preorder(p.left,q.left);
        if(flag1==false)
        {
            return false;
        }

        boolean flag2=preorder(p.right,q.right);
        if(flag2==false)
        {
            return false;
        }

        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==q)
        {
            return true;
        }

        
        if(p==null || q==null)
        {
            return false;
        }


        if(p==null && q==null)
        {
            return true;
        }
        
        return preorder(p,q);
    }
}