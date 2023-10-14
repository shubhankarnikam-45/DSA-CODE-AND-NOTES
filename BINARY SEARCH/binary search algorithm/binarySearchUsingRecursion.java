import java.util.*;

public class Main {

	//recursive code
	public static int helper(int arr[],int low,int high,int target)
	{
		//base case.
		if(low>high)
		{
			return -1;
		}

		//expectation
		int mid=(low+high)/2;

		if(arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]<target)
		{
			return helper(arr,mid+1,high,target);		
		}
		else
		{
			return helper(arr,low,mid-1,target);
		}
		
		
	}
	
    public static int findIndex(int key, int[] arr) {

		//recursive code.
		return helper(arr,0,arr.length-1,key);

		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findIndex(key, arr));
        sc.close();
    }
}