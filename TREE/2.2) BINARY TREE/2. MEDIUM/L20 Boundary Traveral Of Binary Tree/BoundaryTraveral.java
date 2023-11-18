import java.util.*;

class Node {

  int data;
  Node left, right;
}

class Solution{
    
    //function that check the node is leave node or not.
    public static boolean isLeave(Node node)
    {
        return (node.left==null)&&(node.right==null);
    }

    //function that prints the left boundary.
    public static void printLeftBoundary(Node node,ArrayList<Integer>res)
    {
        Node cur=node.left;
        while(cur!=null)
            {
                if(isLeave(cur)==false)
                {
                    res.add(cur.data);
                }

                if(cur.left!=null)
                {
                    cur=cur.left;
                }
                else
                {
                    cur=cur.right;
                }
            }
    }

    //print leaves.
    public static void printLeaves(Node node,ArrayList<Integer>res)
    {

        if(isLeave(node))
        {
            res.add(node.data);
        }

        if(node.left!=null)
        {
            printLeaves(node.left,res);
        }
        if(node.right!=null)
        {
            printLeaves(node.right,res);
        }
        
    }

    //print right boundary.
    public static void printRightBoundary(Node node,ArrayList<Integer>res)
    {
        Node cur=node.right;
        ArrayList<Integer>temp=new ArrayList<>();

        while(cur!=null)
            {
                if(isLeave(cur)==false)
                {
                    temp.add(cur.data);
                }

                if(cur.right!=null)
                {
                    cur=(cur.right);
                }
                else
                {
                    cur=(cur.left);
                }
            }

        for(int i=temp.size()-1;i>=0;i--)
            {
                res.add(temp.get(i));
            }
    }
    static void printBoundary(Node node)
    {
        //for storing the answer.
        ArrayList<Integer>al=new ArrayList<>();

        //give given node is not leave
        if(isLeave(node)==false)
        {
            al.add(node.data);
        }

        //print left boundary.
        printLeftBoundary(node,al);
        //print leaves node.
        printLeaves(node,al);
        //print right node.
        printRightBoundary(node,al);

        for(Integer i:al)
            {
                System.out.print(i+" ");
            }
    }
}
public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    Solution.printBoundary(root);
  }
}
