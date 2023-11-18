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

    public class BSTIterator
    {
        //creating stack.
        Stack<TreeNode> st=new Stack<>();
        //revese pointer .
        boolean reverse =true;

        BSTIterator(TreeNode root, boolean isReverse)
        {
            reverse=isReverse;

            pushAll(root);
        }

        public int next()
        {
            //top.
            TreeNode top = st.pop();

            if(reverse == true)
            {
                pushAll(top.right);
            }
            else
            {
                pushAll(top.left);
            }

            return top.val;
        }

        //pushAll() method.
        public void pushAll(TreeNode node)
        {
            while(node != null)
            {
                st.push(node);
                if(reverse == true)
                {
                    node = node.left;
                }
                else
                {
                    node = node.right;
                }
            }
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        
        BSTIterator l = new BSTIterator(root,true);
        BSTIterator r = new BSTIterator(root,false);

        //here we use the two pointer aproach.
        int i = l.next();
        int j = r.next();

        while(i < j)
        {
            if(i + j == k)
            {
                return true;
            }
            else if(i + j < k)
            {
                i=l.next();
            }
            else
            {
                j=r.next();
            }
        }

        //if not found then we retur the false;
        return false;
    }
}