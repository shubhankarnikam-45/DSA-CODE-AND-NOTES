

// que link: https://practice.geeksforgeeks.org/problems/floor-in-bst/1?utm_source=geeksforgeeks&utm_medium=newui_home&utm_campaign=potd
class Solution {
    public static int floor(Node root, int x) {
        
        //floor value.
        int floor=-1;
        
        while(root != null)
        {
            //if we found the exact value.
            if(root.data == x)
            {
                floor = root.data;
                return floor;
            }
            else if(root.data < x)
            {
                floor = root.data;
                //going to right.
                root=root.right;
            }
            else
            {
                //if(root.data > x)
                root=root.left;
            }
        }
        
        return floor;
    }
}