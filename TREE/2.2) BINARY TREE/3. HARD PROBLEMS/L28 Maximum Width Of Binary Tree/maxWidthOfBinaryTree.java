

//que link
//https://leetcode.com/problems/maximum-width-of-binary-tree/submissions/1095846293/







import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

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
            if (i >= ip.length)
                break;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node root = buildTree(s);
        Solution tree = new Solution();
        int ans = tree.solve(root);
        System.out.println(ans);

        sc.close();
    }
}

class Solution {

    //pair class
    public class Pair
        {
            Node node;
            int num;

            Pair(Node node,int num)
            {
                this.node=node;
                this.num=num;
            }
        }
    
    public int solve(Node root) {

        //edge case.
        if(root==null)
        {
            return 0;
        }
        
        //creating queue data structure.
        Queue<Pair>q=new ArrayDeque<>();
        //first time add root.
        q.add(new Pair(root,0));

        int max=0;

        while(q.size()>0)
            {
                //size of queue.
                int size=q.size();

                //minimum index.
                int minIndex=q.peek().num;

                int first=0;
                int last=0;
                
                for(int i=0;i<size;i++)
                    {
                        //pop
                        Pair top=q.remove();

                        //first index.
                        if(i==0)
                        first=top.num;

                        //last index.
                        if(i==size-1)
                        {
                            last=top.num;
                        }

                        //if top node left child is present.
                        if(top.node.left!=null)
                        {
                            q.add(new Pair(top.node.left,2*(top.num-minIndex)+1));
                        }

                        //if top node right child is present.
                        if(top.node.right!=null)
                        {
                            q.add(new Pair(top.node.right,2*(top.num-minIndex)+2));
                        }
                    }

                max=Math.max(max,(last-first)+1);
            }


        return max;
        
    }
}
