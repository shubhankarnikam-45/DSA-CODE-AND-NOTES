
//this program is basic of linked list.
//pepcoding.
//use this as notes before interview for understand the linked list.

import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
     
     //creatig new node 
     Node n=new Node();
     
     //add value to data in node.
     n.data=val;
     
    // set next in Node = null.
     n.next=null;
     
    
     
     if(size==0)
     {
       head=tail=n;
     }
     else
     {
       tail.next=n;
       tail=n;
     }
     
      //at each time we increase the size++ hence this is outside of if..else.
     size++;
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}