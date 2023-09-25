import java.util.*;

public class Main {
    
     static char MaximumFrequencyChar(String s) {

		 //lenght 
		 int n=s.length();

		 //creaing haspmap TO do operation.
		 HashMap<Character,Integer>hm=new HashMap<>();
		 
		 //max 
		 int max=0;

		 //char that holds the desied character.
		 char res=' ';
		 //traverse throught string.
		 for(int i=0;i<n;i++)
			 {
				 //current character.
				 char ch=s.charAt(i);

				 //if this character is present in the 'HashMap' then increse the count.
				 if(hm.containsKey(ch))
				 {
					 int oldFreq=hm.get(ch);
					 hm.put(ch,oldFreq+1);


					 //this is when we have equal max and get 
                     //this is for maintain the 'lexiographical order'
					 if(max==hm.get(ch))
					 {
						 max=hm.get(ch);
						 if(res>ch)
						 {
							 res=ch;
						 }
					 }

					 
					 if(max<hm.get(ch))
					 {
						 max=hm.get(ch);
						 res=ch;
					 }
				 }
				 else
				 {

					  //this is when we have equal max and get 
					
					 
					 hm.put(ch,1);
					 if(max<hm.get(ch))
					 {
						 max=1;
						 res=ch;
					 }
				 }
			 }

		 //return res;
		 return res;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
    }
}