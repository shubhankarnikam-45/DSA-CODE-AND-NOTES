import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }





        // bubble sort in descending order
        bubbleSort(N, arr);
        // printing array elements
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }







	//function for swap
	private static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}







	//if small then ===> true
	// else false
	//function for comparision.
	private static boolean isSmaller(int arr[],int i,int j)
	{
		if(arr[i]<arr[j])
		{
			return true;
		}
		else
		{
			return false;
		}
	}






    public static void bubbleSort(int n, int[] arr) {

		for(int itr=1;itr<=n-1;itr++)
			{
				for(int j=0;j<n-itr;j++)
					{
						if(isSmaller(arr,j+1,j))
						{
							//here we know only answer that arr(j+1) is greater than arr(j) or not.
							swap(arr,j+1,j);
						}
					}
			}
		
    }
}