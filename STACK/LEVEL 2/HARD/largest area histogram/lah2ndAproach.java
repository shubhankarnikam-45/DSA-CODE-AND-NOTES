
//this is solved using the second aproach
//must dry run for that.

class Solution {
    public int largestRectangleArea(int[] heights) {
        
        //creaint stack to do operation.
        Stack<Integer>st=new Stack<>();

        //first time we push -1 in the stack.
        st.push(-1);

        //maximum area
        int maxArea=0;

        for(int i=0;i<=heights.length;i++)
        {
            int val=(i==heights.length)?(0):(heights[i]);
           
            while(st.peek()!=-1 && heights[st.peek()]>=val)
            {
                int rightMin=i;
                int height=heights[st.pop()];
                int leftMin=st.peek();

                int width=(rightMin)-(leftMin)-1;

                int area=width*height;

                //max area.
                maxArea=Math.max(maxArea,area);


            }

            //push
            st.push(i);
        }


        return maxArea;
    }
}