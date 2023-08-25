/*package whatever //do not write package name here */

import java.io.*;

//creating class student.
class Student
{
  String name;
  int reg;
}

class GFG {
	public static void main (String[] args) {
		 ///creating object of class Student.
      Student s=new Student();
      
      //now we assigning the name to the name in object.
      s.name="shubhankar";
      
      //now we assign the registration number.
      s.reg=1;
      
      System.out.println("name "+s.name);
      System.out.println("registration number"+s.reg);
      
      //here we create array of student.
    //   Student arr[]=new Student[5];
    
    //how to print the address of object.
    System.out.println("address"+s);
      
      
	}
}