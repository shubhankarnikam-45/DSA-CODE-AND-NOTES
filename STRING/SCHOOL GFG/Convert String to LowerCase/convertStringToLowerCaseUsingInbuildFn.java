//this solved using inbuild function.

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static String toLower(String str)
	{
		return str.toLowerCase();
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		//taaking input string.
		String str=sc.nextLine();

		System.out.println(toLower(str));
		
	}
}