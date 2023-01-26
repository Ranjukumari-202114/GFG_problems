/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

class Solution
{
    public:
    //Function to perform case-specific sorting of strings.
    string caseSort(string str, int n)
    {
        // your code here
        
        string up = "";
        string lo = "";
        string res = "";
        for(int i = 0;i < n;i++){
            if(str[i] >= 'a' && str[i] <= 'z')
                lo += str[i];
            else
                up+= str[i];
        }
        sort(up.begin(),up.end());
        sort(lo.begin(),lo.end());
        int u = 0;
        int l = 0;
        for(int i = 0;i < n;i++){
            if(str[i] >= 'a' && str[i] <= 'z')
                res += lo[l++];
            else
                res += up[u++];
        }
        return res;
    }
};