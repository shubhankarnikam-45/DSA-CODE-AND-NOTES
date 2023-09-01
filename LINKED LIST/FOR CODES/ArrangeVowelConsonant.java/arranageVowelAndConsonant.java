
//this quetion encounter when i give the DSA 2 mock i try 30% but i can't beat the quetion 
//i solve by looking solution.

/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/


class Solution {
    
    public Node arrangeCV(Node head){
        
        
        //creating the one arraylist to store the 'vowel'
        ArrayList<Character>vowel=new ArrayList<>();
        
        
        //creating the one arraylist to store the 'consonant'
        ArrayList<Character>con=new ArrayList<>();
        
        
        //this is to traversing the node.
        Node t=head;
        
        //traversing throught the linked list.
        while(t!=null)
        {
            if(t.data=='a' || t.data=='e'||t.data=='i' || t.data=='o'|| t.data=='u')
            {
                vowel.add(t.data);
            }
            else
            {
                con.add(t.data);
            }
            
            t=t.next;
        }
        
        
        t=head;
        
        //this required in while loop.
        int vowelCount=0;
        int conCount=0;
        
        //getting the size of 'vowel arraylist.'
        int vowelSize=vowel.size();
        
        while(t!=null)
        {
            
            //this is sign of in vowel data present or not.
            if(vowelCount<vowelSize)
            {
                t.data=vowel.get(vowelCount);
                vowelCount++;
            }
            else
            {
                t.data=con.get(conCount);
                conCount++;
            }
            
            
            t=t.next;
        }
        
        return head;
    }
}


class Solution {
    
    public Node arrangeCV(Node head){
        
        
        //creating the one arraylist to store the 'vowel'
        ArrayList<Character>vowel=new ArrayList<>();
        
        
        //creating the one arraylist to store the 'consonant'
        ArrayList<Character>con=new ArrayList<>();
        
        
        //this is to traversing the node.
        Node t=head;
        
        //traversing throught the linked list.
        while(t!=null)
        {
            if(t.data=='a' || t.data=='e'||t.data=='i' || t.data=='o'|| t.data=='u')
            {
                vowel.add(t.data);
            }
            else
            {
                con.add(t.data);
            }
            
            t=t.next;
        }
        
        
        t=head;
        
        //this required in while loop.
        int vowelCount=0;
        int conCount=0;
        
        //getting the size of 'vowel arraylist.'
        int vowelSize=vowel.size();
        
        while(t!=null)
        {
            
            //this is sign of in vowel data present or not.
            if(vowelCount<vowelSize)
            {
                t.data=vowel.get(vowelCount);
                vowelCount++;
            }
            else
            {
                t.data=con.get(conCount);
                conCount++;
            }
            
            
            t=t.next;
        }
        
        return head;
    }
}