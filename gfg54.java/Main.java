/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/





//Unique Paths in a Grid



//User function Template for Java

class Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        // code here
        
        long M = 1000000007;
        long[][] dp = new long[n][m];
        
        for(int i=0; i<m; i++) {
            if(grid[0][i] == 0) break;
            dp[0][i] = grid[0][i];
        }
        for(int i=0; i<n; i++) {
            if(grid[i][0] == 0) break;
            dp[i][0] = grid[i][0];
        }
        //base case
        if(grid[0][0] == 0 || grid[n-1][m-1] == 0) return 0;
        
        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                if(grid[i][j] != 0){
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % M;
                }
            }
        }
        return (int) dp[n-1][m-1]; 
    }
    
};