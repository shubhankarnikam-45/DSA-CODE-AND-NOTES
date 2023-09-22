//this is can't solve
//important thing is to find the 'cases.'

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
		//stack.
		Stack<Integer>st=new Stack<>();

		//traverse
		for(int val:asteroids)
			{
				if(val>0)
				{
					//when element is posive then it can't collied
					st.push(val);
				}
				else
				{
					//this when we foound the small element in the stack.
					while(st.size()>0 &&st.peek()>0 &&  st.peek()<-val)
						{
							st.pop();
						}

					//when equal element
					if(st.size()>0 && st.peek()==-val)
					{
						st.pop();
					}
					else if(st.size()>0 && st.peek()>-val)
					{
						//this when in stack some grater element
						//this outer element is distriod
					}
					else
					{
						//at last when we push the element
						st.push(val);
					}

					
				}
			}

		//array to hold the answer.
		int ans[]=new int[st.size()];

		int i=ans.length-1;
		//we add at the last of array because we use the stack.
		while(i>=0)
			{
				ans[i--]=st.pop();
			}


		return ans;
    }
}