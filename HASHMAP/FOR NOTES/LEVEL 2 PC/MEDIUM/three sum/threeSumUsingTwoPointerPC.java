import java.io.*;
import java.util.*;



class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(nums);
        //Sort all lists inside the list first
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i));
        }
        //Sort the list
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i)) return -1;
                    else if (l1.get(i) > l2.get(i)) return 1;
                }
                return 0;
            }
        });
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Solution {

	public static void createResult(List<List<Integer>>ans,List<List<Integer>>smallList,int ele)
	{
		for(List<Integer> val:smallList)
			{
						val.add(0,ele);
						ans.add(val);
			}
	}

	//for three sum we required the two sum
	public static List<List<Integer>> twoSum(int[] arr, int target,int startIndex,int lastIndex) {

		//first we have to sort array.
		Arrays.sort(arr);
		
		//creatign ArraList that used to return answer
		List<List<Integer>>ans=new ArrayList<>();
		
		//length
		int n=arr.length;
		//crating two pointer for startIndex and for the lastIndex.
		// int startIndex=0;
		// int lastIndex=n-1;

		while(startIndex<lastIndex)
			{
				int req=arr[startIndex]+arr[lastIndex];
				if(target < req)
				{
					lastIndex--;
				}
				else if(target>req)
				{
					startIndex++;
				}
				else
				{
					//we at required Index.
					ans.add(new ArrayList(Arrays.asList(arr[startIndex],arr[lastIndex])));

					//another way
					// ArrayList<Integer>al=new ArrayList<>();
					// al.add(arr[startIndex]);
					// al.add(arr[lastIndex]);
					// ans.add(al);
					// System.out.println(ans);

					startIndex++;
					lastIndex--;

					//for duplicate elements
					while(startIndex<lastIndex && arr[startIndex]==arr[startIndex-1])
						{
							startIndex++;
						}

					while(startIndex<lastIndex && arr[lastIndex]==arr[lastIndex+1])
						{
							lastIndex--;
						}
				}
			}


		//return answer.
		return ans;
    }
	
    public List<List<Integer>> threeSum(int[] arr) {

		//sort array.
		Arrays.sort(arr);
		
		//this holds the final answer.
		List<List<Integer>>ans=new ArrayList<>();

		//start index.
		int startIndex=0;

		//end index
		int lastIndex=arr.length-1;
		
		//for three sum we use the aproach of two sum
		for(int i=startIndex;i<=lastIndex;i++)
			{
				if(i!=startIndex && arr[i]==arr[i-1] )
				{
					continue;
				}
				List<List<Integer>>smallList=twoSum(arr,0-arr[i],i+1,lastIndex);
				createResult(ans,smallList,arr[i]);
			}


		return ans;
    }
}