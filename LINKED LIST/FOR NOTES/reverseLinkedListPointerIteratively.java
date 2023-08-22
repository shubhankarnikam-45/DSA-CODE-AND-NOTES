
//this quetion take as the practice and this i see first time hence i see the solution.
//but take as the practice.


// tc: O(n)
// sc: O(1)
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {

        //this is used to itrate over the linked list. 
        Node current=head;

        //this cointains the previous node address.
        Node previous=null;

        //this used to temporary store the address of current which mentioned above.
        Node next;

        //this while loop for traversing over the linked list.
        while(current!=null)
        {
            //this store the next node address..
            next=current.next;

            //due to this we point to the previoud node.
            current.next=previous;

            //now each previous point to the current this vimp when we reverse the  linked list.
            previous=current;

            //now we store the addresss in 'next' and now current point to the next.
            current=next;
        }

        head=previous;

        return head;
    }
}