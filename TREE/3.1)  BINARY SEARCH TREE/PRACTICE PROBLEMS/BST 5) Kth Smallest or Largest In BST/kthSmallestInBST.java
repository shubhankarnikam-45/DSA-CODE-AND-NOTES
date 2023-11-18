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
    public int kthSmallest(TreeNode root, int k) {
        

        if(root == null)
        {
            return -1;
        }

        //writing the code for the iterative inorder.
        
        //creating stack.
        Stack<TreeNode>st =  new Stack<>();

        //dummy node
        TreeNode n = root;

        while(true)
        {

            //going to extreme left
            if(n != null)
            {
                //left
                st.push(n);
                n=n.left;
            }
            else
            {
                // if(st.size()==0)
                //     return -1;

                //top
                n = st.pop();

                //check for k   
                if(k==1)
                {
                    return n.val;
                    
                }

                n=n.right;

                k--;

            }

        }

        // return -1;
    }
}