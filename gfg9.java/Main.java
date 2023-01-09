/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    int solve(int N, int[] A) {
        // code here
        for(int i=N-1;i>=0;i--)
        {
            A[i]+=1;
            if(A[i]>9)
            {
                A[i]-= 10;
                if(i>0)
                {
                    A[i-1]+=1;
                }
            }else
            {
              return i+1;
            }
             
        }
        return -1;
    }
};