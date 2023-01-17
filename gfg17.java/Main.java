/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    int max;
    int ans;
    int maxGCD(Node root) {
        // code here 
        max = 0;
        ans = 0;
        pre(root);
        return ans;
        
    }
    void pre(Node root)
    {
        if(root == null)
        {
            return ;
        }
        if(root.left != null && root.right != null)
        {
            int k = gcd(root.left.data,root.right.data);
            if(k>max)
            {
                max = k;
                ans = root.data;
            }
            else if(k==max){
                ans = Math.max(root.data,ans);
            }
        }
        pre(root.left);
        pre(root.right);
    }
    int gcd(int a,int b){
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
 }
   
