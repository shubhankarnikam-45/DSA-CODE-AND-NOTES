/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        //edge case.
        if(root==null)
        {
            return "";
        }
        
        //creating queue.
        Queue<TreeNode>q=new ArrayDeque<>();

        //creating string bulder.
        StringBuilder res=new StringBuilder();

        q.add(root);

        while(q.size()>0)
        {
            //pop();
            TreeNode top=q.remove();

            if(top.val==-10000)
            {
                res.append("n ");
                continue;
            }

            res.append(top.val+" ");

            //add left child.
            if(top.left==null)
            {
                q.add(new TreeNode(-10000));
            }
            else   
            {
                 q.add(top.left);
            } 
               
            
            //add right child.
            if(top.right==null)
            {
                q.add(new TreeNode(-10000));
            }
            else
            {
                q.add(top.right);
            }

        }


        return res.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        if(data=="")
        {
            return null;
        }
        //creating array of stinrg.
        String arr[]=data.split(" ");

        //creaging root.
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));

        //creating queue. 
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(root);

        //start from index 1
        for(int i=1;i<arr.length;i++)
        {
            //pop
            TreeNode top=q.remove();

            if(!arr[i].equals("n"))
            {
                //crearing new left node.
               TreeNode left=new TreeNode(Integer.parseInt(arr[i]));

               //add this to left of parent.
               top.left=left;

               //added to queue.
               q.add(left);
            }

            if(!arr[++i].equals("n"))
            {
                //crearing new right node.
               TreeNode right=new TreeNode(Integer.parseInt(arr[i]));

               //add this to left of parent.
               top.right=right;

               //added to queue.
               q.add(right);
            }
        }

        //return the answer.
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));