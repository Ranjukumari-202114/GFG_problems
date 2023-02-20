/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


Count Cyclic Paths




class Solution{
	public static int countPaths(int N){
		//code here
		 if(N==1)
         return 0;

       long mod=1000000007;
       long curr=3, prev=0;
        for(int i=3;i<=N;i++)
          {

               long temp=curr;
               curr=(curr*2+prev*3) %mod;
               prev=temp;
           } 
        return (int)(curr);
	}
}