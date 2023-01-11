/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        Arrays.sort(arr);
        long ans = 0;
        int prev = arr[0];
        for(int i=1; i<N; i++)
        {
            if(arr[i] <= prev)
            {
                int old = arr[i];
                arr[i]= prev;
                arr[i]++;
                ans += arr[i]-old;
                
            }
            prev= arr[i];
        }
        return ans;
    }
}