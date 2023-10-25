//this question s

import java.util.*;
public class Solution {

    //creating class Pair
    public  static class Pair
    {
        double first;
        int second;
        
        Pair(double first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }

    
    public  static double MinimiseMaxDistance(int []arr, int k){
        //length
    int n=arr.length;
    
    //creating array that stores the no of sections.
    int howMany[]=new int[n-1];
    
    //creating priorit queue.
    PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
    
    //adding consecutive lengths and corresponding index to the priority queue.
    for(int i=0;i<n-1;i++)
    {
        double diff=(arr[i+1]-arr[i]);
        pq.add(new Pair(diff,i));
    }
    
    //now we running loop till k
    for(int gasStations=1;gasStations<=k;gasStations++)
    {
        //we pop the top of priority queue.
        Pair top=pq.poll();
    
        //adding incresed section in the howMany[] arrray.
        howMany[top.second]++;
        
        //now after creating section created length added to the PriorityQueue.
        double lengthReq=(double)howMany[top.second]+1;
        
        //first we find the initial length of the given inserted position.
        double initialLen=(double)arr[top.second+1]-(double)arr[top.second];
        
        //added to the priority queue.
        pq.add(new Pair((initialLen)/lengthReq,top.second));
        
    }
    
    //returning the answer.
    return pq.peek().first;
    
    }
}