//this code solved by me and i use the algorithm of // SmallestSubstringOfAStringContainingAllCharactersOfAnotherString
//which is hard level

//tc and space compleixity is nearly same as last quetinn(above quetin.)
import java.util.*;

public class Main {

    public static String DistinctWindow(String s){

		//length of string.
		int n=s.length();
		
		//creating HashSet for storing unique character.
		HashSet<Character>hset1=new HashSet<>();

		//storing unique frequecy of character in hashset.
		for(int i=0;i<n;i++)
			{
				char ch=s.charAt(i);
				hset1.add(ch);
			}

		//creaing two variable i and j
		//this acts as two pointer.
		int i=-1;
		int j=-1;

		//creaing two variable 
		int matchCount=0;
		int desiredCount=hset1.size();

		//creaing HashMap for our operation.
		HashMap<Character,Integer>hmap=new HashMap<>();

		//crating string that holds the final answer.
		String ans="";

		while(true)
			{
				//creating two boolean varibles 
				//for breaking the outer for loop.
				boolean f1=false;
				boolean f2=false;
				while(i<n-1 && matchCount<desiredCount)
					{
						//increse the count of i
						i++;
						
						//current character
						char ch=s.charAt(i);

						//adding frequnecy of this character in HashMap not HashSet.
						hmap.put(ch,hmap.getOrDefault(ch,0)+1);

						if(hmap.get(ch)==1 && hset1.contains(ch))
						{
							matchCount++;
						}

						//making f1 true
						f1=true;
					}

				//this is for pring answer and release.
				while(j<i && matchCount==desiredCount)
					{
						//finding the substring.
						String potString=s.substring(j+1,i+1);
						
						//finding anawer by comparing.
						if(ans.length()==0 || ans.length()>potString.length())
						{
							ans=potString;
						}
						
						//increase the count of j
						j++;

						//current character.
						char ch =s.charAt(j);

						//if frequency of this character is 1 then remove from the hashSet and 
						//decrese the count of matchCount--.
						if(hmap.getOrDefault(ch,0)==1)
						{
							hmap.remove(ch);
							matchCount--;
						}
						else
						{
							hmap.put(ch,hmap.get(ch)-1);
						}

						//making f2 true.
						f2=true;
					}

				//if f1 and f2 is false means we not reach at this two looop and we break.
				if(f1==false && f2==false)
				{
					break;
				}
				
			}

		//return answer string.
		return ans;

		
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = DistinctWindow(s);
        System.out.println(ans);
    }
}