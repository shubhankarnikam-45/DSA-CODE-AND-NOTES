
class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        
        
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        if(root==null)
        return ans;
        
        if(root.data < low && root.data < high)
        {
            ArrayList<Integer>al1=printNearNodes(root.right,low,high);
            return al1;
            
            
        }
        else if(root.data > low && root.data > high)
        {
            ArrayList<Integer>al2=printNearNodes(root.left,low,high);
            return al2;
        }
        else
        {
            ArrayList<Integer>al1=printNearNodes(root.left,low,high);
            
            al1.add(root.data);
            
            ArrayList<Integer>al2=printNearNodes(root.right,low,high);
            for(int i:al2)
            al1.add(i);
            return al1;
        }
        
        //return the answer.
        // return ans;
    }
    
}