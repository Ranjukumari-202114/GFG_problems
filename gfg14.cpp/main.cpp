/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

class Solution{
public:
  vector<int> maximumToys(int n,vector<int> ar,int Q,vector<vector<int>> qry){
      // code here
      vector<int>ans(Q);
      int temp[n];
      for(int i = 0 ; i < n ; i++) temp[i] = ar[i];
      sort(temp , temp + n);
      long pre[n];
      pre[0] = temp[0];
      for(int i = 1 ; i < n ; i++)
      pre[i] = pre[i - 1] + temp[i];
      for(int i = 0 ; i < Q ; i++)
      {
          long s = qry[i][0];
          int cnt , ind;
          ind = upper_bound(pre , pre + n , s) - pre;
          ind--;
          if(ind < 0)
          {
              ans[i] = 0;
              continue;
          }
          cnt = ind + 1;
          s -= pre[ind];
          ind++;
          vector<bool>vis(n , 0);
          int k = qry[i][1] , j = 2;
          while(k--)
          {
              long num = ar[qry[i][j] - 1];
              j++;
              
              int pos = lower_bound(temp , temp + n , num) - temp;
              while(pos < n && vis[pos]) pos++;
              vis[pos] = 1;
              if(pos < ind)
              {
                  s += temp[pos];
                  cnt--;
              }
              
              while(ind < n && vis[ind]) ind++;
              if(ind < n && s >= temp[ind])
              {
                  s -= temp[ind];
                  ind++;
                  cnt++;
              }
          }
          ans[i] = cnt;
      }
      return ans;
  }
};
