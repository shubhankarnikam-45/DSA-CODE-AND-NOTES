
//must see the notes for beter understanding.

import java.util.*;

public class Main
{
  public static class Pair
  {
    int a=0;
    String s="";
    
    public Pair(int a,String s)
    {
      this.a=a;
      this.s=s;
    }
    
    //.hashCode() is Override
    @Override
    public int hashCode()
    {
      return this.a %29;
    }
    
    //.equals() method.
    @Override
    public boolean equals(Object obj)
    {
      //handle null case 
      if(obj==null)
        return false;
        
      //converting this obj object to the our Pair Object.
      Pair o=(Pair)obj;
    
      if(this.a !=o.a)
        return false;
        
      if(!this.s.equals(o.s))
        return false;
      
      //return true.
      return true;
    }
    
    //overidding the toSting() func
    @Override
    public String toString()
    {
      return "("+this.a+" , "+this.s+")";
    }
  }
  public static void main(String[]args)
  {
    //Hashmap
    HashMap<Pair,Integer>hmap=new HashMap<>();
    
    for(int i=0;i<5;i++)
    {
      //creaing object of Pair class.
      Pair p=new Pair(10,"nikam");
      
      hmap.put(p,hmap.getOrDefault(p,0)+1);
      
    }
    
    //print size()
    System.out.println(hmap.size());
    
    System.out.println(hmap);
    
  }
}