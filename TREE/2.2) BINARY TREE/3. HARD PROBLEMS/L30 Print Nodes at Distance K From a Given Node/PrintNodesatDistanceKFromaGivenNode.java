
class Solution
{
    //function that find the target node.
    public static Node findTargetNode(Node root,int t)
    {
        
        if(root==null)
        {
            return null;
        }
        
        if(root.data==t)
        {
            return root;
        }
        
        Node a1=findTargetNode(root.left,t);
        Node a2=findTargetNode(root.right,t);
        
        if(a1==null)
        {
            return a2;
        }
        if(a2==null)
        {
            return a1;
        }
        
        return null;
        
    }
    
    //fucntion that finds the parent all parrent.
    public static void findParent(Node root,HashMap<Node,Node>parent)
    {
        //queue.
        Queue<Node>q=new ArrayDeque<>();
        q.add(root);
        
        while(q.size()>0)
        {
            int size=q.size();
            
            
            for(int i=0;i<size;i++)
            {
                //top.
                Node top=q.remove();
                
                if(top.left!=null)
                {
                    q.add(top.left);
                    parent.put(top.left,top);
                }
                
                if(top.right!=null)
                {
                    q.add(top.right);
                    parent.put(top.right,top);
                }
            }
        }
    }
    public static ArrayList<Integer> KDistanceNodes(Node root, int t , int k)
    {
        
        //finding the target node.
        Node target=findTargetNode(root,t);
        
        //creating HashMap that contains the all parent of respecttive child
        HashMap<Node,Node>parent=new HashMap<>();
        findParent(root,parent);
        
        //finding the node distance k.

        //creating queue
        Queue<Node>q=new ArrayDeque<>();
        //adding root.
        q.add(target);
        
        //creating HashSet that stores the node visited.
        HashSet<Node>visited=new HashSet<>();
        visited.add(target);
        
        //current distnace
        int cur_dist=0;
        
        //actual logic.
        while(q.size()>0)
        {
             
            //break case.
            if(cur_dist==k)
            {
                break;
            }
            
            //size of queue.
            int size=q.size();
            
            //increment the current distnace.
            cur_dist+=1;
            
            for(int i=0;i<size;i++)
            {
                //pop();
                Node top=q.remove();
                
                //this is current top left part.
                if(top.left!=null && !visited.contains(top.left))
                {
                    //added to queue.
                    q.add(top.left);
                    //mark as visited.
                    visited.add(top.left);
                }
                
                //this is current node right part.
                if(top.right!=null && !visited.contains(top.right))
                {
                    //added to the queue.
                    q.add(top.right);
                    //mark as visisted.
                    visited.add(top.right);
                }
                
                //this for upward direction.
                if(parent.containsKey(top) && !visited.contains(parent.get(top)))
                {
                    //added to queue.
                    q.add(parent.get(top));
                    //mark as visited.
                    visited.add(parent.get(top));
                }
                
                
            }
           
        }
        
        
        //creating arraylist that holds the answer.
        ArrayList<Integer>ans=new ArrayList<>();
        
        while(q.size()>0)
        {
            ans.add(q.remove().data);
        }
        
        Collections.sort(ans);
        
        
        return ans;
        
        

    }
};