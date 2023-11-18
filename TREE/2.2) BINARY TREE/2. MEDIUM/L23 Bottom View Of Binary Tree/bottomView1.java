
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
			ArrayList<Integer> ans = tree.bottomView(root);

            for(Integer num:ans)
            System.out.print(num+" ");

            System.out.println();
		}
	}
}
  


class Solution{

    //creating pair class
    public class Pair
        {
            Node node;
            int idx;

            //
            Pair(Node node,int idx)
            {
                this.node=node;
                this.idx=idx;
            }
        }
    
    public ArrayList <Integer> bottomView(Node root)
    {

        //creating queue.
        Queue<Pair>q=new ArrayDeque<>();

        //creating arraylist to return answer.
        ArrayList<Integer>ans=new ArrayList<>();

        if(root==null)
        {
            return ans;
        }

        //creting treempa.
        Map<Integer,Integer>tmap=new TreeMap<>();

        //creatin hashset
        

        //adding root in the quee.
        q.add(new Pair(root,0));


        while(q.size()>0)
            {
                //pop();
                Pair top=q.remove();

                //check.
                if(!tmap.containsKey(top.idx))
                {
                    tmap.put(top.idx,top.node.data);
                }
                else
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

        for(Integer key:tmap.keySet())
            {
                ans.add(tmap.get(key));
            }

        return ans;
    }
}
