import java.util.*;
  
public class Main{
  
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String s=scn.nextLine();
      String asf="";
      permutationPrint(s,asf);
   }










   public static void permutationPrint(String ques, String asf)
    {

		//base case 
		//when ques empty then we print the result.
		if(ques.length()==0)
		{
			System.out.println(asf);
			return;
		}

        //for loop for finding each first character in string.
		for(int i=0;i<ques.length();i++)
			{
				//this is first character of string.
				char firstCharacter=ques.charAt(i);

				//this is left part.
				String leftPart=ques.substring(0,i);

				//this is right part.
				String rightPart=ques.substring(i+1);

				//this is rest Of String
				String restOfString=leftPart+rightPart;

				//recursive call.
				permutationPrint(restOfString,asf+firstCharacter);
			}
    }
  }