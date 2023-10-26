import java.util.*; 
// https://course.acciojob.com/idle?question=254e749a-e849-4851-8086-587c3e683240
class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          

		//we just write code for the merge two sorted array (which we did previously)
		int i=0;
		int j=0;

		int n=nums1.length;
		int m=nums2.length;
		
		int ans[]=new int[n+m];

		int k=0;
		
		while(i<n && j<m)
			{
				if(nums1[i]<nums2[j])
				{
					ans[k]=nums1[i];
					i++;
					k++;
				}
				else
				{
					ans[k]=nums2[j];
					j++;
					k++;
				}
			}
		
		while(i<n)
			{
					ans[k]=nums1[i];
					i++;
					k++;
			}
		while(j<m)
			{
				
					ans[k]=nums2[j];
					j++;
					k++;
				
			}

	


		//length of ans arrya.
		int size=ans.length;

		double median=0;

		if(size%2==1)
		{
			int index=(int)Math.floor(size/2);
			return ans[index];
		}
		else
		{
			int index=(int)(size/2);
			// System.out.println("Ind"+index);
			double a=(ans[index]+ans[index-1])/2.0;
			return a;
		}

		
		
    }
}


public class Main {
    public static void main(String args[]) {
         
         Scanner scn = new Scanner(System.in); 
         int n = scn.nextInt(); 
         int m = scn.nextInt(); 

         int[] nums1 = new int[n]; 
         int[] nums2 = new int[m];  

         for(int i=0; i<n ;i++){
             nums1[i] = scn.nextInt(); 
         } 

         for(int i=0; i<m ;i++){
             nums2[i] = scn.nextInt(); 
         } 
        
         Solution sol = new Solution(); 
         double ans = sol.findMedianSortedArrays(nums1 , nums2); 

         System.out.println(ans); 


    }
}