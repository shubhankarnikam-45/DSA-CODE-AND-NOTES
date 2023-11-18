
class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        
        int ceil=-1;
        
        while(root != null)
        {
            //if we found the exact value,
            if(root.data == key)
            {
                ceil=root.data;
                return ceil;
            }
            else if(root.data > key)
            {
                //this is probale answer.
                ceil=root.data;
                
                //now we going to left.
                root=root.left;
            }
            else
            {
                //if(root.data < key) now we just move to right 
                //for finding the better answer.
                root=root.right;
            }
            
            
            
        }
        
        return ceil;
    }
}
