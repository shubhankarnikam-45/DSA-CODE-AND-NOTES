//this code is not optimal one.
//this aproach pc.

import java.util.*;

public class Main {

    public static long DistinctCharacterSubstring(String s){

		//length 
		int n=s.length();
		
		//creating two variable i and j for traverse.
		int i=-1;
		int j=-1;

		//creating hashmap to store the frequency of character.
		HashMap<Character,Integer>hmap=new HashMap<>();

		//creaing ans varable to store the answer.
		int ans=0;

		//creaing two boolean varible to break outer loop.
		boolean f1=false;
		boolean f2=false;

		//outer loop
		while(true)
			{
				//each time f1 and f2 is false
				f1=false;
				f2=false;
				
				while(i<n-1)
					{
						//f1 mark is as true.
						f1=true;
						
						//increase i
						i++;

						//current character.
						char ch=s.charAt(i);

						//addded this character in hashmap.
						hmap.put(ch,hmap.getOrDefault(ch,0)+1);

						if(hmap.get(ch)==2)
						{
							//this become invalid to make valid we break the inner loop.
							break;
						}
						else
						{
							//find the no of subarray.
							ans+=i-j;
						}
					}

				while(j<i)
					{
						//f2 mark is as true.
						f2=true;
						
						//increse j
						j++;

						//current character.
						char ch=s.charAt(j);

						//decrese the frequency of currnet character.
						hmap.put(ch,hmap.get(ch)-1);

						if(hmap.get(ch)==1)
						{
							ans+=i-j;
							break;
						}
					}

				//if this two boolena variable is false then we found the desired result we just break.
				if(f1==false && f2==false)
				{
					break;
				}
			}


		return ans;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long ans = DistinctCharacterSubstring(s);
        System.out.println(ans);
    }
}
