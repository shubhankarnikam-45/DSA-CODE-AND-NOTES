//this is optimized version.
//we furthur optimized.
//this i see the solution as i see the 'class implementation'  first time.


class StockSpanner {

    //creaing class that hold the 'price' and 'index'
    class Pair
    {
        int price;
        int index;

        //constructor.
        Pair(int p,int i)
        {
            price=p;
            index=i;
        }
    }

    //stack of int
    Stack<Pair>st;

    
    //int time
    int time=0;

    public StockSpanner() {
       
        //initialize.
        st=new Stack<Pair>();

        //first time we include the 'price' as 10^6 (see constraint)
        //and 'index' is -1
        Pair base =new Pair(1000000,-1);

        st.push(base);
    }
    
    public int next(int price) {
        
        Pair p=new Pair(price,time);
        time++;

        while(p.price>=st.peek().price)
        {
            st.pop();
        }

        int stockSpan=p.index-st.peek().index;

        //push
        st.push(p);

        return stockSpan;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */