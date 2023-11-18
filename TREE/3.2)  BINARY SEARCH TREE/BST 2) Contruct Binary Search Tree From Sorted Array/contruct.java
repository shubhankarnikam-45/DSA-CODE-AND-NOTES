import java.util.*;

class Node {

  int data;
  Node left, right;
  Node(int d,Node left,Node right) {
        data = d;
        this.left=left;
      this.right=right;
    }
    
}

class Solution{

    //BST function
    static Node BST(int arr[],int low,int high)
    {
        if(low>high)
        {
            return null;
        }

        //middle 
        int mid=(low+(high-low)/2);
        
        Node leftSubtree=BST(arr,low,mid-1);
        Node rightSubtree=BST(arr,mid+1,high);

        Node node=new Node(arr[mid],leftSubtree,rightSubtree);

        return node;
    }
    static void sortedArrayToBST(int arr[], int n){

        Node ans=BST(arr,0,n-1);
        display(ans);
    }

    //display  function.
    public static void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }
}
public class Main {

  // static Node getNode(int data) {
  //   // Allocate memory
  //   Node node = new Node(data);
  //   return node;
  // }

  // static Node LevelOrder(Node root, int data) {
  //   if (root == null) {
  //     root = getNode(data);
  //     return root;
  //   }
  //   if (data <= root.data) root.left =
  //     LevelOrder(root.left, data); else root.right =
  //     LevelOrder(root.right, data);
  //   return root;
  // }

  // static Node constructBst(int arr[], int n) {
  //   if (n == 0) return null;
  //   Node root = null;

  //   for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

  //   return root;
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Solution.sortedArrayToBST(tree, n);
  }
}
