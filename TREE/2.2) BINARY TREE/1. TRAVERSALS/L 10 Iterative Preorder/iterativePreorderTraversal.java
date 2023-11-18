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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        //arraylist that holds the answer.
        List<Integer>ans=new ArrayList<>();

        //special case.
        if(root==null)
        {
            return ans;
        }

        //creating stack.
        Stack<TreeNode>st=new Stack<>();

        //at start.
        st.push(root);

        while(!st.isEmpty())
        {
            //candiate. to pop
            TreeNode candidate=st.pop();

            //check for right node.
            if(candidate.right!=null)
            {
                st.push(candidate.right);
            }


            //check for left node.
            if(candidate.left!=null)
            {
                st.push(candidate.left);
            }

            ans.add(candidate.val);
        }

        
        return ans;
    }

    
}