


static void helper(int st,int n,String path)
{
    //base case.
    //if our stair number is equal to n 
    //then we just print.
    if(st == n)
    {
        System.out.println(path);          //1
        return;
    }

    for(int i=1;i<=3;i++)          //2  
    {
        String curr_path=path;       

        //
        if(st+i<=n)                        //2.1
        {
            curr_path+=Integer.toString(i);
            helper(st+i,n,curr_path);
        }
        else              //2.2
        {
            break;
        }
    }
}


static void printStairPaths(int n,String pathSoFar) {
        
        helper(0,n,"");
    }