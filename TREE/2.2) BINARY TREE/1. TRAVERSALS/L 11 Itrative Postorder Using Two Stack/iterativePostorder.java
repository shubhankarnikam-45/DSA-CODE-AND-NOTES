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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        //creating two stack. 
        //first is integer type.
        Stack<Integer>st2=new Stack<>();
        //second of TreeNode type.
        Stack<TreeNode>st1=new Stack<>();

        //first time push the node.
        st1.push(root);

        //creating arraylist that hols the answe.r
        List<Integer>al=new ArrayList<>();

        //edge case.
        if(root==null)
        {
            return al;
        }

        while(st1.size()>0)
        {
            //extract node.(en)
            TreeNode en=st1.pop();

            //adding to the answer stack.
            st2.add(en.val);

            //adding left node if persent.
            if(en.left!=null)
            {
                st1.add(en.left);
            }

            
            //adding right node if persent.
            if(en.right!=null)
            {
                st1.add(en.right);
            }


        }

        while(st2.size()>0)
        {
            al.add(st2.pop());
        }

        return al;


    }
}