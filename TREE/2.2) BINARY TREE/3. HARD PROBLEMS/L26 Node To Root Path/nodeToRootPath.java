/********************************************************************

 Following is the class structure of the Node class:

 class BinaryTreeNode {
     int data;
     BinaryTreeNode left;
     BinaryTreeNode right;

     BinaryTreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 };

 ********************************************************************/
import java.util.*;

public class Solution {
    public static  void allRootToLeafHelper(BinaryTreeNode root,String psf,List<String>ans)
    {
        if(root==null)
        {
            return;
        }

        psf+=root.data+" ";

        if(root.left==null && root.right==null)
        {
            ans.add(psf);
        }
        else
        {
            allRootToLeafHelper(root.left, psf, ans);
            allRootToLeafHelper(root.right, psf, ans);
        }
    }
    public static List<String> allRootToLeaf(BinaryTreeNode root) {
        
        List<String>ans=new ArrayList<>();

        if(root==null)
        {
            return ans;
        }


        allRootToLeafHelper(root,"", ans);
        return ans;
    }
}