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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        //store the final answer.
        List<List<Integer>>ans =new ArrayList<>();

        //edge case.
        if(root==null)
        {
            return ans;
        }
        
        //creating queue data structure.
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(root);

        //creating flag variable.
        boolean leftToRight=true;       //left to right

        

        while(q.size()>0)
        {
            int size=q.size();

            List<Integer>al=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                //pop()
                TreeNode top=q.remove();

                if(top.left!=null)
                {
                    q.add(top.left);
                }

                
                if(top.right!=null)
                {
                    q.add(top.right);
                }

                if(leftToRight)
                {
                    al.add(top.val);
                }
                else
                {
                    al.add(0,top.val);
                }


            }

            ans.add(al);
            leftToRight=!leftToRight;
        }   

        //return the answer.
        return ans;
    }
}