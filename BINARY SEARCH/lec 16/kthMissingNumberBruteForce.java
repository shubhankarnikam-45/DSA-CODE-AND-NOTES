import java.util.Scanner;

class Solution{
    public static int findKthPositive(int[] arr, int k) {

		//length
		int n=arr.length;

		//low
		int low=0;
		//high
		int high=n-1;

		//binary search.
		while(low<=high)
			{
				//middle value.
				int mid=(low+(high-low)/2);

				int missing=arr[mid]-(mid+1);

				if(missing<k)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}

		//return 
		return low+k;
		
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(Solution.findKthPositive(array, k));
        scanner.close();
    }
}
