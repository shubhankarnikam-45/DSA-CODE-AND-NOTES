//this is first quetion when we see in BACKTRACKING.
//this i see viedo this is for the learning purpoes.

//now i am not focus on the time and space complexity.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        
        boolean visited[][]=new boolean[n][m];
        floodfill(arr, 0, 0, "",visited);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int row, int col, String asf,boolean[][]visited) {
    
      //this is base case in backtracking algorithm.
      if(row<0 || col<0 || row==maze.length || col==maze[0].length || visited[row][col]==true ||
       maze[row][col]==1)
      {
        return;
      }
      
      //this means we are at desired position.
      //then we just print the result.
      if(row==maze.length-1 &&  col==maze[0].length-1)
      {
        System.out.println(asf);
        return;
      }
      
      //due to this we not stuck in loop.
      visited[row][col]=true;
      
      //this is for top.
      floodfill(maze,row-1,col,asf+"t",visited);
      
      //this for the left.
      floodfill(maze,row,col-1,asf+"l",visited);
      
      //this is for the down.
      floodfill(maze,row+1,col,asf+"d",visited);
      
      //this is for the right.
      floodfill(maze,row,col+1,asf+"r",visited);
      
      //now we make each to be TRUE make it as FALSE.
      //for finding many paths.
      //due to this we stuck in loop.
      visited[row][col]=false;
      
    }
}
