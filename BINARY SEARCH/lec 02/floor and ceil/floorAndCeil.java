import java.util.*;

public class Main {

	//function to find the floor.
    public static int findFloor(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;

        //variable that holds the answer.
        int ans=-1;
        while(low<=high)
        {
            //middle value
            int mid=(low+high)/2;

            if(arr[mid]<=x)
            {
                ans=arr[mid];
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return ans;
    }

	
	 //function to find the ceil.
    public static int findCeil(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;

        //to hold the answer.
        int ans=-1;

        while(low<=high)
        {
            //middle value.
            int mid=(low+high)/2;

            if(arr[mid]>=x)
            {
                ans=arr[mid];
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return ans;
    }
    public static int[] floorAndCeil(int x, int[] arr) {

		//lenght
		int n=arr.length;
		int lowerBound=findFloor(arr,n,x);
        int upperBound=findCeil(arr,n,x); 

		int ans[]=new int[2];
		ans[0]=lowerBound;
		ans[1]=upperBound;

		return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] result = floorAndCeil(key, arr);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
}