import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node constructBST(int[] arr, int start, int end, Node root) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;

        if (root == null)
            root = new Node(arr[mid]);

        root.left = constructBST(arr, start, mid - 1, root.left);
        root.right = constructBST(arr, mid + 1, end, root.right);

        return root;

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(arr);
        Node root = null;
        BinarySearchTree bst = new BinarySearchTree();
        root = bst.constructBST(arr, 0, n - 1, root);

        Accio A = new Accio();
        A.targetSum(root, target);

        sc.close();
    }
}

class Accio {

    //creating flag boolean variable to handle when no pair is found.
    boolean flag=false;

    //creating pair class
    public class Pair
        {
            Node node;
            int state=0;

            Pair(Node node,int state)
            {
                this.node=node;
                this.state=state;
            }
        }

    public void targetSum(Node root, int tar)
    {


        //this is for iterative inorder traversal.
        Stack<Pair> forLeft=new Stack<>();
        Stack<Pair> forRight=new Stack<>();
        //first time
        
        forLeft.push(new Pair(root,0));
        forRight.push(new Pair(root,0));

        Node left=findNextInNormalInorder(forLeft);
        Node right=findNextInReverseInorder(forRight);

        while(left.data < right.data)
            {
                if(left.data + right.data < tar)
                {
                    left=findNextInNormalInorder(forLeft);
                    
                }
                else if(left.data + right.data > tar)
                {
                     right=findNextInReverseInorder(forRight);
                }
                else
                {
                    //this means we found our answer.
                    //1. print
                    System.out.println(left.data+" "+right.data);
                    right=findNextInReverseInorder(forRight);
                    left=findNextInNormalInorder(forLeft);
                    flag=true;
                }
            }

        if(flag==false)
            System.out.println("-1");
    }

    //now we write code to find the inorder(normal)
    public Node findNextInNormalInorder(Stack<Pair> forLeft)
    {
        while(forLeft.size()>0)
            {
                //top.
                Pair top=forLeft.peek();

                if(top.state==0)
                {
                    //this means this is in preorder.
                    if(top.node.left!=null)
                    {
                        forLeft.push(new Pair(top.node.left,0));
                    }

                    //increset the state.
                    top.state++;
                }
                else if(top.state==1)
                {
                    //this means we are in INORDER
                    if(top.node.right != null)
                    {
                        forLeft.push(new Pair(top.node.right,0));
                    }

                    //increase the state.
                    top.state++;

                    return top.node;
                }
                else
                {
                    //this means we are in the postorder.
                    //we just pop
                    forLeft.pop();
                }
            }

        //dummy return satement.
        return null;
    }

      //now we write code to find the inorder(reverse)
    public Node findNextInReverseInorder(Stack<Pair> forRight)
    {
        while(forRight.size()>0)
            {
                //top.
                Pair top=forRight.peek();

                if(top.state==0)
                {
                    //this means this is in preorder.
                    if(top.node.right!=null)
                    {
                        forRight.push(new Pair(top.node.right,0));
                    }

                    //increset the state.
                    top.state++;
                }
                else if(top.state==1)
                {
                    //this means we are in INORDER
                    if(top.node.left != null)
                    {
                        forRight.push(new Pair(top.node.left,0));
                    }

                    //increase the state.
                    top.state++;

                    return top.node;
                }
                else
                {
                    //this means we are in the postorder.
                    //we just pop
                    forRight.pop();
                }
            }

        //dummy return statement.
        return null;
    }

}