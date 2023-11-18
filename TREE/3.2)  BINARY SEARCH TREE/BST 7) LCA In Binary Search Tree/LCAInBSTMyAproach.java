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

      public ArrayList<TreeNode> find(TreeNode node,int n)
    {

    

        if(node==null)
        {
            return new ArrayList<>();
        }
        
        ArrayList<TreeNode>ans=new ArrayList<>();
        
        if(node.val<n)
        {
            ArrayList<TreeNode>al1=find(node.right,n);  

            if(al1.size()>0)
            {
                ans.add(node);
                for(TreeNode item:al1)
                    {
                        ans.add(item);
                    }
            }
        }
        else if(node.val>n)
        {
            ArrayList<TreeNode>al1=find(node.left,n);  

            if(al1.size()>0)
            {
                ans.add(node);
                for(TreeNode item:al1)
                    {
                        ans.add(item);
                    }
            }
        }
        else
        {
            ans.add(node);
            // System.out.println("equal");
        }

        return ans;
    }


    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode n1, TreeNode n2) {
         if(node==null)
        {
            return null;
        }
        
       //for first number (n1) path.
        ArrayList<TreeNode>al1=find(node,n1.val);
        
       //for first number (n1) path.
        ArrayList<TreeNode>al2=find(node,n2.val);

        // now traverse.

        int i=0;
        int j=0;
        while(i<al1.size() && j < al2.size())
            {
                if(al1.get(i).val==al2.get(j).val)
                {
                    i++;
                    j++;
                }
                else
                {
                    break;
                }
            }

        if(i==0)
            return al1.get(i);

        return al1.get(i-1);
    }
}