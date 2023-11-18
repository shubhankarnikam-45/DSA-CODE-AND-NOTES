
class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
          //current pointer.
        Node cur=root;
        
        //to hold the answer.
        ArrayList<Integer>ans=new ArrayList<>();
        
        //traverse.
        while(cur!=null)
        {
            
            //if current left ==null
            if(cur.left==null)
            {
                ans.add(cur.data);
                cur=cur.right;
            }
            else
            {
                
                //if left exits we going to extreme right and make thread
                Node prev=cur.left;
                while(prev.right!=null && prev.right!=cur)
                {
                    prev=prev.right;
                }
                
                //when this loop end then their are two case.
                
                //fist when  prev.right == null
                if(prev.right == null)
                {
                    prev.right=cur;
                    
                    //this is important in preorder.
                    ans.add(cur.data);
                    
                    cur=cur.left;
                }
                //second when prev right points to the cur.
                else
                {
                    prev.right=null;
                
                    cur=cur.right;
                }
            }
            
        }
        
        return ans;
    }

}