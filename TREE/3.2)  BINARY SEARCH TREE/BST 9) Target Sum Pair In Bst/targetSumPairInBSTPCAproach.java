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

    boolean flag=false;


    //find funcion.
    public boolean find(Node root,int comp)
    {

        if(root==null)
        {
            return false;
        }
        if(root.data < comp)
        {
            return find(root.right,comp);
        }
        else if(root.data > comp)
        {
            return find(root.left,comp);
        }
        else
        {
            return true;
        }
    }

    public void targetSumHelper(Node root,Node node,int t)
    {
        if(root==null || node==null)
            return ;

        
        targetSumHelper(root,node.left,t);
        //complement.
        int comp=t-node.data;
        if(node.data < comp)
        {
            if(find(root,comp))
            {
                System.out.println(node.data+" "+comp);
                flag=true;
            }
        }

        targetSumHelper(root,node.right,t);

        //we doing the inorder
    }

    public void targetSum(Node root, int tar)
    {
        targetSumHelper(root,root,tar);
        if(flag==false)
        {
            System.out.println("-1");
        }
    }

}