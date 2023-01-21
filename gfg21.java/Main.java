/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int bitsA = Integer.bitCount(a);
        int bitsB = Integer.bitCount(b);
        int diff = Math.abs(bitsA-bitsB);
        
        if(diff == 0)  return a;
        else if(bitsA>bitsB)
        {
            while(diff >0)
            {
                a=a&(a-1);
                diff--;
            }
        }
        else{
            while(diff>0)
            {
                a=a|(a+1);
                diff--;
            }
        }
        return a;
    }
}