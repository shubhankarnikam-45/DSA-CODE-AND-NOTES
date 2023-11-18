
//que link
// https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1


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
    
    public void targetSum(Node root, int tar)
    {

        //creating HashSet to store the unique value
        HashSet<Integer> hset =new HashSet<>();

        //now traversing in reverse preorder.
        reversePreorder(root,tar,hset);    

        if(flag==false)
        {
            System.out.println("-1");
        }
    }

    //reverse preorder function
    public void reversePreorder(Node root,int t,HashSet<Integer> hset)
    {
        if(root==null)
        {
            return;
        }

        //required data.
        
        if(hset.contains(Math.abs(t-root.data)))
        {
            if(root.data<Math.abs(t-root.data))
            System.out.println(root.data+" "+Math.abs(t-root.data));
            flag=true;
        }
        hset.add(root.data);

        //going to right.
        reversePreorder(root.right,t,hset);
        //going to left
        reversePreorder(root.left,t,hset);
    }

}