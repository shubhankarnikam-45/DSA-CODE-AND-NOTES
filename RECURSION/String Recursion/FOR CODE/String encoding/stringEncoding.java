
//this quetion i encounter when i solved quetion from pepcoding.
//i see the quetion on pepcoding.
//but i speand 1.2 hr to solve this quetion .
//but i learn the approach of this quetion .
//and i suresly applied to othe quetios.

//peding time and space compleixity.


public class Main {
    public static void printEncodings(String str,String asf) {

		//base case
		//if string length is equal to zero then we just print the 'asf(strig so far)'
		if(str.length()==0)
		{
			System.out.println(asf);
			return;
		}
		//when string length is 1 that means we don't have the substring hence we this condition.
		else if(str.length()==1)
		{
			//here we got the first character.
			char firstChar=str.charAt(0);

			//now this first character is zero that mean this is invalid string we just return.
			if(firstChar=='0')
			{
				return;
			}
			else
			{
				//here we go because of first character is not equal to '0'

				//now we convert this character to proper interger as('1'!=1).
				int firstCharToNumber=firstChar-'0';

				//now we convert this number to sequenail alphabets as mentionsed in program.
				//e.g., 1==>a  2==>b ..........26==>z.
				char requiredAlphabets=(char)('a'+firstCharToNumber-1);			

				//now we add this 'requiredAlphabetes' to the asf in given function call.
				printEncodings("",asf+requiredAlphabets);
			}
		}
		else
		{
			// now hrer we do operaton when our sring length is greater than 1

			//here we got the first character.
			char firstChar=str.charAt(0);

			//to get the 'rest of string'.
			//'123'    ==> we want "23"
			String restOfQuestion1=str.substring(1);
			
			//now we convert this character to proper interger as('1'!=1).
			int firstCharToNumber=firstChar-'0';

			//now this given number we converted into the requiered ALPHABETS.
			//this line is very important.
			
			//1----'a'
			char firstNumberToAlphabets=(char)('a'+firstCharToNumber-1);

			 //this 'firstCharToNumber' ==0 that means we just return.
			if(firstChar=='0')
			{
				return;
			}
			else
			{
					printEncodings(restOfQuestion1,asf+firstNumberToAlphabets);
			}


			// ------------------------------------------------

			//here we got the second string
			//e.g., abc----------'bc'
			String secondString=str.substring(0,2);

			//here we got the ' rest of string'
			// "abc"===> "c"	
			String restOfQuestion2=str.substring(2);

			//herer we got the integer number of second string.
			//e.g., "abc"===> "ab" ====>12
			int secondStringToNumber=Integer.parseInt(secondString);

			
			//now we convert this number to sequenail alphabets as mentionsed in program.
			//e.g., 1==>a  2==>b ..........26==>z.
			char requiredAlphabets2=(char)('a'+secondStringToNumber-1);


			// that means the given number is must less that or equal to 26
			if(secondStringToNumber<=26)
			{
				printEncodings(restOfQuestion2,asf+requiredAlphabets2);
			}

			
			
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str,"");
    }
}