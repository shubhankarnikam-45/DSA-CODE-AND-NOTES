// This variation of variation of the greedy algorithm approach.

// TC: O(N)
// SC: O(1)
//here no stpes because this is new for me and this is code copy from discussion section 
//of leetcode.
import java.util.*;

class Solution {
    public int maxAmount(int[] num) {

	int n=num.length;
	int a = 0;
    int b = 0;
    
    for (int i=0; i<n; i++)
    {
        if (i%2==0)
        {
            a = Math.max(a+num[i], b);
        }
        else
        {
            b = Math.max(a, b+num[i]);
        }
    }
    
    return Math.max(a, b);
    }
}