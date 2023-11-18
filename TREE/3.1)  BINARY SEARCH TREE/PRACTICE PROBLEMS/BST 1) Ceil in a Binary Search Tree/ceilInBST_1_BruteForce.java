
class Tree {
    
    //gloable variable.
    int ans=-1;
    //travese inorder.
    int  inorder(Node root,int key)
    {
        if(root == null)
        {
            return 0;
        }
        if(inorder(root.left,key)!=0)
        {
            return ans;
        }
        
        if(root.data ==  key || root.data > key)
        {
            ans = root.data;
            return ans;
        }
        
        return inorder(root.right,key);
    }
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        
        int i=inorder(root,key);
        return ans;
        
       
    }
}
