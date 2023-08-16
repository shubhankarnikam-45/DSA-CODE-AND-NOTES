

// here the TC and SC is pending .
//this quetion is solved by me :)
//this quetion encounter when i solved the PEPCODING RECURTION problems.

class Main {

	//helper fn.
	static ArrayList<String> helper(String arr[],String str,int idx)
	{
		
		//base case. 
		//when we go out of bound then we print the result in 'str'
		if(idx==arr.length)       //1
		{
			//creating arraylist that to be returned.
			ArrayList<String>alos=new ArrayList<>();
			alos.add(str);
			return alos;
		}

		//arraylist that store the FINAL result.		
		ArrayList<String>result=new ArrayList<String>(); 

		//arraylist that stores the TEMPORARY result.
		ArrayList<String>rresult=new ArrayList<String>();

		
		for(int i=0;i<arr[idx].length();i++)        //2
			{
				String curr_character=str;
				curr_character+=arr[idx].charAt(i);      //3

				rresult=helper(arr,curr_character,idx+1);         //4
				for(String val:rresult)
					result.add(val);
			}
		//returning the result.
		return result;
	}
    static ArrayList <String> OldPhone(int n, int[] keys){

		//creating array of size 'keys.length()'
		int sizeOfArrayKeys=keys.length;
		String arrayOfLetterPresentOnEachKey[]=new String[sizeOfArrayKeys];

		ArrayList<String>al=new ArrayList<>();
		al.add("strng");
		for(int i=0;i<sizeOfArrayKeys;i++)
			{
				if(keys[i]==1)
				{
					arrayOfLetterPresentOnEachKey[i]="ABC";
				}
				else if(keys[i]==2)
				{
					arrayOfLetterPresentOnEachKey[i]="DEF";
				}
				else if(keys[i]==3)
				{
					arrayOfLetterPresentOnEachKey[i]="GHI";
				}
				else if(keys[i]==4)
				{
					arrayOfLetterPresentOnEachKey[i]="JKL";
				}
				else if(keys[i]==5)
				{
					arrayOfLetterPresentOnEachKey[i]="MNO";
				}
				else if(keys[i]==6)
				{
					arrayOfLetterPresentOnEachKey[i]="PQRS";
				}
				else if(keys[i]==7)
				{
					arrayOfLetterPresentOnEachKey[i]="TU";
				}
				else if(keys[i]==8)
				{
					arrayOfLetterPresentOnEachKey[i]="VWX";
				}
				else if(keys[i]==9)
				{
					arrayOfLetterPresentOnEachKey[i]="YZ";
				}

				
			}

		
			al=helper(arrayOfLetterPresentOnEachKey,"",0);
		return al;
    }
	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        ArrayList <String> ans=OldPhone(n,keys);
        for(String i:ans) System.out.print(i+" ");
    }
}