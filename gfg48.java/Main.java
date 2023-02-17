/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Is it Fibonacci  problem

class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
        if(N<=K)
        {
            return GeekNum.get(N-1);
        }
        
        long count =0;
        
        long[] sum = new long[N];
        
       for(int i=0; i<K; i++)
       {
           sum[i] = GeekNum.get(i);
           count = count+sum[i];
       }
       
       
       
       for(int i=K ; i<N; i++)
       {
           sum[i] = count;
           count = count + sum[i] - sum[i-K];
       }
       
       return sum[N-1];
    }
}
