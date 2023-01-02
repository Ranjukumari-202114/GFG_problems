/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution
{
    public long power(long x, long y, long p) {
        long res = 1l;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public long modInverse(long n, long p) {
        return power(n, p - 2, p);
    }
  
    public int  compute_value(int n)
    {
        // code here
        long ans = 1l;
        long mod = (long)(Math.pow(10, 9) + 7l);
        long compute = 1l;
        for(int i=0;i<n;i++) {
            compute = (compute%mod * (long)(n-i)%mod) % mod;
            compute = (compute%mod * modInverse(i+1, mod)%mod) % mod;
            ans = (ans%mod + (compute%mod*compute%mod)%mod) % mod;
        }
        return (int)(ans%mod);
    }
}