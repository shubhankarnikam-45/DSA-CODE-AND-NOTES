import java.util.*;

class Solution {
    public static String removeKdigits(String arr, int k) {

		//stack of character.
		Stack<Character>st=new Stack<>();

		//traverse
		for(int i=0;i<arr.length();i++)
			{
				//current character.
				char ch=arr.charAt(i);

				while(st.size()>0 &&k>0 && ch<st.peek())
				{
					st.pop();
					k--;
				}
				st.push(ch);

				
			}

		//this is when k is not equal to zero.
		while(st.size()>0 && k>0)
			{
				//due to in stack order is incresing.
				st.pop();
				k--;
			}


		//now we adding this element to the character array.
		int len=st.size();

		//char array.
		char ans[]=new char[len];

		for(int i=len-1;i>=0;i--)
			{
				ans[i]=st.pop();
			}

		//not required
		// for(int i=0;i<ans.length;i++)
		// 	System.out.println(ans[i]+"  ");

		//if their are some forward zero.
		int countOfZero=0;
		while(countOfZero<len && ans[countOfZero]=='0')
			{
				countOfZero++;
			}

		//string that hold the answer.
		StringBuilder sb=new StringBuilder();
		while(countOfZero<len)
			{
				sb.append(ans[countOfZero++]);
			}

		return sb.toString();
		
		
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        String result = Solution.removeKdigits(num, k);
        System.out.println(result);
    }
}