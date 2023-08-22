

//before that must see the 'parttion algorithm'

class Solution{
	static void quickSort(int[] arr,int low,int high){

		//base case.
		if(low>=high)
			return;

		//this is pivot  element which is present at the last of array.
		int pivotElement=arr[high];

		//here we got the pivot index.
		int pivotIndex=partition(arr,low,high,pivotElement);

		//for example.
		// [10,20,30,40,50]
		//pivotElement==>30   index==2

		//left array: [10,20]     index 0--1
		//right array: [40,50]    index 3--4
		//this forms EULER TOUR.

		//left array: [10,20]     index 0--1
		quickSort(arr,low,pivotIndex-1);

		
		//left array: [10,20]     index 0--1
		quickSort(arr,pivotIndex+1,high);

		
		
    }

	//code for partitioning.
	static int partition(int arr[],int low,int high,int pivot)
	{
		int i=low;
		int j=low;

		//here we implement the partitioning algorithm.
		while(i<=high)
			{
				if(arr[i]<=pivot)
				{
					swap(arr,i,j);
					i++;
					j++;
				}
				else
				{
					i++;
				}
			}

		return j-1;
	}


	//code for swap function.
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
}



public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr,0,arr.length-1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}