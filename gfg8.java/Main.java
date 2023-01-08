/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		int[] f= new int[k];
		long ans = 0;
		for (int val : arr)
		{
		    val%=k;
		    ans+=(long)f[val];
		    f[val]++;
		}
		return ans;
	
	}
}