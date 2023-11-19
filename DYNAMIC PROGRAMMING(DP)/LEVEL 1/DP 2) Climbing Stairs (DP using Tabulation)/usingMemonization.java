import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public int ClimbingStairs(int n ,int dp[]) {

        if(n < 0)
        {
            return 0;
        }

        if(n == 0)
        {
            return 1;
        }

        if(dp[n] > 0)
        {
            return dp[n];
        }

        int n1 = ClimbingStairs(n-1, dp);
        int n2 = ClimbingStairs(n-2, dp);
        // int n3 = ClimbingStairs(n-3, dp);

        dp[n] = (n1 + n2 );

        return (n1 + n2);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        int arr[] =new int[n+1];
        System.out.println(Obj.ClimbingStairs(n,arr));
    }
}