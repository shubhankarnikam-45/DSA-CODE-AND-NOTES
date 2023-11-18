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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        //creaing lsit to retur anse.
        List<Integer>ans=new ArrayList<>();

        //edge case.
        if(root==null)
        {
            return ans;
        }

        //dummy node.
        TreeNode n=root;


        //creaint stack.
        Stack<TreeNode>st=new Stack<>();

        //traverse
        while(true)
        {
            if(n!=null)
            {
                st.push(n);
                n=n.left;
            }
            else
            {
                if(st.isEmpty())
                {
                    break;
                }


                //top element is pop();
                n=st.pop();

                //add to arraylist.
                ans.add(n.val);

                //going to right.
                n=n.right;

            }
        }


        return ans;
    }
}