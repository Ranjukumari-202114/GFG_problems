/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int removeStudents(int[] H, int N) {
        // code here
        int LIS = lengthOFLIS(H);
        return N-LIS;
    }
    
    public static int lengthOFLIS(int[] H)
    {
        int[] a = new int[H.length+1];
        Arrays.fill(a,Integer.MAX_VALUE);
        a[0] = Integer.MIN_VALUE;
        for(int h : H){
            int idx = searchLess(a,h);
            a[idx+1] = h;
        }
        for(int i = a.length-1;i>=0;i--) if(a[i] != Integer.MAX_VALUE) return i;
        return 0;
        
    }
    
    public static int searchLess(int[] a,int n)
    {
        int lo = 0,hi = a.length-1,ans = 0;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(a[mid]<n)
            {
                lo = mid+1;
                ans = Math.max(ans,mid);
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
};