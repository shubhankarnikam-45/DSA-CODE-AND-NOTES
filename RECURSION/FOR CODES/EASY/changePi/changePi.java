import java.util.*;
class Solution {

	// public static String helper(String str,int idx)
	// {
		
			
	// }
public static String changePi(String str,int idx) {


		if(str.length()==idx)
			return "";

	
		if(  idx!=str.length()-1 && str.substring(idx,idx+2).equals("pi"))   //1
		{
			// System.out.println("shubhg");
			return "3.14"+changePi(str,idx+2);
		}
		else    
		{
			return str.substring(idx,idx+1)+changePi(str,idx+1);
		}
	
}
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(Solution.changePi(str,0));
    }
}