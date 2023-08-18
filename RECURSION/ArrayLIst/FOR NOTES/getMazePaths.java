import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {


		//base case.
		if(sr==dr && sc==dc)
		{
			//return ArrayList containing one element which is empty.
			ArrayList<String>bal=new ArrayList<>();
			bal.add("");
			return bal;
		}


		//creating ArrayList to hold the answer.
		ArrayList<String>hpaths=new ArrayList<>();
		ArrayList<String>vpaths=new ArrayList<>();
		
		//here we go horizontal.
		if(sc<dc)
		{
			hpaths=getMazePaths(sr,sc+1,dr,dc);	
		}

		//here we go vertical.
		if(sr<dr)
		{
			vpaths=getMazePaths(sr+1,sc,dr,dc);
		}


		//final result ArrayList.
		ArrayList<String>paths=new ArrayList<>();
		
		//prining which we got from the expectation.
		for(String hpath:hpaths)
			paths.add("h"+hpath);

		//same here.
		for(String vpath:vpaths)
			paths.add("v"+vpath);

		return paths;
		
		
	}
}


                        
                        
                        
                        
                        
                                

                        
                                