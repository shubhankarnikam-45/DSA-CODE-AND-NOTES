
//CLASS VARIABLES.
//static keywords.

//class variable change by all object of same class.

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
		 ///creating object of class Student.
      Student s1=new Student();
    
      //print 
      System.out.println(s1.school);
      
      //now we change the school using second object.
      Student s2=new Student();
      
       //now we change the 'class variable'
      s2.school="YSPM,satara";
      
      
      //print second object 'school'data.
      System.out.println(s2.school);
     
      
      
      
      
	}
}