import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public int ClimbingStairs(int n) {

        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i = 1;i <= n; i++)
            {
                if(i == 1)
                {
                    dp[i] = dp[i-1];
                }
                else
                {
                    dp[i] = dp[i-1] + dp[i-2];
                }
            }

        return dp[n];

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.ClimbingStairs(n));
    }
}