
//CLASS VARIABLES.
//static keywords.



import java.io.*;

//creating class student.
class Student
{
    //class variables.
    static String school="SGM college karad.";

    //static varible can call using the static  method.
    public  static void set_school(String school)
    {
        //impt
        Student.school=school;
    }

    //instance variables.
    String name;
    int reg;
}

class GFG {
	public static void main (String[] args) {
	    
	    
	    //using class name access the 'static method.'
	    Student.set_school("YSPM,satara");
	    
	    //print
	    System.out.println(Student.school);
	    
	    
	}
}


// output: "YSPM,satara"