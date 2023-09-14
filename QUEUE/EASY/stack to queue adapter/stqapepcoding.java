
//this is the aproach of the pepcoding in which push() operation take the TC O(1).


import java.io.*;
import java.util.*;

public class Main {

  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helper;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helper = new Stack<>();
    }

    int size() {
      return mainS.size();
    }

    void add(int val) {
      
      mainS.push(val);
    }

    int remove() {
      
     if(mainS.size()==0)
      {
          System.out.println("queue underflow");
          return -1;
      }
      else
      {
           while(mainS.size()>1)
            {
                helper.push(mainS.pop());
            }
      
         //now we getting the desired value.
          int val=mainS.pop();
          
          //now again push value to the "mainS"
          while(helper.size()>0)
          {
              mainS.push(helper.pop());
          }
          //return the value.
          return val;
      }
    }

    int peek() {
      
      if(mainS.size()==0)
      {
          System.out.println("queue underflow");
          return -1;
      }
      else
      {
           while(mainS.size()>1)
            {
                helper.push(mainS.pop());
            }
      
          //now we getting the desired value.
          int val=helper.push(mainS.pop());
          
          //now again push value to the "mainS"
          while(helper.size()>0)
          {
              mainS.push(helper.pop());
          }
          //return the value.
          return val;
      }
     
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StackToQueueAdapter qu = new StackToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}