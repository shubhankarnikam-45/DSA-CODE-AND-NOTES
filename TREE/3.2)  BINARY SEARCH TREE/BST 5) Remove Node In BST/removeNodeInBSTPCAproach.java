
import java.util.*;
import java.io.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BST{
    Node root = null;
    BST(){
        
    }
    BST(Node root){
        root=root;
    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val == val)
            return root;
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    void print(Node root){
        System.out.print(root.val + " ");
        if(root.left != null){
            print(root.left);
        }
        if(root.right != null){
            print(root.right);
        }
    }
}

class Solution{

    // function that finds the left max
    public int max(Node root)
    {
        
        if(root.right!=null)
        {
            return max(root.right);
        }
        else
        {
            return root.val;
        }
    }
    public Node deleteNode(Node root, int val){

        if(root==null)
        {
            return null;
        }

        if(root.val<val)
        {
            //right call
            root.right=deleteNode(root.right,val);
        }
        else if(root.val>val)
        {
            //left call
            root.left=deleteNode(root.left,val);
        }
        else
        {
            //now we get out node.
            //now their are 3 cases.
            // when 0 node.
            // when 1 node.
            // when 2 node

            //2 child
            if(root.left != null && root.right != null)
            {
                //do something.

                //finding the left max;
                int leftMax=max(root.left);
                root.val=leftMax;
                root.left=deleteNode(root.left,leftMax);
                return root;
            }
            else if(root.left!=null) //1 child
            {
                return root.left;
            }
            else if(root.right!=null) //1 child
            {
                return root.right;
            }
            else //0 child
            {
                return null;
            }

            
        }

        return root;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        Solution obj=new Solution();
        t.root= obj.deleteNode(t.root, k);
        t.print(t.root);
    }
}