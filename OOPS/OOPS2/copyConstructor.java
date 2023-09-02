
//CLASS VARIABLES.
//static keywords.



import java.io.*;

//creating class student.
class Student
{
    //instance variables.
    String name;
    int reg; 
    
   
    
    //parameterized contructor.
    Student(String name,int reg)
    {
        //hrere this is used then we know how this working.
        this.name=name;
        this.reg=reg;
    }
    
   
   //copy contructor.
   Student(Student s)
   {
       this.name=s.name;
       this.reg=s.reg;
   }
    
    
    

    
}

class GFG {
	public static void main (String[] args) {
	    
	    
	    Student s1=new Student("shubhankar",51);
	    Student s2=new Student(s1);
	    
	    System.out.println(s2.name+" "+s2.reg);
	    
	    
	    
	    
	    
	    
	}
}


// output: shubhankar 51