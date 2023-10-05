
//it's my aproach
import java.util.*;

public class Main {

    public static int longestkSubstr(int n, int k,String s){

		//creaint two poiter for traverse.
		int i=-1;
		int j=-1;

		//creating hashmap to stroring the character and it's frequecy.
		HashMap<Character,Integer>hmap=new HashMap<>();

		//creating two boolean variable for break the outer while() loop.
		boolean f1=false;
		boolean f2=false;

		//this stores the final answer.
		int ans=-1;

		//this for testing 
		int temp=0;

		//traverse.
		while(true)
			{
				f1=false;
				f2=false;

				//aquire
				while(i<n-1)
					{
						f1=true;
						
						//increase i
						i++;

						//current character.
						char ch=s.charAt(i);


						if(!hmap.containsKey(ch) && hmap.size()==k)
						{
							break;
						}

						//put in the hashmap.
						//put this in hashmap
						hmap.put(ch,hmap.getOrDefault(ch,0)+1);
		
						if(hmap.size()==k)
						{
							//find length and compare with global max
							int len=i-j;

							//finding global max
							ans=Math.max(len,ans);

							//increase temp
							temp++;
						}
						
					}

				//second while() loop
				//release
				while(j<i)
					{

						f2=true;
						
						j++;

						
						//current character.
						char ch=s.charAt(j);

						//put in the hashmap.
						//put this in hashmap
						//decrease the frquency of current characte in hashmap
						hmap.put(ch,hmap.getOrDefault(ch,0)-1);

						if(hmap.get(ch)==0)
						{
							hmap.remove(ch);
						}

						//
						if(hmap.size()==k)
						{
							int len=j-i;
							ans=Math.max(len,ans);
						}
						else
						{
							i--;
							break;
							
						}

						
					}


				//if two flag variabnle is false means we done our work.
				if(f1==false && f2==false)
				{
					break;
				}
			}

		return ans;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ans = longestkSubstr(n,k,s);
        System.out.println(ans);
    }
}