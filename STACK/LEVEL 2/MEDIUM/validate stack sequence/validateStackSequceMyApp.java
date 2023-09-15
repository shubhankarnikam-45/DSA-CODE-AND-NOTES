import java.util.*;

class Solution {
    public boolean validateStack(int[] pushed, int[] popped) {

		//creaint stack to push the seconcd 'popped' array element.
		Stack<Integer>popStack=new Stack<>();

		//adding element.
		for(int i=popped.length-1;i>=0;i--)
			{
				popStack.push(popped[i]);
			}


		//creating stack for the 'pushed' array.
		Stack<Integer>pushStack=new Stack<>();
		
		//now we doing our actula logic.
		for(int i=0;i<pushed.length;i++)
			{
				pushStack.push(pushed[i]);
				int p1=pushStack.peek();
				int p2=popStack.peek();
				
				while(pushStack.size()>=1 && pushStack.peek().equals(popStack.peek()))
					{
						popStack.pop();
						pushStack.pop();
						
					}

			}

		

		if(pushStack.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] pushed = new int[n];
        int[] popped = new int[n];
        for (int i = 0; i < n; i++) {
            pushed[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            popped[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        System.out.print(Obj.validateStack(pushed, popped));
    }
}