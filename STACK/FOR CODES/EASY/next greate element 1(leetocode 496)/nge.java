//here i solved using the brute forece apraoch 
//must see the second apraoch given below.


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        //first we find the next greater element in the second array.

        //creating array of size num2.length for stroing the second nge 
    //     int nge[]=new int[nums2.length];

    //     //now creating the array to store the result.
    //     int result[]=new int[nums1.length];

    //     //creating stack to do operation.
    //     Stack<Integer>st=new Stack<>();

    //     //the last element in 'num2' has not 'nge'
    //     nge[nums2.length-1]=-1;

    //     //pushing in stack.
    //     st.push(nums2[nums2.length-1]);


    //     //loop to find the 'nge'
    //     for(int i=nums2.length-2;i>=0;i--)
    //     {
    //       while(st.size()>0 && nums2[i]>st.peek())
    //       {
    //         st.pop();
    //       }

    //       if(st.size()==0)
    //       {
    //         nge[i]=-1;
    //       }
    //       else
    //       {
    //         nge[i]=st.peek();
    //       }

    //       st.push(nums2[i]);
    //     }


    //   for(int i=0;i<nums1.length;i++)
    //   {
    //     int element=nums1[i];

    //     //find element in 'nge' array.
    //     for(int j=0;j<nums2.length;j++)
    //     {
    //       if(nums2[j]==element)
    //       {
    //         result[i]=nge[j];
    //         break;
    //       }
    //     }
    //   }


    //   //return the result.
    //   return result;



    //tc O(n) code.
    
    //haspmap.
    HashMap<Integer,Integer>hm=new HashMap<>();

    //stack 
    Stack<Integer>st=new Stack<>();

    //here we store the 'nge' in the hashmap.
    for(int num:nums2)
    {

        while(st.size()>0 && st.peek()<num)
        {
            hm.put(st.pop(),num);
        }

        st.push(num);
    }

    for(int i=0;i<nums1.length;i++)
    {
        nums1[i]=hm.getOrDefault(nums1[i],-1);
    }


    return nums1;





    }
}