/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



Fill the Matrix



class Solution
{
	public static int minIteration(int N, int M, int x, int y){
		//code here
		 int ans=Math.max(Math.max(x-1+y-1,x-1+M-y),Math.max(N-x+y-1,N-x+M-y ));
        return ans;
	}
}