
//CLASS VARIABLES.
//static keywords.



import java.io.*;

//creating class student.
class Student
{
    //class variables.
    static String school="SGM college karad.";

    //static varible can call using the instance method.
    public  void set_school(String school)
    {
        this.school=school;
    }

    //instance variables.
    String name;
    int reg;
}

class GFG {
	public static void main (String[] args) {
	    
	    //using class name access the 'static variable';
        Student s=new Student();

        //using object 's' we can call the 'instance method ' and change the 'static variable content.'
        s.set_school("GC karad");
        
        //print
	    System.out.println(s.school);
	    
	    //now we commenting all the code below ,hence we prove that this variable is independent 
	    //of object.
	    
	}
}


// output: "SGM college karad."