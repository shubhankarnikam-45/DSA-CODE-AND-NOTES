//in this quetion i learn new concept that how to (sort 2d array.)
//this is new quetion for me




class Solution {
    public int[][] merge(int[][] in) {
        

    Pair pairs[]=new Pair[in.length];

    for(int i=0;i<in.length;i++)
    {
        pairs[i]=new Pair(in[i][0],in[i][1]);
    }

    Arrays.sort(pairs);

    //creating stack to do operation.
    Stack<Pair>st=new Stack<>();

    for(int i=0;i<pairs.length;i++)
    {
        // Pair top=pairs[i];


        if(i==0)
        {
            st.push(pairs[i]);
        }
        else
        {


        Pair top = st.peek();
        if (pairs[i].st > top.et) {
          st.push(pairs[i]);
        } else {
          top.et = Math.max(top.et, pairs[i].et);
          top.st=Math.min(top.st,pairs[i].st);
          
        }
        }
    }


    //resultant stack.
    Stack<Pair>res=new Stack<>();

    while(st.size()>0)
    {
        res.push(st.pop());
    }


    int r[][]=new int[res.size()][2];


    for(int i=0;i<r.length;i++)
    {
        Pair top=res.pop();
        r[i][0]=top.st;
        r[i][1]=top.et;
    }

    return r;
    }


    public class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st,int et)
        {
            this.st=st;
            this.et=et;
        }

        // public int compareTo(Pair other)
        // {
        //     if(this.st!=other.et)
        //     {
        //         return this.st-this.st;
        //     }
        //     else
        //     {
        //         return this.et-this.et;
        //     }
        // }

        public int compareTo(Pair other) {
    if (this.st != other.st) {
        return this.st - other.st;
    } else {
        return this.et - other.et;
    }
}
    }
}