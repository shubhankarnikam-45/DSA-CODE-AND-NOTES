//pepcoding

import java.util.*;

public class Main {
    public static int[] SelectionSort(int[] arr) {

		for(int i=0;i<arr.length-1;i++)
			{
				int min=i;

				for(int j=i+1;j<arr.length;j++)
					{
						if(isSmaller(arr,min,j))
						{
							min=j;
						}
					}

				//swap
				swap(arr,i,min);
			}

		//return 
		return arr;
    }

	//fundtion to check the smaller element
	public static boolean isSmaller(int arr[],int i,int j)
	{
		if(arr[j]<arr[i])
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}

	//fuction to swap the element.
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}