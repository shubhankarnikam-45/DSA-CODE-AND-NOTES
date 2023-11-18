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
            if (!currVal.equals("-1")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("-1")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Node root = buildTree(s);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Solution g = new Solution();
        Node ans = g.findLCA(root,x,y);
        System.out.println(ans.data);
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

    //function that finds the node to root path for node 1
    public static ArrayList<Node> nodeToRootPath(Node node,int n1)
    {

        if(node==null)
        {
            return new ArrayList<Node>();
        }

        
        if(node.data==n1)
        {
            ArrayList<Node>al=new ArrayList<>();
            al.add(node);
            return al;
        }

        //faith.
        ArrayList<Node>al1=nodeToRootPath(node.left,n1);
        ArrayList<Node>al2=nodeToRootPath(node.right,n1);

        if(al1.size()>0)
        {
            al1.add(0,node);
            return al1;
        }

        if(al2.size()>0)
        {
            al2.add(0,node);
            return al2;
        }

        return new ArrayList<Node>();
    }
    public static Node findLCA(Node node,int n1,int n2) {

        //finding the node to root path for the n1 node.
        ArrayList<Node>al1=nodeToRootPath(node,n1);
        ArrayList<Node>al2=nodeToRootPath(node,n2);

        int i=0;
        int j=0;

        while(i<al1.size() && j<al2.size())
            {
                if(al1.get(i)!=al2.get(j))
                {
                    break;
                }
                i++;
                j++;
            }

        return al1.get(i-1);
    }
}