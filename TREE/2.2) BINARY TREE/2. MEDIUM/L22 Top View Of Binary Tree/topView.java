import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Main {
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
			String s = br.readLine();
			Node root = buildTree(s);
			Solution tree = new Solution();
			ArrayList<Integer> arr = tree.topView(root);
			for(int x : arr)
			System.out.print(x +" ");
			System.out.println();  
		}
	}
}
  

class qObj
{
    Node node;
    int level;
    qObj(Node n,int l)
    {
        node=n;
        level=l;
    }
}

class Solution
{
    //creating pair class.
    public class Pair
        {
            Node node;
            int idx;

            //contructor.
            Pair(Node node,int idx)
            {
                this.node=node;
                this.idx=idx;
            }
        }
    
  
    
 
    
    public ArrayList<Integer> topView(Node root){

        ArrayList<Integer>ans=new ArrayList<>();

        //edge case.
        if(root==null)
        {
            return ans;
        }
        //creating treeset.
        Map<Integer,Integer>tmap=new TreeMap<>();

        //creating quee.
        Queue<Pair>q=new ArrayDeque<>();

        //first time add root.
        q.add(new Pair(root,0));

        //run till the size is empty.
        while(q.size()>0)
            {
                //pop();
                Pair top=q.remove();

                //check in the map.
                if(!tmap.containsKey(top.idx))
                {
                    tmap.put(top.idx,top.node.data);
                }

                if(top.node.left!=null)
                {
                    q.add(new Pair(top.node.left,top.idx-1));
                }

                if(top.node.right!=null)
                {
                    q.add(new Pair(top.node.right,top.idx+1));
                }
            }

        //adding answer to the arraylist.
        for(Integer key:tmap.keySet())
            {
                ans.add(tmap.get(key));
            }

        return ans;
        
    }
}

