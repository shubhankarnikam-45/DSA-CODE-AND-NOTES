class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        
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
                    cur=cur.left;
                }
                //second when prev right points to the cur.
                else
                {
                    prev.right=null;
                    ans.add(cur.data);
                    cur=cur.right;
                }
            }
            
        }
        
        return ans;
        
    }
}