import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.binaryTreeZigZagTraversal(root1);
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static void binaryTreeZigZagTraversal(Node root) {


        if(root==null)
        {
            System.out.println("");
            return;
        }
        //creating one flag variable
        boolean flag=true;

        //creating queue.
        Queue<Node>q=new ArrayDeque<>();

        Queue<Node>p=new ArrayDeque<>();
        //adding first node to queue.
        q.add(root);

        String ans="";

        while(q.size()>0)
            {
                Node top =q.remove();

                if(flag)
                {
                    ans+=top.data+" ";
                }
                else
                {
                    ans=top.data+" "+ans;
                }

                
                if(top.left!=null)
                {
                    p.add(top.left);
                }

                if(top.right!=null)
                {
                    p.add(top.right);
                }

                if(q.size()==0)
                {
                    q=p;
                    p=new ArrayDeque<>();
                    flag=!flag;
                    System.out.print(ans);
                    ans="";
                }


            }













        
    }
}