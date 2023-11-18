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
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        
        Solution Accio=new Solution();
        Accio.letfView(t.root);
    }
}

class Solution
{

     //recursion
    public static void recursion(Node root,int level,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }

        if(ans.size()==level)
        {
            ans.add(root.val);
        }

        recursion(root.left,level+1,ans);
        recursion(root.right,level+1,ans);
    }
   
    public static void letfView(Node root)
    {
         //creating arraylist to return answre.
        List<Integer>al=new ArrayList<>();

        recursion(root,0,al);

        for(int i:al)
            {
                System.out.print(i+" ");
            }
    }
    
}