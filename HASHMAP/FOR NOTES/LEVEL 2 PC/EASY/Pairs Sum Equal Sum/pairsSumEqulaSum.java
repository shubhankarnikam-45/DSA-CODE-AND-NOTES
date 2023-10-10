import java.util.*;

public class Main {

    public static boolean solution(int[] arr) {
        
        //crating hashset to do operation.
        HashSet<Integer>hset=new HashSet<>();
        
        //traversing to find th pair.
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(hset.contains(sum))
                {
                    //we found the pair
                    return true;
                }
                else
                {
                    hset.add(sum);
                }
            }
        }
        
        
        //means we not found the pair
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
