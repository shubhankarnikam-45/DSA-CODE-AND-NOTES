import java.util.*;
import java.io.*;
class Node{
    int data; 
    Node left, right;
    Node(int key){
        data = key;
        left = right = null;
    }
}

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        int inorder[] = new int[n];
        int preorder[] = new int[n];
        for(int i = 0; i < n; i++)
          preorder[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
          inorder[i] = sc.nextInt();
        Solution ob = new Solution();
        root = ob.buildTree(inorder, preorder, n);
        postOrdrer(root);
        System.out.println();
    }
    
    public static void postOrdrer(Node root){
        if(root == null)
          return;
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}


class Solution{
    public static Node buildTree(int inorder[], int preorder[], int n){


        //first creating the hashmap that contains the index of inorder eleemnt.
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            {
                hmap.put(inorder[i],i);
            }

        //return for final answer.
        Node root=buildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,hmap);

        return root;


        
    }

    public static Node buildTree(int inorder[],int inStart,int inEnd,int preorder[],int preStart,int preEnd,HashMap<Integer,Integer>hmap)
    {

        //edge case.
        if(inStart>inEnd || preStart>preEnd)
        {
            return null;
        }

        //adding root.
        Node root=new Node(preorder[preStart]);

        //root finds in inorder
        int inRoot=hmap.get(root.data);
        //left part.
        int leftPart=inRoot-inStart;

        root.left=buildTree(inorder,inStart,inRoot-1,preorder,preStart+1,preStart+leftPart,hmap);
        root.right=buildTree(inorder,inRoot+1,inEnd,preorder,preStart+leftPart+1,preEnd,hmap);

        return root;
    }
}
