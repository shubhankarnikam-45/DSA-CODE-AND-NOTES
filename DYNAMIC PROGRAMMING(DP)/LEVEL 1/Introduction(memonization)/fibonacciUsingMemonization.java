import java.io.*;
import java.util.*;
public class Main {
    public static int fib(int n, int memo[]){

         if(n == 0 || n == 1)
            return n;

        if(memo[n] != 0)
        {
            return memo[n];
        }

        int fnm1 = fib(n-1,memo);
        int fnm2 = fib(n-2,memo);

        int ff =  fnm1 + fnm2;

        memo[n] =ff;
        

        return ff;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //creating array of size n+1 for memonization in DP
        int memo[] = new int[n+1];
        System.out.println(fib(n,memo));
    }
}