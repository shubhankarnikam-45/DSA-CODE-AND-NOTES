



import java.io.*;

//creating class student.
class Student
{
    //instance variables.
    String name;
    int reg; 
    
    //class variables.
    static String school="SGM college karad.";

    //default contructor
    Student()
    {
        
    }
    
    //parameterized contructor.
    Student(String name,int reg)
    {
        //hrere this is used then we know how this working.
        this.name=name;
        this.reg=reg;
    }
    
    
    public void fun(double a,double b)
    {
        System.out.println("inside the double");
        System.out.println(a+b);
    }
    
    public void fun(float a,float b)
    {
        System.out.println("inside the float");
        System.out.println(a+b);
    }
    
    
    

    
}

class GFG {
	public static void main (String[] args) {
	    
	    
	    Student s1=new Student();
	    s1.fun(1.0,3.0);
	    
	    
	    
	    
	    
	}
}


// output: "YSPM,sa"