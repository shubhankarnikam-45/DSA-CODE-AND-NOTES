
//CLASS VARIABLES.
//static keywords.

//static variable depends on 'class not object declaration'.

import java.io.*;

//creating class student.
class Student
{
    //class variables.
    static String school="SGM college karad.";

    //instance variables.
    String name;
    int reg;
}

class GFG {
	public static void main (String[] args) {
	    
	    //using class name access the 'static variable';
	    System.out.println(Student.school);
	    
	    //now we commenting all the code below ,hence we prove that this variable is independent 
	    //of object.
	    
	}
}


output: "SGM college karad."