//article must read from pepcoding.









import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    //stack for 'operand'
    Stack<Integer>operand=new Stack<>();
    
    //stack for 'operator'
    Stack<Character>operator=new Stack<>();
    
    
    
    

    for(int i=0;i<exp.length();i++)
    {
        //at ith position is (operator then we added to the 'operator stack')
        
        //extracting the character.
        char ch=exp.charAt(i);
        
        if(Character.isDigit(ch))
        {
            operand.push(ch-'0');     //'1'==1
        }
        else if(ch=='(')
        {
            operator.push('(');
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
          while(operator.size()>0 && operator.peek()!='(' && 
          
          precedence(ch)<=precedence(operator.peek())
          )
          {
                int v2=operand.pop();
                int v1=operand.pop();
                
                char op=operator.pop();
                
                int result=operation(v1,v2,op);
                
                operand.push(result);
          }
          
          operator.push(ch);
        }
        else if(ch==')')
        {
            while(operator.size()>0 && operator.peek()!='(')
            {
                int v2=operand.pop();
                int v1=operand.pop();
                
                char op=operator.pop();
                
                int result=operation(v1,v2,op);
                
                operand.push(result);
            }
            
            //at end we pop() the '('
            operator.pop();
        }
       
        
    }
    
    while(operator.size()>0)
    {
        int v2=operand.pop();
        int v1=operand.pop();
        
        char op=operator.pop();
        
        int result=operation(v1,v2,op);
        operand.push(result);
    }
    
    
    
    int val=operand.pop();
    
    System.out.println(val);
    
    
 }
 
 //this is to find the precedence
 public static int precedence(char ch)
 {
     if(ch=='+')
     {
        return 1; 
     }
     else if(ch=='-')
     {
        return 1;
     }
     else if(ch=='*')
     {
        return 2; 
     }
     else 
     {
        return 2; 
     }
 }
 
 
 
 //this funciton to operation.
 public static int operation(int v1,int v2, char ch)
 {
    if(ch=='+')
     {
        return v1+v2; 
     }
     else if(ch=='-')
     {
        return v1-v2;
     }
     else if(ch=='*')
     {
        return v1*v2; 
     }
     else 
     {
        return v1/v2; 
     } 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}