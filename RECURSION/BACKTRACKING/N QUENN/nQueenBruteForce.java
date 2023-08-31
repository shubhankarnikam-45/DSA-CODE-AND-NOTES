import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
    printNQueens(chess, "", 0);
    }
    
    //for left diagonal.
    public static boolean forLeftDiagoanal(int chess[][],int row,int col)
    {
      //true means find else not find(false)
      if(col==-1|| row==-1)
      {
        return false;
      }

      if(chess[row][col]==1)
      {
        return true;
      }
      
      
      return forLeftDiagoanal(chess,row-1,col-1);
    
      
    } 
    
    //for right diagoanl.
     public static boolean forUpper(int chess[][],int row,int col)
    {
      //true means find else not find(false)
      if(row==-1)
      {
        return false;
      }

      if(chess[row][col]==1)
      {
        return true;
      }
      
      
      return forUpper(chess,row-1,col);
    
      
    }
    
    //for right diagonal.
     public static boolean forRightDiagoanal(int chess[][],int row,int col)
    {
      //true means find else not find(false)
      if(row==-1 || col==chess[0].length)
      {
        return false;
      }

      //this is when we find the quenn.
      //and this is not valid path
      if(chess[row][col]==1)
      {
        return true;
      }
      
      
      return forRightDiagoanal(chess,row-1,col+1);
    
      
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        
        //base case.
        if(row==chess.length)
        {
          System.out.println(qsf);
          return;
        }
        
        
        for(int i=0;i<chess[0].length;i++)
        {
           //now we going to the left diagornal.
           if(!forLeftDiagoanal(chess,row,i))
           {
             
             if(!forUpper(chess,row,i))
             {
               if(!forRightDiagoanal(chess,row,i))
               {
                 //this is sign of we at given row and columnn
                  chess[row][i]=1;
                  
                  printNQueens(chess,qsf+row+"-"+i+",",row+1);
                  
                  chess[row][i]=0;
                  
               }
             }
             
           }
           
           
        }
    }
}