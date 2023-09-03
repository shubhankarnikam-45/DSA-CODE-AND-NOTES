//using recursion i reverse the linked list.
//here i see the solution 







/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode helper(ListNode node)
    {
        if(node.next==null)
        {
            return node;
        }


        ListNode ans=helper(node.next);
        
        node.next.next=node;

        return ans;
    }
    public ListNode reverseList(ListNode head) {

        // ListNode current=head;
        // ListNode previous=null;

        

  if (head == null ) {
            return head;
        }

        
        ListNode ans=helper(head);
        head.next=null;
        // head=ans;

        return ans;

        
    }
}