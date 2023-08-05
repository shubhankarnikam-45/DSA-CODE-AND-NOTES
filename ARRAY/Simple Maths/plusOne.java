public int[] plusOne(int[] arr) {

            int n=arr.length;
            for(int i=n-1;i>=0;i--)
            {
                //learn by the // [1,2,3]
                if(arr[i]<9)
                {
                    // [1,2,3]
                    arr[i]++;
                    return arr;
                }
                arr[i]=0;
            }

            //this array for case [9,9,9].
            int brr[]=new int[n+1];
            brr[0]=1;

            return brr;

        }