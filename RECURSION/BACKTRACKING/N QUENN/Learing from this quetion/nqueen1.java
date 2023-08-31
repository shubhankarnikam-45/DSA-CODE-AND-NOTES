import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int [][]chess=new int[n][n];
        
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
       
       if(row==chess.length)
       {
         System.out.println(qsf);
         return;
       }
       
       //before(LEFT) node 
       for(int col=0;col<chess.length;col++)
       {
        //left edge.
         chess[row][col]=1;

         //middle of left and right node.
         printNQueens(chess,qsf+row+"-"+col+", ",row+1);

         //right edge.
         chess[row][col]=0;
       }

       //after (RIGHT)node.

    }
}