/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        Arrays.sort(arr);
        PriorityQueue<Long> queue = new PriorityQueue();
        for (long x : arr)
        {
            queue.add(x);
        }
        long ans = 0;
        while(queue.size()>1)
        {
           long a = queue.poll();
           long b = queue.poll();
           long sum = a+b;
           queue.add(sum);
           ans = ans + sum; 
        }
        return ans;
    }
}