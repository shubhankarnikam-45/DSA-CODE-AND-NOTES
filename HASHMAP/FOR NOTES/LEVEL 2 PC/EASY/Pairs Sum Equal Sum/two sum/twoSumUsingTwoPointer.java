import java.util.*;

public class Main {

    public static List<List<Integer>> twoSum(int[] arr, int target) {

		//first we have to sort array.
		Arrays.sort(arr);
		
		//creatign ArraList that used to return answer
		List<List<Integer>>ans=new ArrayList<>();
		
		//length
		int n=arr.length;
		//crating two pointer for startIndex and for the lastIndex.
		int startIndex=0;
		int lastIndex=n-1;

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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<List<Integer>> res = twoSum(arr, target);
        ArrayList<String> finalResult = new ArrayList<>();
        for (List<Integer> list : res) {
            Collections.sort(list);
            String ans = "";
            for (int val : list) {
              ans += val + " ";
            }
            finalResult.add(ans);
        }
        Collections.sort(finalResult);
        for (String str : finalResult) {
            System.out.println(str);
        }
    }
}