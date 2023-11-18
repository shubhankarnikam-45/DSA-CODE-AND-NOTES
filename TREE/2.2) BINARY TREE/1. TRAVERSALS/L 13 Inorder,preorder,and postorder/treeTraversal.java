/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.List;
import java.util.*;
public class Solution {

    //creating pair class.
    public static class Pair
    {
        TreeNode node;
        int level;

        //constructor.
        Pair(TreeNode node,int level)
        {
            this.node=node;
            this.level=level;
        }
    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        
        //creating list of list of integer to hold the answer.
        List<List<Integer>>ans=new ArrayList<>();

        //edge case.
        if(root==null)
        {
            return ans;
        }

        //creating stack to do operation.
        Stack<Pair>st=new Stack<>();
        //creating object of pair class that contains the node and the level.
        Pair first=new Pair(root,1);
        st.push(first);

        //creating arraylist that holds the answer.
        List<Integer>preorder=new ArrayList<>();
        List<Integer>inorder=new ArrayList<>();
        List<Integer>postorder=new ArrayList<>();

        //now traverse till the stack is empty.
        while(st.size()>0)
        {
            Pair top=st.pop();

            if(top.level==1)
            {
                //add to preoder.
                preorder.add(top.node.data);

                //adding 1 more level.
                top.level++;

                 //adding this top elemnt.
                 st.push(top);


                //adding left child in the stack of given top if present.
                if(top.node.left!=null)
                {
                    st.push(new Pair(top.node.left, 1));
                }
            }
            else if(top.level==2)
            {
                //add to preoder.
                inorder.add(top.node.data);

                //adding 1 more level.
                top.level++;

                //adding this top elemnt.
                st.push(top);

                //adding left child in the stack of given top if present.
                if(top.node.right!=null)
                {
                    st.push(new Pair(top.node.right, 1));
                }
            }
            else  //top.level==3
            {
                postorder.add(top.node.data);
            }
        }


        //adding to final answer.
        ans.add(inorder);
        ans.add(preorder);
        ans.add(postorder);

        //return the answer.
        return ans;


























    }
}