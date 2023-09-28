import java.io.*;
import java.util.*;

class Solution {

	TreeMap<String,Integer>tmap=new TreeMap<>();

	//using recursion find the frequency of employee under manager.
	public int recursion(String startingEmployee,Map<String, String> emp)
	{
		int frequencyOfEmp=0;
		
		for(String currentEmployee:emp.keySet())
			{
				
				if(emp.get(currentEmployee).equals(startingEmployee) && !currentEmployee.equals(startingEmployee) )
				{
					frequencyOfEmp++;
					//in if second condition for the 'ceo reporting to the ourself'
					int answer=recursion(currentEmployee,emp);
					frequencyOfEmp=frequencyOfEmp+answer;
				}
			}

		tmap.put(startingEmployee,frequencyOfEmp);
		return frequencyOfEmp;
	}
    public void EmpUnderManager(Map<String, String> emp)
	{
		//finding the CEO
		String CEO="";

		for(String e:emp.keySet())
			{
				if(e.equals(emp.get(e)))
				{
					CEO=e;
					break;
				}
			}

		//using recursion finding the frequency.
		recursion(CEO,emp);
		//print
		//using for each loop we can print.
		for(String key:tmap.keySet())
			{
				System.out.println(key+" "+tmap.get(key));
			}
		
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String,String> emp = new HashMap<String, String>();
        for(int i=0;i<n;++i){
			emp.put(sc.next(),sc.next());
        }
        Solution Obj = new Solution();
        Obj.EmpUnderManager(emp); 
    }
}